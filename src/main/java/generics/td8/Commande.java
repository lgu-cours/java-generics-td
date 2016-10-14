package generics.td8;

import java.util.LinkedList;

public class Commande<C extends Client, A extends Article > {

	private C client ;
	
	private LinkedList<A> articles = new LinkedList<A>() ;

	public Commande(C client ) {
		super();
		this.client = client;
	}
	
	public void ajouterArticle ( A article )
	{
		articles.add(article);
	}
	
	public void imprimer ()
	{
		System.out.println(" Commande de " + client );
		for ( A a : articles )
		{
			System.out.println(" . " + a );
		}
	}
	
}
