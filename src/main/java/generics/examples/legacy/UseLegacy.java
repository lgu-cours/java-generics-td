package generics.examples.legacy;

import java.util.List;

import org.demo.newjava.NewList;
import org.demo.oldjava.OldList;

public class UseLegacy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		testOldList() ;
		//testNewList() ;
	}

	//@SuppressWarnings("unchecked")
	public static void testOldList() 
	{
		//OldList<String> oldlist = new OldList<String>(); // ERR : classe non générique
		OldList oldlist = new OldList(); 
		oldlist.addItem("aaa");
		oldlist.addItem("bbb");
		oldlist.addItem("ccc");

		List<String> items1 = oldlist.getItems(); // WARNING : unchecked 
		
		@SuppressWarnings("unchecked")
		List<String> items2 = oldlist.getItems(); //  WARNING : unchecked 
		
		List<Object> items3 = oldlist.getItems(); //  WARNING : unchecked 

		print ( items1 );
		print ( items2 );
		print ( items3 );
	}
	
	public static void testNewList() 
	{
		NewList<String> newlist = new NewList<String>();
		
		newlist.addItem("AAA");
		newlist.addItem("BBB");
		newlist.addItem("CCC");
		
		List<String> items = newlist.getItems(); 
		print ( items );
	}
	
	public static void print( List<?> list) {
		for ( Object o : list ) 
		{
			System.out.println(" . " + o );
		}
		
	}
}
