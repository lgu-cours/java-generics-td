package generics.td5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CapsuleExtTest {

	@Test
	public void test0() {
		System.out.println("----------");	
		// CapsuleExt<Integer> c = new CapsuleExt<>("Objet en version 2", 2 );
		// CapsuleExt<String> c = new CapsuleExt<>(123, 2 );
	}

	@Test
	public void test1() {
		System.out.println("----------");
		CapsuleExt<String> c = new CapsuleExt<>("Objet en version 1", 1 );
		System.out.println( c.getObj() + " ( version = " + c.getVersion() + " ) ");
		
	    assertNotNull( c.getObj() );
	    assertEquals("Objet en version 1", c.getObj());
	    assertEquals(1, c.getVersion());
	}

	@Test
	public void test2() {
		System.out.println("----------");
		CapsuleExt<String> c = new CapsuleExt<String>("Objet en version 2", 2 );
		System.out.println( c.getObj() + " ( version = " + c.getVersion() + " ) ");
	    assertEquals(2, c.getVersion());
	}

	@Test
	public void test3() {
		System.out.println("----------");
		CapsuleExt<Integer> c = new CapsuleExt<>(123, 2 );
		System.out.println( c.getObj() + " ( version = " + c.getVersion() + " ) ");
	    assertEquals(Integer.valueOf(123), c.getObj());
	    assertEquals(2, c.getVersion());
	}
}
