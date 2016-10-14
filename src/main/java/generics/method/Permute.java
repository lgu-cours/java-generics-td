package generics.method;

public class Permute {

	public static void print( Object[] array )
	{
		System.out.println("-----");
		int i = 0 ;
		for ( Object o : array )
		{
			System.out.println(" . " + (i++) + " : " + o );
		}
	}

	public static void permute( Object[] array, int i, int j )
	{
		Object temp = array[i] ;
		array[i] = array[j] ;
		array[j] = temp ;
	}
	
	public static void setIfNull( Object[] array, Object item, int i )
	{
		if ( array[i] == null )
		{
			array[i] = item ;
		}
	}
	
	public static <T> void genericPermute( T[] array, int i, int j )
	{
		T temp = array[i] ;
		array[i] = array[j] ;
		array[j] = temp ;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] chiffres = {"zero", "un", "deux", "trois", "quatre"};
		print(chiffres);
		//permute(chiffres, 1, 2 );
		genericPermute(chiffres, 1, 2 );
		print(chiffres);
	}

}
