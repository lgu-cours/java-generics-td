package generics.tests;

public class MyClass1 {

	public <T extends Number> void add( T p1, T p2 ) 
	{
		
		double r = p1.doubleValue() + p2.doubleValue() ;
		System.out.println( "r = " + r );
	}
	
	public <T> void print( T p1, T p2 ) 
	{
		System.out.println( "p1 = " + p1 );
		System.out.println( "p2 = " + p2 );
	}
	
	
	public static void main(String args[] )
	{
		MyClass1 o = new MyClass1();
		
		Short p1 = new Short((short)12);
		Short p2 = new Short((short)4);
		
		o.<Short>add(p1, p2);
		
		o.<Number>print(p1, p2);
		
		//o.<Integer>add(p1, p2);
		
	}

}
