package generics.examples.comparable;

public class PersonneV2 implements Comparable<String> // , Comparable<String> // Cannot be implemented more than once
{
	private String nom;
	private String prenom;
	
	public PersonneV2(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	@Override
	public int compareTo(String other) {
		
		String s = this.prenom + "-" + this.nom ;
		return s.compareTo(other) ;
	}

}
