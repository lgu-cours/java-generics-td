package generics.td4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StatTest {

	@Test
	public void test0() {
		System.out.println("----------");
	    // String strs[] = { "1", "2", "3", "4", "5" };
	    // ERR : String n'est pas une sous classe de Number  
	    // Stat<String> strob = new Stat<String>(strs); // Bound mismatch
		
	    // Integer inums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	    // Stat<Double> statInt = new Stat<>(inums); // Cannot convert Stat<Integer> to Stat<Double>
	}

	@Test
	public void test1() {
		System.out.println("----------");
	    Integer inums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
	    Stat<Integer> statInt = new Stat<Integer>(inums);
	    double v = statInt.average();
	    System.out.println(" average = " + v);
	    assertEquals(4.5, v, 0.01);
	}

	@Test
	public void test2() {
		System.out.println("----------");
	    Double d1[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.0, 9.123 };
	    Stat<Double> statd1 = new Stat<Double>(d1);
	    double average = statd1.average();
	    System.out.println(" average d1 = " + average);
	    assertEquals(5.32, average, 0.01);
	}

	@Test
	public void test3() {
		System.out.println("----------");
		Integer integers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Stat<Integer> statInt = new Stat<Integer>(integers);
	    System.out.println(" average statInt = " + statInt.average());
		
	    Double doubles1[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.0, 9.123 };
	    Stat<Double> statDouble1 = new Stat<Double>(doubles1);
	    System.out.println(" average statDouble1 = " + statDouble1.average());

	    Double doubles2[] = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };
	    Stat<Double> statDouble2 = new Stat<Double>(doubles2);
	    System.out.println(" average statDouble2 = " + statDouble2.average());

	    System.out.println(" Same average ? " + statInt.sameAvg(statDouble1) ) ; 
	    assertFalse( statInt.sameAvg(statDouble1) );
	    assertFalse( statDouble1.sameAvg(statInt) );

	    System.out.println(" Same average ? " + statInt.sameAvg(statDouble2) ) ; 
	    assertTrue( statInt.sameAvg(statDouble2) );
	    assertTrue( statDouble2.sameAvg(statInt) );
	}

}
