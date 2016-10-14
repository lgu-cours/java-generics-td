package generics.td5;

public class TestCapsuleExt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CapsuleExt<String> c = new CapsuleExt<String>("Objet en version 1", 1 );
		System.out.println( c.getObj() + " ( version = " + c.getVersion() + " ) ");

		CapsuleExt<String> c2 = new CapsuleExt<String>("Objet en version 2", 2 );
		System.out.println( c2.getObj() + " ( version = " + c2.getVersion() + " ) ");
		
		
	}

}
