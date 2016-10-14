package generics.method;

// Classe standard ( sans type param�tr� )
public class Util {

	// Methode standard ( sans type param�tr� )
	public void setIfNull( Object[] array, Object item, int i )
	{
		if ( array[i] == null )
		{
			array[i] = item ;
		}
	}

	// Methode g�n�rique ( avec type param�tr�e )
	public <T> void genericSetIfNull( T[] array, T item, int i )
	{
		if ( array[i] == null )
		{
			array[i] = item ;
		}
	}

}
