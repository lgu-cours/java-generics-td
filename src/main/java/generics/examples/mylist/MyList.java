package generics.examples.mylist;

import java.util.LinkedList;

public class MyList<T> extends LinkedList<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public boolean add(T o) {
		System.out.println("add()...");
		return super.add(o);
	}

	@Override
	public T get(int index) {
		System.out.println("get("+ index + ")...");
		return super.get(index);
	}

	
}
