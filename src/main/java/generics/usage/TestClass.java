package generics.usage;

public class TestClass {

	public static void test() {
		Class<Integer> c3 = Integer.class ;  // Ok
		//Class<Integer> c1 = Object.class ;	 // Erreur	
		//Class<Integer> c2 = String.class ;	 // Erreur
		//Class<Number>  c4 = Integer.class ;  // Erreur
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Class c1 = Object.class ;
		Class c2 = String.class ;
		Class c3 = Integer.class ;
		
		Integer i = new Integer(123);
		Class ci = i.getClass();
		
		StringBuffer sb = new StringBuffer();
		sb.getClass();
		
		//Class<Integer> cstring1 = Object.class ;	// Erreur	
		//Class<Integer> cstring2 = String.class ;	// Erreur
		Class<Integer> cstring3 = Integer.class ; // OK
		//Class<Number> cnumber = Integer.class ; // Erreur
		//Class<Number> cnumber2 = i.getClass()  ; // Erreur
		Class<? extends Number> cnumber3 = i.getClass()  ; // OK
		Class<? extends Number> cnumber4 = Integer.class  ; // OK
		
		Class<?> cjoker1 = String.class ;
		Class<?> cjoker2 = Integer.class ;

		cjoker1 = c2 ;
		cjoker1 = c3 ;
		
		c2 = cjoker1 ;
		c2 = cjoker2 ;
		
		Class<Object> co1 = Object.class ;		
		//Class<Object> co2 = String.class ; // Err
		
		Class<? extends Number> cextnumber1 = Number.class ;
		Class<? extends Number> cextnumber2 = Integer.class ;
		Class<? extends Number> cextnumber3 = Float.class ;
		
		//Class<? extends Number> cextnumber4 = String.class ; // Err
		cjoker1 = cextnumber2 ;
	}

}
