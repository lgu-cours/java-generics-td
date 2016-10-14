package generics.method;

public class TestMyGeneric {

	public static void test() {
		  MyGeneric<Object> g = new MyGeneric<Object>() ;
		  //MyGeneric<? extends Object> g = new MyGeneric() ;
		  g.set("aaa");
		  g.set(new Integer(1));
		  
		  System.out.println(" g : " + g );
	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyGeneric<String> gs = new MyGeneric<String>();
		  gs.set("aaaa");
		  //g.set(new Integer(1) ); // Erreur de compil.
		  System.out.println(" gs : " + gs );
		  gs.set("bbbb");
		  System.out.println(" gs : " + gs );
			
		  MyGeneric<Integer> gi = new MyGeneric<Integer>();
		  gi.set(new Integer(1));
		  System.out.println(" gi : " + gi );
		  gi.set(new Integer(56));
		  System.out.println(" gi : " + gi );

	}

}
