package generics.usage;

import generics.bean.Animal;
import generics.bean.Chat;

import java.util.LinkedList;

public class Limitations {

	public void add1(Chat a, LinkedList<Animal> list )
	{
		list.add( a );		
	}

	public void add2(Chat a, LinkedList<? extends Animal> list )
	{
		// list.add( a );		
		// ERROR :
		// The method add(capture#1-of ? extends Animal) in the type LinkedList<capture#1-of ? extends Animal> is not applicable for the arguments (Chat)

	}
	
	public void add3(Animal a, LinkedList<Animal> list )
	{
		list.add( a );		
	}
	
//	public void add4( <? extends Animal> a, LinkedList<? extends Animal> list ) // SYNTAX ERROR
//	{
//		list.add( a );		
//	}

	public <T> void add5( T a, LinkedList<T> list )
	{
		list.add( a );		
	}

}
