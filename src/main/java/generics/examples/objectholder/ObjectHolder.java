package generics.examples.objectholder;

/**
 *
 * @param <T>
 */
public class ObjectHolder<T extends Comparable<T>> implements Comparable<T> {

	private T element ;
	
	public ObjectHolder(T p1)
	{
		element = p1 ;
	}
	
	public T getElement()
	{
		return element;
	}
	
	public String toString()
	{
		return "Element : " + element ;
	}

//	public int compareTo( Object o) {
//		return element.compareTo(o);
//	}
	public int compareTo( T o) {
		return element.compareTo(o);
	}
	
}
