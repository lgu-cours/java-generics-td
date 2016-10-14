package generics.method;

// Classe standard ( sans type paramétré )
public class Util {

	// Methode standard ( sans type paramétré )
	public void setIfNull( Object[] array, Object item, int i )
	{
		if ( array[i] == null )
		{
			array[i] = item ;
		}
	}

	// Methode générique ( avec type paramétrée )
	public <T> void genericSetIfNull( T[] array, T item, int i )
	{
		if ( array[i] == null )
		{
			array[i] = item ;
		}
	}

}
