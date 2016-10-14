package generics.bean;


public class Chien extends Canide 
{
	
	public Chien() {
		super("???");
	}
	
	public Chien(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Chien : " + getName() ;
	}

}
