package generics.examples.trio;

/**
 * Objet contenant 3 instances du même type
 *
 * @param <T>
 */
public class Trio<T> {

	private T element1 ;
	private T element2 ;
	private T element3 ;
	
	public Trio(T p1, T p2, T p3)
	{
		element1 = p1 ;
		element2 = p2 ;
		element3 = p3 ;
	}
	
	public T getElement1()
	{
		return element1;
	}
	public T getElement2()
	{
		return element2;
	}
	public T getElement3()
	{
		return element3;
	}
	
	public String toString()
	{
		return "Trio : " + element1 + " | " + element2 + " | " + element3 ;
	}
	
}
