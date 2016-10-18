package generics.tp;

import org.junit.Test;

public class CubeTest {

	@Test
	public void test1() {
		
		Cube<Integer> cube = new  Cube<>(2, 3, 4);
	    System.out.println("length = " + cube.getLength() );
	    System.out.println("width  = " + cube.getWidth()  );
	    System.out.println("height = " + cube.getHeight() );
		
		double v = cube.volume();
	    System.out.println("volume = " + v  );
	    
	}

	@Test
	public void test2() {
		
		Cube<Double> cube = new  Cube<>(1.0, 2.0, 3.0);
	    System.out.println("length = " + cube.getLength() );
	    System.out.println("width  = " + cube.getWidth()  );
	    System.out.println("height = " + cube.getHeight() );
		
		double v = cube.volume();
	    System.out.println("volume = " + v  );
	    
	}
	
	@Test
	public void test3() {
		
		Cube<Float> d = new  Cube<>(1.0f, 2.0f, 3.0f);
		Float h = d.getHeight();
		float w = d.getWidth();
		double l = d.getLength();

		System.out.println(" h = " + h );
		System.out.println(" w = " + w );
		System.out.println(" l = " + l );
		
		double v = d.volume();
	    System.out.println("volume = " + v  );
	}

	@Test
	public void test4() {
		// ERR : type mismatch 
		// Cube<String> cube = new  Cube<>("1","2","3");
		// Cube<Boolean> cube = new  Cube<>(true, false, true);
	}

}
