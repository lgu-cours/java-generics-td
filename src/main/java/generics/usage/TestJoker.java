package generics.usage;

import generics.bean.Animal;
import generics.bean.Chat;

import java.util.LinkedList;
import java.util.List;

public class TestJoker {
	
	public static void test1( ) {
		List<? extends Number> listNumber = new LinkedList<Integer>() ;

		List<? extends Integer> listInteger = new LinkedList<Integer>() ;
		
		//List<? extends Integer> listes[] = new LinkedList<? extends Integer> [12] ;
		
		//List<? extends Integer> l = new LinkedList<? extends Integer>() ;
		
		List<? extends Integer> l = new LinkedList<Integer>() ;
		
		Integer item = l.get(0);
		
		listNumber.add(null);

		List<? extends Comparable> list5 = new LinkedList<Integer>() ;
		List<? extends Comparable> list6 = new LinkedList<String>() ;

		List<? extends Chat> list11 = new LinkedList<Chat>();
		//List<? extends Chat> list12 = new LinkedList<Animal>(); // ERROR : Type mismatch: cannot convert from LinkedList<Animal> to List<? extends Chat>
	}

	public static void test2( ) {
		List<? super Animal> list1 = new LinkedList<Animal>() ;
		// List<? super Animal> list2 = new LinkedList<Chat>() ; // ERROR : Type mismatch
		List<? super Animal> list3 = new LinkedList<Object>() ;

		List<? super Chat> list4 = new LinkedList<Chat>();
		List<? super Chat> list5 = new LinkedList<Animal>();
		List<? super Chat> list6 = new LinkedList<Object>();
	}
	
	public static void populateNumList( List<Number> list ) {
		list.add(new Integer(1) );
		list.add(new Double(2.123) );
		list.add(new Short((short)3) );
	}

//	public static void addNumListJoker( List<? extends Number> list, Integer n ) {
//		list.add(n);
//	}
	
	public static void populateNumListJoker( List<? extends Number> list ) {
		
//			
//		LinkedList<Integer> l = new LinkedList<Integer>();
//
//		Collection<? extends Number> c = list ;
//		//c.add(new Integer(1));
//		for ( Number i : c )
//		{
//			list.add(i);
//		}
//		Number n = new Integer(1);
//		list.addAll(c);
//		
//		list.add(c. );
//		list.add(new Double(2.123) );
//		list.add(new Short((short)3) );
	}

	public static void printList( List list ) {
		for ( Object item : list )
		{
			System.out.println(" . " + item );
		}
	}
	
	public static void printNumList( List<? extends Number> list ) {
		for ( Number item : list )
		{
			System.out.println(" . " + item );
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("-----");
		// LinkedList<Double> n'est pas un "sous-type" de LinkedList<Number>
		//LinkedList<Number> list1 = new LinkedList<Double>() ; // Type mismatch
		//LinkedList<Number> list2 = new LinkedList<Integer>() ; // Type mismatch
		
		System.out.println("-----");
		LinkedList<Number> listNum = new LinkedList<Number>();
		populateNumList( listNum );
		printList(listNum);
		printNumList(listNum);

		LinkedList<? extends Number> listNum1 = new LinkedList<Double>() ;
		//populateNumList( listNum1 );
		
		// Possible, mais inexploitable
		LinkedList<? extends Number> listNum2 = new LinkedList<Integer>() ;
		//listNum2.add(new Integer(12)); // <? extends Number> != <Integer>

		
		System.out.println("-----");
		LinkedList<Integer> listNum3 = new LinkedList<Integer>() ;
		listNum3.add(new Integer(1));
		listNum3.add(new Integer(2));
		printNumList(listNum3);
		
	}

}
