package generics.td3;

public class Lien<T1,T2> {

	  private T1 ob1;
	  private T2 ob2;
	  
	  // Pass the constructor a reference to 
	  // an object of type T.
	  Lien(T1 p1, T2 p2) {
	    ob1 = p1;
	    ob2 = p2;
	  }

	  // Show types of T and V.
	  public void showTypes() {
	    System.out.println("Types : T1 = " + ob1.getClass().getName()
	    					+ " T2 = " + ob2.getClass().getName()
	                       );

	  }

	  public T1 getob1() {
	    return ob1;
	  }

	  public T2 getob2() {
	    return ob2;
	  }

}
