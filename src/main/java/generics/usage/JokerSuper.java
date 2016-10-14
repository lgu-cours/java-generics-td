package generics.usage;

import generics.bean.Animal;
import generics.bean.Chat;
import generics.bean.Chien;
import generics.bean.Felin;

import java.util.LinkedList;
import java.util.List;

public class JokerSuper {

	private static void afficher ( List<? super Animal > list )
	{
		
	}
	
	public static void main(String[] args) {
		
		LinkedList<Object> listObject = new LinkedList<Object>();
		LinkedList<Animal> listAnimal = new LinkedList<Animal>();		
		LinkedList<Chat> listChat = new LinkedList<Chat>();
		
		//LinkedList<?> listJoker = new LinkedList<?>(); // ERROR
		LinkedList<?> listJoker = new LinkedList(); // WARNING : raw type

		LinkedList<? super Felin> listSuper ;
		listSuper = new LinkedList(); // WARNINGS : raw type + type safety
		listSuper = new LinkedList<Animal>();
		listSuper = new LinkedList<Felin>();
		//listSuper = new LinkedList<Chat>(); // ERROR : Type mismatch: cannot convert from LinkedList<Chat> to LinkedList<? super Felin>
		//listSuper = new LinkedList<Chien>(); // ERROR : Type mismatch: cannot convert from LinkedList<Chien> to LinkedList<? super Felin>
		
		afficher(listObject);
		afficher(listAnimal);
		//afficher(listChat);  // The method afficher(List<? super Animal>) in the type JokerSuper is not applicable for the arguments (LinkedList<Chat>)	
	}
	
}
