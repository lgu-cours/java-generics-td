package generics.td2;

public class Capsule<T> {
	
	  private T obj; // un objet de type T
	  
	  // Constructeur avec en paramètre un objet de type T
	  public Capsule(T o) {
	    obj = o;
	  }

	  // Return ob.
	  public T getObj() {
	    return obj;
	  }

	  // Show type of T.
	  public void showType() {
		  //T.class ; // not possible 
		  System.out.println("Type of T is " + obj.getClass().getName());
	  }

	  public Class<?> getObjClass() {
		  //T.class ; // not possible 
		  return obj.getClass();
	  }

	@Override
	public String toString() {
		return "Capsule object : " + obj.toString();
	}
	  
}
