package generics.reflection;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Hashtable;
import java.util.LinkedList;

import org.demo.newjava.NewList;
import org.demo.oldjava.OldList;

public class IsGeneric {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		desc("");
		desc(new Integer(5));
		
		desc( new LinkedList<Integer>() );
		
		LinkedList<? extends Number> list2 = new LinkedList<Integer>();
		desc( list2 );

		LinkedList<? extends Number> list3 = new LinkedList<Float>();
		desc( list3 );
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		desc( ht );
		
		OldList oldlist = new OldList(); 
		desc( oldlist );
		
		NewList<String> newlist = new NewList<String>();
		desc( newlist );
	}
	
	public static void desc(Object o)
	{
		showTypeParameters(o.getClass());
		//showGenericSuperclass(o.getClass());
	}
	
	public static void showTypeParameters(Class<?> clazz)
	{
	    System.out.println("===== Class = " + clazz.toString() + " TYPE PARAMETERS ");
	    
	    // Returns an array of TypeVariable objects that represent the type variables 
	    // declared by the generic declaration represented by this GenericDeclaration object, in declaration order. 
	    // Returns an array of length 0 if the underlying generic declaration declares no type variables. 
	    TypeVariable<?> [] tvArray = clazz.getTypeParameters();
	    System.out.println(" " + tvArray.length + " type parameter(s) ");
	    int i = 0 ;
	    for ( TypeVariable<?> tv : tvArray ) {
	    	System.out.println(" --- param " + i ) ;
	    	System.out.println(" . name " + tv.getName() ) ;
	    	System.out.println(" . generic declaration " + tv.getGenericDeclaration() ) ;
	    	Type[] bounds = tv.getBounds();
		    System.out.println(" . bounds :");
		    for ( Type t : bounds ) {
			    System.out.println("   . " + t );
		    }
	    	i++ ;
	    }
	}
	
	public static void showGenericSuperclass(Class<?> clazz) 
	{
		
	    System.out.println("===== Class = " + clazz.toString() + " GENERIC SUPER CLASS " );

	    // Returns the Type representing the direct superclass of the entity (class, interface, 
	    // primitive type or void) represented by this Class. 
	    Type type = clazz.getGenericSuperclass();
	    //System.out.println(type); // java.util.ArrayList<java.lang.String>
	    System.out.println("Generic Superclass : " + type );
	    if ( type != null ) {
	    	if ( type instanceof ParameterizedType ) 
	    	{
			    System.out.println("ParameterizedType :");
			    ParameterizedType pt = (ParameterizedType) type;
			    
			    System.out.println(" owner type = " + pt.getOwnerType() );
			    System.out.println(" raw type   = " + pt.getRawType() );
			    Type[] tArgs = pt.getActualTypeArguments();
			    for ( Type t : tArgs ) {
				    System.out.println(" actual type argument = " + t );
			    }
	    	}
	    	else if ( type instanceof GenericArrayType ) 
	    	{
			    System.out.println("GenericArrayType :");
	    		GenericArrayType genericArrayType = (GenericArrayType) type;
	    		
	    		Type t = genericArrayType.getGenericComponentType();
			    System.out.println(" type = " + t );
	    	}
	    	else if ( type instanceof WildcardType )  
	    	{
			    System.out.println("WildcardType :");
			    WildcardType wildcardType = (WildcardType) type;
			    
			    Type[] lowerBounds = wildcardType.getLowerBounds() ;
			    System.out.println(" lower bounds :");
			    for ( Type t : lowerBounds ) {
				    System.out.println(" . " + t );
			    }
			    
			    Type[] upperBounds = wildcardType.getUpperBounds();
			    System.out.println(" upper bounds :");
			    for ( Type t : upperBounds ) {
				    System.out.println(" . " + t );
			    }
	    	}
	    	else if ( type instanceof TypeVariable )  
	    	{
			    System.out.println("TypeVariable :");
	    	}
	    	else 
	    	{
		    	System.out.println("Not a generic class type");
	    	}
	    	
	    } else {
	    	System.out.println("No generic super class");
	    }
	}

}
