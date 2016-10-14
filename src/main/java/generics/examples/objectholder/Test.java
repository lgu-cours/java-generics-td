package generics.examples.objectholder;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		testWithString();
		testWithInteger();
	}

	private static void testWithString() {
		ObjectHolder<String> oh1 = new ObjectHolder<String>("ABCD");
		
		String e = oh1.getElement() ;
		System.out.println(" Element = " + e );
		
		String s2 = "" ;
		System.out.println(" CompareTo("+ s2 + ") : " + oh1.compareTo(s2) ) ;
		s2 = "ABCD" ;
		System.out.println(" CompareTo("+ s2 + ") : " + oh1.compareTo(s2) ) ;
	}

	private static void testWithInteger() {
		ObjectHolder<Integer> oh1 = new ObjectHolder<Integer>(1234);
		
		Integer e = oh1.getElement() ;
		System.out.println(" Element = " + e );
		
		Integer s2 = 33 ;
		System.out.println(" CompareTo("+ s2 + ") : " + oh1.compareTo(s2) ) ;
		
		s2 = 1234 ;
		System.out.println(" CompareTo("+ s2 + ") : " + oh1.compareTo(s2) ) ;
	}
}
