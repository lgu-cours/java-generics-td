package generics.usage;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;


public class CollectionsUsage 
{
	public static void main(String[] args) {
		
		List<String> list1 = new LinkedList<>();
		
		// Comparator<String> : OK 
//		Comparator<String> comparator = new Comparator<String>(){
//
//			@Override
//			public int compare(String arg0, String arg1) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
//			
//		};

		// Comparator<Object> : OK 
		Comparator<Object> comparator = new Comparator<Object>(){

			@Override
			public int compare(Object arg0, Object arg1) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		
		// min & max => Comparator<? super String>
		
		Collections.max(list1, comparator);
		
		Collections.min(list1, comparator);
	}
}
