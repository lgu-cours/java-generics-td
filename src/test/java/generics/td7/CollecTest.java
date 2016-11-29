package generics.td7;

import static org.junit.Assert.assertEquals;
import generics.bean.Chien;

import org.junit.Before;
import org.junit.Test;

public class CollecTest {

	@Before
	public void before() {
		System.out.println("----------");
	}
	
	@Test
	public void test1() {
		Integer ints[] = { 55, 11, 2, 8, 4, 12, 22 } ;
		//Collec c = new Collec(ints); // Warning
		Collec<Integer> c = new Collec<Integer>(ints);
		System.out.println(" min : " + c.min() );
		System.out.println(" max : " + c.max() );		
		assertEquals(Integer.valueOf(2), c.min() );
		assertEquals(Integer.valueOf(55), c.max() );
	}

	@Test
	public void test2() {
		String strings[] = { "b", "z", "c", "y", "a" } ;
		//Collec c2 = new Collec(strings); // Warning
		Collec<String> c2 = new Collec<String>(strings); 
		System.out.println(" min : " + c2.min() );
		System.out.println(" max : " + c2.max() );
		assertEquals("a", c2.min() );
		assertEquals("z", c2.max() );
	}

	@Test
	public void test3() {
		Chien chiens[] = { new Chien("pif") } ;
		//Collec<Chien> c3 = new Collec<Chien>(chiens); // ERR : Chien n'implémente pas "Comparable"
	}

}
