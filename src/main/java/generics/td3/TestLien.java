package generics.td3;

public class TestLien {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//-------------------------------------------------------------
		Lien<Integer, String> obj = new Lien<Integer, String>(1, "Un");
		
		// Show the types.
		obj.showTypes();
		
		// Obtain and show values.
		int v = obj.getob1();
		System.out.println("value 1 : " + v);
		
		String str = obj.getob2();
		System.out.println("value 2 : " + str);
		
		//-------------------------------------------------------------
		System.out.println("-----");
		
		Lien<String, String> nomprenom = new Lien<String, String>("Emile", "Zola");
		
		// Show the types.
		nomprenom.showTypes();
		
		// Obtain and show values.
		String nom = nomprenom.getob1();
		System.out.println("value 1 : " + nom);
		
		String prenom = nomprenom.getob2();
		System.out.println("value 2 : " + prenom);
		
		//-------------------------------------------------------------
		
    }

}
