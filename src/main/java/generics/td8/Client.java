package generics.td8;

public abstract class Client {

	private String nom = "???" ;
	private int    code = 0 ;
	
	
	public Client(String nom, int code) {
		super();
		this.nom = nom;
		this.code = code;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getCode() {
		return code;
	}


	public void setCode(int code) {
		this.code = code;
	}


	@Override
	public String toString() {
		return code + " " + nom ;
	}
	
	
}
