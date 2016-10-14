package generics.td1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import generics.td2.Capsule;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test1NoType() {
		ArrayList list = new ArrayList();
		
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(5); // Autoboxing
		
		list.add(new Long(6));
		list.add("7 (String)");
		
		for ( Object item : list ) 
		//for ( String item : list ) // Type mismatch
		//for ( Object item : list ) // OK
		{
			System.out.println(" . " + item );
		}

		System.out.println( " get(2) : " + list.get(2));

		Integer i3 = (Integer) list.get(3);
		System.out.println( " i3 : " + i3);

		int i4 = (Integer) list.get(4); // Autoboxing
		System.out.println( " i4 : " + i4);
	}

	@Test
	public void test2ObjectType() {
		
		// ArrayList<?> list = new ArrayList<Object>(); // OK, mais inutilisable : list.add(..) => ERR
		// ArrayList<?> list = new ArrayList<?>(); // ERR : pas d'instanciation avec <?>		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(5); // Autoboxing
		
		list.add(new Long(6));
		list.add("7 (String)");
		
		for ( Object item : list )  
		//for ( String item : list ) // Type mismatch
		//for ( Object item : list ) // OK
		{
			System.out.println(" . " + item );
		}

		System.out.println( " get(2) : " + list.get(2));

		Integer i3 = (Integer) list.get(3);
		System.out.println( " i3 : " + i3);

		int i4 = (Integer) list.get(4); // Autoboxing
		System.out.println( " i4 : " + i4);
	}
	
	@Test
	public void test3IntegerType() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(new Integer(3));
		list.add(new Integer(4));
		list.add(5); // Autoboxing
		
		// list.add(new Long(6));
		// list.add("7");
		
		for ( Integer item : list ) 
		//for ( String item : list ) // Type mismatch
		//for ( Object item : list ) // OK
		{
			System.out.println(" . " + item );
		}

		System.out.println( " get(2) : " + list.get(2));

		Integer i3 = list.get(3);
		System.out.println( " i3 : " + i3);

		int i4 = list.get(4);  // Auto-unboxing
		System.out.println( " i4 : " + i4);
		
//		list.set(4, null);
//		int i = list.get(4); // NullPointerException !
	}
	
}
