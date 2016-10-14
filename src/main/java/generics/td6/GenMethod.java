package generics.td6;

public class GenMethod {

	public static boolean isStrIn ( String obj, String[] array )
	{
		for ( int i = 0 ; i < array.length ; i ++ )
		{
			if ( obj.equals( array[i])) return true ;
		}
		return false ;
	}
	
	public static boolean isObjIn ( Object obj, Object[] array )
	{
		for ( int i = 0 ; i < array.length ; i ++ )
		{
			if ( obj.equals( array[i])) return true ;
		}
		return false ;
	}
	
	// Ou inversion TItem, TArray ?
	public static <TArray, TItem extends TArray> boolean isIn ( TItem obj, TArray[] array )
	//public static <T> boolean isIn ( T obj, T[] array )
	{
		for ( int i = 0 ; i < array.length ; i ++ )
		{
			if ( obj.equals( array[i])) return true ; 
			// NB : "equals" just for illustration 
			// (non reliable for different types of "Numbers" ) 
		}
		return false ;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		compareNumbers ();
		
		Number  numbers[]  = { 1, 2, 3, 4, 5 };
		Integer integers[] = { 1, 2, 3, 4, 5 };
		String s[] = { "aa", "bb", "cc", "dd", "ee" };
		
		System.out.println( " is 2 in array ? " + isObjIn(new Integer(2), numbers ));
		System.out.println( " is 2 in array ? " + isObjIn(2, numbers ));
		System.out.println( " is 2 in array ? " + isObjIn(2, s )); // pas de controle !
		
		// Possible avec <T>, pas avec <T, E extends T>
//		System.out.println( " is 2 in array ? " + isIn(2, nums )); 
//		System.out.println( " is 88 in array ? " + isIn(88, nums ));

		// TJS possible 
		System.out.println( " is 2 in array ? " + isIn(2, integers )); 
		System.out.println( " is 88 in array ? " + isIn(88, integers ));

		//System.out.println( " is 2 in array ? " + isIn(2, s )); // Err compil.

		System.out.println( " is 'cc' in array ? " + isIn("cc", s ));
		System.out.println( " is 'abc' in array ? " + isIn("abc", s ));
		
		//Number n = new Float(123.456);
		Integer i1 = 2 ;
		System.out.println( " is Integer in array of Numbers ? " + isIn(i1, numbers ));
		Float f1 = new Float(123.456);
		System.out.println( " is Float in array of Numbers ? " + isIn(f1, numbers ));
		Double d1 = new Double(3.0);
		System.out.println( " is Double in array of Numbers ? " + isIn(d1, numbers ));

		//Float f2 = new Float(2.0);
		//System.out.println( " is float in array ? " + isIn(f2, integers )); // ERR : Bound mistmatch
		
//		System.out.println( isIn(123, s));
//		System.out.println( isIn("", integers));
	}

	public static void compareNumbers ()
	{
		Float f1 = new Float(2.0) ;
		Float f2 = new Float(2.0) ;
		Integer i1 = new Integer(2);
		Integer i2 = new Integer(2);
		Short   s1 = new Short((short)2);
		Short   s2 = new Short((short)2);
		System.out.println("Float :: Integer = " + f1.equals(i1));
		System.out.println("Short :: Integer = " + s1.equals(i1));
		System.out.println("Integer :: Integer = " + i2.equals(i1));
		System.out.println("Float :: Float = " + f2.equals(f1));
	}
}
