package generics.td6;

import java.util.List;

public class MyMethods {

	/**
	 * Returns true if the given String item is in the given array
	 * @param item
	 * @param array
	 * @return
	 */
	public static boolean isStrIn ( String item, String[] array )
	{
		for ( String s : array ) {
			if ( item.equals(s) ) return true ;
		}
		return false ;
	}
	
	/**
	 * Returns true if the given Object item is in the given array
	 * @param item
	 * @param array
	 * @return
	 */
	public static boolean isObjIn ( Object item, Object[] array )
	{
		for ( Object o : array ) {
			if ( item.equals(o) ) return true ;
		}
		return false ;
	}
	
	/**
	 * Returns true if the given String item is in the given array <br>
	 * Generic but strict : same type expected for item and array
	 * @param item
	 * @param array
	 * @return
	 */
	public static <T> boolean isIn ( T item, T[] array ) {
		for ( T o : array ) {
			if ( item.equals(o)) return true ; 
		}
		return false ;
	}
	
	public static <TArray extends TItem, TItem> boolean isIn2 ( TItem item, TArray[] array )
	{
//		for ( int i = 0 ; i < array.length ; i ++ )
//		{
//			if ( obj.equals( array[i])) return true ; 
//			// NB : "equals" just for illustration 
//			// (non reliable for different types of "Numbers" ) 
//		}
		for ( TArray o : array ) {
			if ( item.equals(o)) return true ; 
			// NB : "equals" just for illustration 
			// (non reliable for different types of "Numbers" ) 
		}
		return false ;
	}
	
	public static <TArray, TItem extends TArray> boolean isIn3 ( TItem item, TArray[] array )
	{
		for ( TArray o : array ) {
			if ( item.equals(o)) return true ; 
			// NB : "equals" just for illustration 
			// (non reliable for different types of "Numbers" ) 
		}
		return false ;
	}
	
	public static <T> boolean isInList ( T item, List<? extends T> list )
	{
		for ( T o : list ) {
			if ( item.equals(o)) return true ; 
		}
		return false ;
	}
	
}
