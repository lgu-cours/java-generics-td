package generics.td7;

import generics.bean.Chien;

public class TestCollec {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer ints[] = { 55, 11, 2, 8, 4, 12, 22 } ;
		//Collec c = new Collec(ints); // Warning
		Collec<Integer> c = new Collec<Integer>(ints);
		System.out.println(" min : " + c.min() );
		System.out.println(" max : " + c.max() );
		
		System.out.println("---");
		
		String strings[] = { "b", "z", "c", "y", "a" } ;
		//Collec c2 = new Collec(strings); // Warning
		Collec<String> c2 = new Collec<String>(strings); 
		System.out.println(" min : " + c2.min() );
		System.out.println(" max : " + c2.max() );
		
		Chien chiens[] = { new Chien("pif") } ;
		//Collec<Chien> c3 = new Collec<Chien>(chiens); // ERR : Chien n'implémente pas "Comparable"
		
	}

}
