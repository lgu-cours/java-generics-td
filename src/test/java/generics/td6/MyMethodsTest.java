package generics.td6;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class MyMethodsTest {

	@Test
	public void test0() {
		System.out.println("----------");	
		// CapsuleExt<Integer> c = new CapsuleExt<>("Objet en version 2", 2 );
		// CapsuleExt<String> c = new CapsuleExt<>(123, 2 );
	}

	@Test
	public void test1() {
		System.out.println("----------");
		
		Number  numbers[]  = { 1, 2, 3, 4, 5 };
		Integer integers[] = { 1, 2, 3, 4, 5 };
		String  s[] = { "aa", "bb", "cc", "dd", "ee" };
		
		System.out.println( " is 2 in array ? " + MyMethods.isObjIn(new Integer(2), numbers ));
		System.out.println( " is 2 in array ? " + MyMethods.isObjIn(2, numbers ));
		System.out.println( " is 2 in array ? " + MyMethods.isObjIn(2, integers ));
		System.out.println( " is 2 in array ? " + MyMethods. isObjIn(2, s )); // pas de controle !
	}

	@Test
	public void test2Str() {
		System.out.println("----------");
		String  strings[]  = { "aa", "bb", "cc", "dd", "ee" };

		System.out.println( " is 'aa' in array ? " + MyMethods.isStrIn("aa", strings ));
		assertTrue( MyMethods.isStrIn("aa", strings ) );

		System.out.println( " is 'xx' in array ? " + MyMethods.isStrIn("xx", strings ));
		assertFalse( MyMethods.isStrIn("xx", strings ) );
		
		// Typage fort => controle
//		Number  numbers[]  = { 1, 2, 3, 4, 5 };
//		Integer integers[] = { 1, 2, 3, 4, 5 };
//		System.out.println( " is 2 in array ? " + MyMethods.isStrIn("aa", numbers ));
//		System.out.println( " is 2 in array ? " + MyMethods.isStrIn(2, integers ));
//		System.out.println( " is 2 in array ? " + MyMethods.isStrIn(2, strings )); 
	}

	@Test
	public void test4Strict() {
		System.out.println("----------");
		Integer  numbers[]  = { 1, 2, 3, 4, 5 };

		Integer i = 2 ;
		System.out.println( " is Integer in array of Numbers ? " + MyMethods.isIn(i, numbers ));
		assertTrue( MyMethods.<Integer>isIn(i, numbers ) );
		assertTrue( MyMethods.isIn(i, numbers ) );
		
		Float f = new Float(123.456);
		System.out.println( " is Float in array of Numbers ? " + MyMethods.isIn(f, numbers ));
		// assertFalse( MyMethods.<Integer>isInStrict(f, numbers ) ); // COMPILATION ERROR
		assertFalse( MyMethods.isIn(f, numbers ) ); // Not 'equals'
		
		Double d = new Double(3.0);
		System.out.println( " is Double in array of Numbers ? " + MyMethods.isIn(d, numbers ));
		assertFalse( MyMethods.isIn(d, numbers ) );	// Not 'equals'	

		Short sh = Short.valueOf((short)3);
		System.out.println( " is Double in array of Numbers ? " + MyMethods.isIn(sh, numbers ));
		assertFalse( MyMethods.isIn(sh, numbers ) ); // Not 'equals'		
	}

	@Test
	public void test5Integer() {
		System.out.println("----------");
		Integer array[]  = { 1, 2, 3, 4, 5 };
		Integer v = 2 ;
		
		System.out.println( " isInStrict(2, array) ? " + MyMethods.isIn(v, array ));
		assertTrue( MyMethods.isIn(v, array ) );
		
		System.out.println( " isIn(2, array) ? " + MyMethods.isIn2(v, array ));
		assertTrue( MyMethods.isIn2(v, array ) );
	}

	@Test
	public void test6Double() {
		System.out.println("----------");
		Double array[]  = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		Double v = 2.0 ;
		
		System.out.println( " isInStrict(2.0, array) ? " + MyMethods.isIn(v, array ));
		assertTrue( MyMethods.isIn(v, array ) );
		
		System.out.println( " is 2 in array ? " + MyMethods.isIn2(v, array ));
		assertTrue( MyMethods.isIn2(v, array ) );
	}

	@Test
	public void test8() {
		System.out.println("----------");
		Number  numbers[]  = { 1, 2, 3, 4, 5 };

//		Integer i = 2 ;
//		System.out.println( " is Integer in array of Numbers ? " + MyMethods.isIn(i, numbers ));
//		assertTrue( MyMethods.isIn(i, numbers ) );
//		
//		Float f = new Float(123.456);
//		System.out.println( " is Float in array of Numbers ? " + MyMethods.isIn(f, numbers ));
//		assertFalse( MyMethods.isIn(f, numbers ) );
//		
//		Double d = new Double(3.0);
//		System.out.println( " is Double in array of Numbers ? " + MyMethods.isIn(d, numbers ));
//		assertTrue( MyMethods.isIn(d, numbers ) );		
	}

	@Test
	public void test9() {
		System.out.println("----------");
		Integer  array[]  = { 1, 2, 3, 4, 5 };

		Integer i = 2 ;
		System.out.println( " is Integer in array of Numbers ? " + MyMethods.isIn2(i, array ));
		assertTrue( MyMethods.isIn2(i, array ) );
		
//		Float f = new Float(123.456);
//		System.out.println( " is Float in array of Numbers ? " + MyMethods.isIn(f, array ));
//		assertFalse( MyMethods.isIn(f, array ) );
//		
//		Double d = new Double(3.0);
//		System.out.println( " is Double in array of Numbers ? " + MyMethods.isIn(d, array ));
//		assertTrue( MyMethods.isIn(d, array ) );		
	}
}
