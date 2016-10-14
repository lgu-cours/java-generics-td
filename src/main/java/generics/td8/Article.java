package generics.td8;

public class Article {

	private String nom = "" ;
	
	private double prix = 0.0 ;
	
	private int    codeTVA = 0 ;

	public Article(String nom, double prix, int codeTVA) {
		super();
		this.nom = nom;
		this.prix = prix;
		this.codeTVA = codeTVA;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getCodeTVA() {
		return codeTVA;
	}

	public void setCodeTVA(int codeTVA) {
		this.codeTVA = codeTVA;
	}

	public String toString() {
		return nom + " : prix = " + prix + " ( code TVA : " + codeTVA + " ) ";
	}

	
	
}
