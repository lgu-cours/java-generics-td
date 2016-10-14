package generics.usage;

import generics.Util;
import generics.bean.Animal;
import generics.bean.Chat;
import generics.bean.Chien;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Heritage {
	
	public static void afficher( LinkedList<?> list ) {
		System.out.println("afficher( LinkedList<?> list )");
		for ( Object i : list )
		{
			System.out.println(" . " + i);
		}
	}
	public static void afficherAnimaux( LinkedList<Animal> list ) {
		System.out.println("afficherAnimaux( LinkedList<Animal> list )");
		for ( Animal i : list )
		{
			System.out.println(" . " + i);
		}
	}

	public static void afficherChats( LinkedList<Chat> list ) {
		System.out.println("afficherChats( LinkedList<Chat> list )");
		for ( Chat i : list )
		{
			System.out.println(" . " + i);
		}
	}
	
	public static void afficherExtAnimaux( LinkedList<? extends Animal> list ) {
		System.out.println("afficherExtAnimaux( LinkedList<? extends Animal> list )");
		/*
		if ( list instanceof LinkedList<Animal> ) // ERROR ( car effacement de type )
		{
			
		}
		*/
		for ( Animal i : list )
		{
			System.out.println(" . " + i);
		}
	}
	
	public static void afficherSuperAnimaux( LinkedList<? super Animal> list ) {
		System.out.println("afficherSuperAnimaux( LinkedList<? extends Animal> list )");
//		if ( list instanceof LinkedList<Chat> ) // ERROR ( car effacement de type )
//		{
//			
//		}
		for ( Object i : list )
		{
			System.out.println(" . " + i);
		}
	}
	
	public static void heritageList() {
		
		LinkedList<Chat> linkedList = new LinkedList<Chat>();
		Vector<Chat> vector = new Vector<Chat>();
		ArrayList<Chat> arrayList = new ArrayList<Chat>();
		
		LinkedList<Chien> linkedListChien = new LinkedList<Chien>();
		
		List<Chat> list = null ; 
		list = linkedList ;
		list = vector ;
		list = arrayList ;
		
		//list = linkedListChien ; // ERROR
	}
	
	public static void testExtends() {
		
		LinkedList list = new LinkedList(); 

		// Le joker ne peut pas être utilisé pour instancier une classe
		//LinkedList<?> listJoker = new LinkedList<?>(); // ERROR
		LinkedList<?> listJoker = new LinkedList(); 
		LinkedList<?> listJoker2 = new LinkedList<Animal>(); 
		LinkedList<?> listJoker3 = new LinkedList<String>(); 
		LinkedList<?> listJoker4 = new LinkedList<Chat>(); 

		LinkedList<Animal> listAnimal = new LinkedList<Animal>();
		LinkedList<Animal> listAnimal2 = new LinkedList(); // WARNING
		//LinkedList<Animal> listAnimal3 = new LinkedList<Chat>(); // ERROR
		
		LinkedList<Chat> listChat = new LinkedList<Chat>(); 
		LinkedList<Chat> listChat2 = new LinkedList(); // WARNING
		listChat.add(new Chat("Sylvestre"));
		listChat.add(new Chat("Hercule"));
		
		LinkedList<Chien> listChien = new LinkedList<Chien>(); 
		LinkedList<Chien> listChien2 = new LinkedList(); // WARNING

		// Le joker ne peut pas être utilisé pour instancier une classe
		//LinkedList<? extends Animal> listExtAnimal = new LinkedList<? extends Animal>(); // ERROR
		LinkedList<? extends Animal> listExtAnimal = new LinkedList<Animal>();
		LinkedList<? extends Animal> listExtAnimal2 = new LinkedList(); // WARNING
		LinkedList<? extends Animal> listExtAnimal3 = new LinkedList<Chat>();
		LinkedList<? extends Animal> listExtAnimal4 = new LinkedList<Chien>();
		//LinkedList<? extends Animal> listExtAnimal4 = new LinkedList<String>(); // ERROR
		
		listAnimal.add( new Chat("felix") ) ;
		listAnimal.add( new Chien("pif") ) ;
				
		//===============================================================================
		//--- Une liste non typée peut référencer tout type de liste typée
		list = listJoker ;
		list = listExtAnimal ;
		list = listAnimal ;
		list = listChat ;
		list = listChien ;
		
		//--- NB : Permet d'injecter tout type d'objets dans la liste !
//		list.add(new Chien("aaa")); // WARNING
//		list.add( "aaa" ); // WARNING
//		list.add( new Integer(123) ); // WARNING
		Util.printList(list);
		
		//===============================================================================
		listJoker = list ;
		listJoker = listExtAnimal ;
		listJoker = listAnimal ;
		listJoker = listChat ;

//		listJoker.add(new Chien("aaa")); // ERROR
//		listJoker.add( "aaa" ); // ERROR
//		listJoker.add( new Integer(123) ); // ERROR
//		
//		listJoker2.add(new Chien("aaa")); // ERROR
		Util.printList(listJoker);

		//===============================================================================
		// pas de relation d'héritage entre  LinkedList<Animal> et LinkedList<Chat>
		//listAnimal = listChat ; // ERROR
		//listAnimal2 = listChat ; // ERROR
		
		//===============================================================================
		//listExtAnimal = listJoker ; // ERROR
		listExtAnimal = listChat ;
		listExtAnimal = listChien ;
		//listExtAnimal.add(new Chien("aaa")); // ERROR
		//listExtAnimal.get(0);
	
//		LinkedList<Chien> listChien8 = (LinkedList<Chien>) listExtAnimal; // WARNING
//		LinkedList<Chien> listChien9 = (LinkedList<Chien>) listAnimal; // ERROR

		//===============================================================================
		afficher(listChat);
		afficherExtAnimaux(listChat);
		afficherExtAnimaux(listChien);
		//afficherAnimaux(listChat); // ERROR
		afficherChats(listChat);
		afficherAnimaux(listAnimal);
		
		afficherSuperAnimaux(listAnimal);
		//afficherSuperAnimaux(listChat); // ERROR
	}
	
	
	public static void main(String[] args) {
	
		testExtends();
		
		Chat[] chats = new Chat[10];
		Animal[] animaux = chats ;
		
		LinkedList<Chat> listChats = new LinkedList<Chat>();
		
		// LinkedList<Animal> listAnimaux = listChats; // ERROR
		
	}
}
