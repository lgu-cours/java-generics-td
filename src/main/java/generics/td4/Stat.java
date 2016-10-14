package generics.td4;

class Stat<T extends Number> 
{ 
	T[] nums; // Tableau de "Number" ou sous-classe de "Number"
	   
	// Constructeur avec tableau de nombres
	Stat(T[] p) 
	{ 
		nums = p; 
	} 
	 
	// Return type double in all cases.
	double average() 
	{ 
		double sum = 0.0;		
		for(int i=0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}		
		return sum / nums.length;
	} 
  
	//boolean sameAvg(Stat<T> p) // Pas souple : impose que le parametre soit du même type T  
	//boolean sameAvg(Stat<?> p) // OK : parametre = Stat de n'importe quel type T  
	//boolean sameAvg(Stat p) // OK : parametre = Stat de n'importe quel type T  
	boolean sameAvg(Stat<? extends Number> p) // OK : parametre = Stat de n'importe quel type T  
	{
		System.out.println( p.getClass().getName() );
		if(average() == p.average()) {
			return true;
		} else {
			return false;
		}
	}

} 

