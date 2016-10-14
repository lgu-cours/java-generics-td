package generics.usage;

import java.util.List;
import java.util.LinkedList;

public class TestGenerics {
	
	public static void testLinkedList() {
		LinkedList<String> list = null ;		
		list = new LinkedList<String>();
		
		list.add("aaa");
		list.add("bbb");
		
		//list.add( Boolean.FALSE ); // ERROR
		
		//Object o = new Integer(123);
		//list.add( o ); // ERROR
		
		for ( String i : list )
		{
			System.out.println(" . " + i );
		}
	}
	
	public static List<String> getList() {
		return new LinkedList<String>();
	}
	
	public static void populateStrList( List<String> list ) {
		for ( int i = 0 ; i < 5 ; i++ )
		{
			list.add("item " + i);
		}
	}

	public static void printStrList( List<String> list ) {
		for ( String item : list )
		{
			System.out.println(" . " + item );
		}
	}

	public static void printList( List list ) {
		for ( Object item : list )
		{
			System.out.println(" . " + item );
		}
	}
	
	public static <T> void printGenList( List<T> list ) {
		for ( T item : list )
		{
			System.out.println(" . " + item );
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("-----");
		testLinkedList() ;
		
		System.out.println("-----");
		List<String> list = getList();
		populateStrList(list);
		printStrList(list);
		System.out.println("--");
		printGenList(list);
		System.out.println("--");
		printList(list);
	}

}
