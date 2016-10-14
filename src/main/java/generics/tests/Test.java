package generics.tests;

import generics.bean.Animal;
import generics.bean.Chat;
import generics.bean.Chien;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void printAnimaux(List list)
	{
		for ( Object o : list )
		{
			System.out.println(" . " + o );
		}
	}
	
	public static List creerAnimaux(Class cl)
	{
		LinkedList list = new LinkedList();
		try {
			for ( int i = 0 ; i < 10 ; i++ )
			{
				Object o = cl.newInstance();
				if ( o instanceof Animal )
				{
					list.add(o);
				}
				else
				{
					System.out.println("invalid class " + cl.getName() ) ;
					return list;
				}
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return list ;
	}
	
	public static List<Animal> creerAnimauxGen(Class<? extends Animal> cl)
	{
		LinkedList<Animal> list = new LinkedList<Animal>();
		try {
			for ( int i = 0 ; i < 5 ; i++ )
			{
				Animal o = cl.newInstance();
				list.add(o);
			}
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return list ;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//List list = creerAnimaux(Chien.class) ; // OK
		List list = creerAnimaux(StringBuffer.class) ; // Pas de controle
		printAnimaux(list);
		
		List<Animal> chats  = creerAnimauxGen(Chat.class) ; // OK
		printAnimaux(chats);
		
		List<Animal> chiens = creerAnimauxGen(Chien.class) ; // OK
		printAnimaux(chiens);
		
		List<Animal> animaux = creerAnimauxGen(Animal.class) ; // Runtime error car Animal non instantiable
		printAnimaux(animaux);
		
		// List<Chat> chats = creerAnimauxGen(StringBuffer.class) ; // Compil error
	}

}
