package generics.examples.comparable;

public class TestPersonne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Personne p = new Personne("Berlioz", "Hector");
		
		Personne p2 = new Personne("Zola", "Emile");
		Personne p3 = new Personne("Aaaa", "Bbbb");
		
		
		System.out.println(" Personne : " + p );
		
		System.out.println( " p.compareTo(" + p2 + ") : " + p.compareTo(p2) );
		System.out.println( " p.compareTo(" + p3 + ") : " + p.compareTo(p3) );
		
		PersonneV2 p9 = new PersonneV2("Zola", "Emile");
		System.out.println( " p.compareTo('Emile-Zola') : " + p9.compareTo("Emile-Zola") );
		System.out.println( " p.compareTo('Toto-Zola') : " + p9.compareTo("Toto-Zola") );
	}

}
