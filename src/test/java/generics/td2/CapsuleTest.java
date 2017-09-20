package generics.td2;

import static org.junit.Assert.*;
import generics.td2.Capsule;

import org.junit.Test;

public class CapsuleTest {

	@Test
	public void test1StringType() {
		
	    Capsule<String> capsuleStr = new Capsule<String>("Test");

	    System.out.println(capsuleStr) ;
	    capsuleStr.showType();

	    // Get the value (notice that no cast is needed)
	    String str = capsuleStr.getObj();
	    System.out.println("value: " + str);

	    Class<?> clazz = capsuleStr.getObjClass() ;
	    assertEquals(String.class, clazz);
	    System.out.println("class: " + clazz);

	    assertNotNull(str);
	}

	@Test
	public void test2IntegerType() {
		
	    Capsule<Integer> capsuleInt = new Capsule<>(88);

	    System.out.println(capsuleInt) ;
	    capsuleInt.showType();

	    // Get the value (notice that no cast is needed)
	    int v = capsuleInt.getObj();
	    System.out.println("value: " + v);

	    System.out.println();

	}
}
