package generics.td3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LienTest {

	@Test
	public void test1() {
		System.out.println("----------");
		Lien<Integer, String> obj = new Lien<Integer, String>(1, "Un");
		
		// Show the types.
		obj.showTypes();
		
		// Obtain and show values.
		int v = obj.getob1();
		System.out.println("value 1 : " + v);
		assertEquals(1, v);
		
		String str = obj.getob2();
		System.out.println("value 2 : " + str);
		assertEquals("Un", str);
	}

	@Test
	public void test2() {
		System.out.println("----------");
		Lien<String, String> nomprenom = new Lien<String, String>("Emile", "Zola");
		
		// Show the types.
		nomprenom.showTypes();
		
		// Obtain and show values.
		String prenom = nomprenom.getob1();
		System.out.println("value 1 : " + prenom);
		assertEquals("Emile", prenom);

		String nom = nomprenom.getob2();
		System.out.println("value 2 : " + nom);
		assertEquals("Zola", nom);
		
	}

}
