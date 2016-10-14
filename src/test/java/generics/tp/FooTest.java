package generics.tp;

import static org.junit.Assert.*;
import generics.td2.Capsule;

import org.junit.Test;

public class FooTest {

	@Test
	public void test1StringType() {
		Number x = 12 ;
		Number y = 10 ;
		
	    //System.out.println("class: " + x * y ); // Operator * undefined
	    
	    System.out.println("class: " + x.doubleValue() * y.doubleValue() );
	}

}
