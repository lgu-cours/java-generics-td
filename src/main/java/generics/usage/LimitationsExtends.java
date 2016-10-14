package generics.usage;

import generics.bean.Animal;
import generics.bean.Chat;
import generics.bean.Felin;

import java.util.Collection;
import java.util.LinkedList;

public class LimitationsExtends<T extends Animal> {

	public void copier(Animal tab[], Collection<? extends Animal> collec )
	{
		for ( Animal item : tab )
		{
			System.out.println(" . item : " + item );
			// collec.add( item ); // ERROR : The method add(capture#...) is not applicable for the arguments(Animal)
		}
	}

	public void copier(Object tab[], Collection<? extends Animal> collec )
	{
		for ( Object item : tab )
		{
			System.out.println(" . item : " + item );
			if ( item instanceof Animal )
			{
				// collec.add( (Animal) item ); // ERROR : The method add(capture#...) is not applicable for the arguments(Animal)
			}
		}
	}

	public void add(Animal a, LinkedList<Animal> list )
	{
		list.add( a );
	}
	
	public void add2(Felin felin, LinkedList<? extends Animal> list )
	{
		// list.add( felin ); // ERROR : The method add(capture#...) is not applicable for the arguments(Felin)
	}
	
	public void add3(Chat a, LinkedList<? extends Animal> list )
	{
		// list.add( a ); // ERROR : The method add(capture#...) is not applicable for the arguments(Chat)
	}

	
	private LinkedList<T> animals = new LinkedList<T>() ; 
	
	public void add4(Chat a )
	{
		// animals.add( a ); // ERROR : The method add(T) is not applicable for the arguments(Chat)
	}
}
