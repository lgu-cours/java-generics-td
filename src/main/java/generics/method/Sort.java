package generics.method;

import generics.examples.trio.Trio;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sort {

	public static void print( List list ) {
		for ( Object item : list )
		{
			System.out.println(" . " + item );
		}
	}

	//public static <T extends Comparable<? super T>> void sort(List<T> list) {
	public static <T extends Comparable<T>> void sort(List<T> list) {
	//public static <T extends Comparable > void sort(List<T > list) {
		   Object a[] = list.toArray();
		   Arrays.sort(a); // the object must be Comparable
		   for(int i=0; i < a.length; i++) 
		   {
		      list.set(i, (T)a[i]);
		   }
		}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("zzzz");
		list.add("ccc");
		list.add("ffff");
		list.add("aaaa");
		list.add("eee");
		
		print(list);		
		Sort.<String>sort(list);
		System.out.println("---");
		print(list);
		
		List<MyClass> list2 = new LinkedList<MyClass>();
		Sort.<MyClass>sort(list2);

		List<MyOtherClass> list3 = new LinkedList<MyOtherClass>();
		sort(list3);

		List<Trio> lt = new LinkedList<Trio>();
		lt.add( new Trio<String>("aa", "bb", "cc") );
		//sort(lt); // ERR ( not comparable )
	}

}
