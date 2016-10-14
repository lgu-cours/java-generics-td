package generics.td4;

public class TestStat {
	
	  public static void main(String args[]) { 

		    Integer inums[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		    Stat<Integer> statInt = new Stat<Integer>(inums);
		    double v = statInt.average();
		    System.out.println(" average = " + v);

		    Double d1[] = { 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.0, 9.123 };
		    Stat<Double> statd1 = new Stat<Double>(d1);
		    double ad1 = statd1.average();
		    System.out.println(" average d1 = " + ad1);

		    String strs[] = { "1", "2", "3", "4", "5" };
		    // ERR : String n'est pas une sous classe de Number  
//		    Stats<String> strob = new Stats<String>(strs); 
		 
		    
		    System.out.println(" Same average ? " + statInt.sameAvg(statd1) ) ; 
		    // Err de compil. si : sameAvg(Stat<T> p)
		    // OK si : sameAvg(Stat<?> p)

		    Double d2[] = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0 };
		    Stat<Double> statd2 = new Stat<Double>(d2);
		    double ad2 = statd2.average();
		    System.out.println(" average d2 = " + ad2);
		    System.out.println(" Same average ? " + statd2.sameAvg(statInt) ) ; 
		  } 

}
