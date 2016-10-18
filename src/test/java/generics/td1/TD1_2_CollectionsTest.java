package generics.td1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class TD1_2_CollectionsTest {
	
	private void print(List<?> list) {
		for ( Object o : list ) {
			System.out.println(" . " + o);
		}
	}

	private List<Number> getNumberList() {
		ArrayList<Number> list = new ArrayList<>();
		list.add(new Integer(808));
		list.add(new Integer(763));
		list.add(new Integer(222));
		list.add(new Integer(336));
		list.add(new Integer(658));
		list.add(new Integer(103));
		list.add(new Integer(500));
		list.add(new Integer(401));
		list.add(937); // Autoboxing
		return list ;
	}
	private List<Integer> getIntegerList() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(808));
		list.add(new Integer(763));
		list.add(new Integer(222));
		list.add(new Integer(336));
		list.add(new Integer(658));
		list.add(new Integer(103));
		list.add(new Integer(500));
		list.add(new Integer(401));
		list.add(937); // Autoboxing
		return list ;
	}
	private List<Integer> getIntegerList2() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for ( int i = 1 ; i <= 4 ; i++ ) {
			list.add(i);
		}
		return list ;
	}

	@Test
	public void testCollectionsMinMax() {
		System.out.println("\n--- Min / Max ");
		List<Integer> list = getIntegerList() ;
		print(list);
		System.out.println("min = " + Collections.min(list) );
		System.out.println("max = " + Collections.max(list) );
	}		

	@Test
	public void testCollectionsSort() {
		System.out.println("\n--- Sort ");
		List<Integer> list = getIntegerList() ;
		System.out.println("List before sort : ");
		print(list);
		Collections.sort(list);
		System.out.println("List after sort : ");
		print(list);
	}		

	@Test
	public void testCollectionsFill() {
		System.out.println("\n--- Fill ");
		List<Integer> list = getIntegerList() ;
		System.out.println(" size : " + list.size() );
		//Collections.fill(list, "Aaaa"); // not applicable
		Collections.fill(list, 12);
		print(list);
	}		

	@Test
	public void testCollectionsCopy() {
		System.out.println("\n--- Copy ");
		List<Integer> list1 = getIntegerList() ;
		List<Integer> list2 = getIntegerList2() ;
		System.out.println(" list1 size : " + list1.size() );
		System.out.println(" list2 size : " + list2.size() );
		System.out.println("List before copy : ");
		print(list1);

		//--- Copy 
		// Signature : copy(List<? super T> dest, List<? extends T> src)
		Collections.copy(list1, list2);
		
		System.out.println("List after copy : ");
		print(list1);

		List<Number> numberList = getNumberList();
		Collections.copy(numberList, list2); // OK
		//Collections.copy(list1, numberList); // ERR : "Not applicable for arguments" 
		Collections.copy(numberList, numberList); // OK
	}		
}
