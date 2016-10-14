package generics.tests;

import java.util.LinkedList;
import java.util.List;

public class Tests2012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// LinkedList<short>   list1 ; 
		
		LinkedList<Integer> list2 ;

		LinkedList<short[]>   list3 ;
		
		
	}
	
	public static List<? extends Number> getList( )	
	{
		List<? extends Number> list1 = new LinkedList<Number>();
		//List<? extends Number> list2 = new LinkedList<Object>();
		//List<? extends Number> list4 = new LinkedList<String>();
		List<? extends Number> list3 = new LinkedList<Integer>();
		
		return list1 ;
	}
	
	public <T> T load( Class<T> c, int key )
	{
		T o = null ;
		try {
			c.newInstance() ;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return o ;
	}

}
