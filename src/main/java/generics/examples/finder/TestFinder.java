package generics.examples.finder;

import generics.bean.Personne;


public class TestFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Finder finder = new Finder();
		
		Personne p = finder.findByName(Personne.class, "Toto");
		System.out.println( " Personne : " + p );
		
		String s = finder.findByName(String.class, "Toto");
		System.out.println( " String : " + s );
		
		
	}

}
