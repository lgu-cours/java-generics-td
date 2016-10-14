package generics.method;

public class TestUtil {


	public static void print( Object[] array )
	{
		System.out.println("-----");
		int i = 0 ;
		for ( Object o : array )
		{
			System.out.println(" . " + (i++) + " : " + o );
		}
	}
	
	public static void test1() {
		Util util = new Util();		
		String[] chiffres = {"zero", "un", null, "trois", null};
		print(chiffres);
		// Sans methode generique
		//util.setIfNull(chiffres, "DEUX", 2 ); // OK
		util.setIfNull(chiffres, new Integer(2), 2 ); // ArrayStoreException 
		print(chiffres);		
		System.out.println("==========");
	}
	
	public static void test2() {
		Util util = new Util();		
		String[] chiffres = {"zero", "un", null, "trois", null};
		print(chiffres);
		
		// Avec methode generique, mais sans type à l'appel 
		// => "inférence de type" ( le compilateur "devine" le type ) 
		
		util.genericSetIfNull(chiffres, "DEUX", 2 ); // OK
		// interprété comme <String> genericSetIfNull(String[] , string , int )
		
		util.genericSetIfNull(chiffres, new Integer(2), 2 ); // ArrayStoreException 
		// interprété comme <? extends Object> genericSetIfNull(? extends Object [] , ? extends Object , int )
		
		print(chiffres);		
		System.out.println("==========");
	}
	
	public static void test3() {
		Util util = new Util();		
		String[] chiffres = {"zero", "un", null, "trois", null};
		print(chiffres);
		// Avec methode generique, avec type à l'appel
		util.<String>genericSetIfNull(chiffres, "DEUX", 2 ); // OK
		//util.<String>genericSetIfNull(chiffres, new Integer(2), 2 ); // Erreur de compil
		// The parameterized method ... is not applicable for the arguments ...
		print(chiffres);		
		System.out.println("==========");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//test1();		
		//test2();
		test3();
	}

}
