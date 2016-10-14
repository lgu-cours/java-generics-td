package generics.td7;

public class Collec <T extends Comparable<T>> implements MinMax<T>
{
	private T[] objects ;
	
	public Collec ( T[] p )
	{
		objects = p ;
	}
	
	public T min()
	{
		T m = objects[0];
		for ( int i = 1 ; i < objects.length ; i++ )
		{
			T o = objects[i] ;			
			if ( o != null )
			{
				if ( o.compareTo(m) < 0 ) m = o ;
			}
		}
		return m ;
	}
	
	public T max()
	{
		T m = objects[0];
		for ( int i = 1 ; i < objects.length ; i++ )
		{
			T o = objects[i] ;			
			if ( o != null )
			{
				if ( o.compareTo(m) > 0 ) m = o ;
			}
		}
		return m ;
	}
	
	public T last()
	{
		return objects[objects.length-1] ;
	}
}
