package generics.examples.trio;


import java.math.BigDecimal;

public class TestTrio {
	
	public static void main(String[] args) {
		System.out.println("-----");
		Trio<String> trioStr = new Trio<String>("str1","str2","str3"); 
		System.out.println(trioStr);

		System.out.println("-----");
		Trio<Integer> trioInt1 = new Trio<Integer>(new Integer(1), new Integer(2), new Integer(3) ); 
		System.out.println(trioInt1);
		Integer e1 = trioInt1.getElement1();
		System.out.println("element 1 = " + e1);
		//String s1 = trioInt1.getElement1(); // ERR : Type mismatch
		
		System.out.println("-----");
		Trio<Integer> trioInt2 = new Trio<Integer>(1,2,3);  // Autoboxing 
		System.out.println(trioInt2);

		System.out.println("-----");
		Trio<Number> trioNum = new Trio<Number>(new Integer(1), new Double(2.789), new BigDecimal("3.789") );   
		System.out.println(trioNum);
		
		
	}
}
