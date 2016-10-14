package generics.td7;

public interface MinMax <T extends Comparable<T> > {
	
	public T min();
	
	public T max();
}
