package generics.bean;

public class Chat extends Felin 
{
	public Chat() {
		super("???");
	}
	
	
	public Chat(String name) {
		super(name);
	}

	public void miauler()
	{
		System.out.println("miaou");
	}


	@Override
	public String toString() {
		return "Chat : " + getName() ;
	}
	
	
}
