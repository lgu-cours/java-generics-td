package generics;

import generics.bean.Animal;

import java.util.LinkedList;
import java.util.List;

public class Util {

	public static void printList( List list ) {
		for ( Object item : list )
		{
			System.out.println(" . " + item );
		}
	}

	public static void printListObj( List<Object> list ) {
		for ( Object item : list )
		{
			System.out.println(" . " + item );
		}
	}

// ERROR : Duplicate method
//	public static void afficher ( LinkedList<Animal> list  ) {
//		for ( Animal item : list )
//		{
//			System.out.println(" . " + item );
//		}
//	}
//	public static void afficher ( LinkedList<Integer> list  ) {
//		for ( Integer item : list )
//		{
//			System.out.println(" . " + item );
//		}
//	}
	
	
}
