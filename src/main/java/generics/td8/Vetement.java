package generics.td8;

public class Vetement extends Article {

	String taille = "" ;
	
	public Vetement(String nom, double prix, int codeTVA) {
		super(nom, prix, codeTVA);
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}

	
}
