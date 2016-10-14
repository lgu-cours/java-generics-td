package generics.tests;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LinkedList<short> list1 ;
		
		LinkedList<?> list = new LinkedList<Object>();
		
		LinkedList<short[]> list2 ;
		
		//LinkedList<Integer> lists[] = new LinkedList<Integer> [10] ; // ERROR : Cannot create a generic array of LinkedList<Integer>
		//LinkedList<Integer> lists[] = new LinkedList<?> [10] ; // ERROR : Type mismatch : cannot convert from LinkedList<?>[] to LinkedList<Integer>[]
		//LinkedList<Integer> lists[] = (LinkedList<Integer>[]) new LinkedList<?> [10] ; 
		// WARNING :  Type safety : Unchecked cast from LinkedList<?>[] to LinkedList<Integer>[]
		
		LinkedList<?> lists[] = new LinkedList<?> [10] ; // OK
		
		lists[0] = new LinkedList<Integer>();
				
		LinkedList list6 = new LinkedList<Byte>() ; // WARNING : LinkedList is a raw type
		LinkedList<Byte> list7 = new LinkedList<Byte>() ; // OK
		
		// LinkedList<Byte> list8 = new LinkedList<Number>() ; 
		// ERROR : Type mismatch : cannot convert from LinkedList<Number> to LinkedList<Byte>

		// LinkedList<Number> list8 = new LinkedList<Byte>() ; 
		// ERROR : Type mismatch : cannot convert from LinkedList<Byte> to LinkedList<Number>
		
		LinkedList<Date> list3 = new LinkedList<Date>();
		//LinkedList<Object> list4 = list3 ; 
		
		// LinkedList<String, Short> list5 ; 
		// ERROR : Incorrect number of arguments for type LinkedList<E>; it cannot be parameterized with arguments <String, Short>

	}

}
