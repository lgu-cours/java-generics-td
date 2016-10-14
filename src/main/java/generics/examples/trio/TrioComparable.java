package generics.examples.trio;

/**
 * Objet contenant 3 éléments du même type
 * 
 * Instances comparables entre-elles
 * => implements Comparable<TrioComparable<T>>
 * 
 * Necessite des éléments comparables entre eux
 * => nouvelle contrainte <T extends Comparable<T> >
 * 
 * @param <T>
 */
public class TrioComparable<T extends Comparable<T> > implements Comparable<TrioComparable<T>> 
{

	private T element1 ;
	private T element2 ;
	private T element3 ;
	
	public TrioComparable(T p1, T p2, T p3)
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

	public int compareTo( TrioComparable<T> o ) 
	{
		T e1 = o.getElement1();
		T e2 = o.getElement2();
		T e3 = o.getElement3();
		
		int c1 = this.element1.compareTo(e1);
		if ( c1 != 0 ) return c1 ; // Différents
		
		int c2 = this.element2.compareTo(e2);
		if ( c2 != 0 ) return c2 ; // Différents
		
		int c3 = this.element3.compareTo(e3);
		if ( c3 != 0 ) return c3 ; // Différents
		
		return 0 ; // Identiques
	}
	
}
