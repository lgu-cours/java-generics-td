package generics.td8;

public class TestCommande {

	public static void main(String[] args) {
		
		Particulier part = new Particulier("Dupont", 1);
		
		Commande<Particulier, Jouet> cmde = new Commande<Particulier, Jouet>( part );
		
		cmde.ajouterArticle( new Jouet("Aaaa", 20, 2 ) );
		cmde.ajouterArticle( new Jouet("Bbbb", 40, 2 ) );
		// cmde.ajouter( new Vetement() ); // Jouet uniquement 
		
		cmde.imprimer();
		
		
	}
	
}
