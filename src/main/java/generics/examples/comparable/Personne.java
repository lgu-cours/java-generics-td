package generics.examples.comparable;

public class Personne implements Comparable<Personne> // , Comparable<String> // Cannot be implemented more than once
{
	private String nom;
	private String prenom;
	
	public Personne(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public int compareTo(Personne other) {
		
		int result = this.prenom.compareTo(other.prenom);
		if ( result != 0 ) return result ;
		
		result = this.nom.compareTo(other.nom) ;
		
		return result ;
	}

}
