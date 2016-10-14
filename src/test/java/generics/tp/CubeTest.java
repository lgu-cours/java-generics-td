package generics.tp;

import static org.junit.Assert.*;
import generics.td2.Capsule;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test1() {
		
		Cube<Integer> d = new  Cube<>(2, 3, 4);
		Integer h = d.getHeight();
		int w = d.getWidth();
		int l = d.getLength();
		
		double v = d.volume();
	    System.out.println("volume = " + v  );
	}

	@Test
	public void test2() {
		
		Cube<Double> d = new  Cube<>(1.0, 2.0, 3.0);
		Double h = d.getHeight();
		double w = d.getWidth();
		double l = d.getLength();
		
		double v = d.volume();
	    System.out.println("volume = " + v  );
	}
	
	@Test
	public void test3() {
		
		Cube<Float> d = new  Cube<>(1.0f, 2.0f, 3.0f);
		Float h = d.getHeight();
		float w = d.getWidth();
		double l = d.getLength();
		
		double v = d.volume();
	    System.out.println("volume = " + v  );
	}

	@Test
	public void test4() {
		
//		Dimensions<String> d = new  Dimensions<>("1","2","3");
//
//		Dimensions<Boolean> d = new  Dimensions<>(true, false, true);
	}

}
