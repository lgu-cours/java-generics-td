package generics.examples.param;

import java.util.Date;
import java.util.Set;

public class TestParam {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Param<Integer> poids = new Param<Integer> ("poids", 65);
		
		ParamsMap<Integer> paramsInt = initParamsInteger();
		printParams(paramsInt);
		
		Param<Integer> poids2 = paramsInt.getParam("poids");
		System.out.println("poids2 = " + poids2 + " class " + poids.getValueClass() );
		
		ParamsMap<Date> paramsDate = initParamsDate();
		printParams(paramsDate);
		
		ParamsMap<Number> paramsNumber = initParamsNumber();
		printParams(paramsNumber);

	}
	
	public static ParamsMap<Integer> initParamsInteger() {
		Param<Integer> poids = new Param<Integer> ("poids", 65);
		Param<Integer> hauteur = new Param<Integer> ("hauteur", 123);
		
		ParamsMap<Integer> params = new ParamsMap<Integer>();
		params.storeParam(poids);
		params.storeParam(hauteur);
		
		return params ;
	}	

	public static ParamsMap<Date> initParamsDate() {
		Param<Date> now = new Param<Date> ("now", new Date() );
		ParamsMap<Date> params = new ParamsMap<Date>();
		params.storeParam(now);
		return params ;
	}	
	
	public static ParamsMap<Number> initParamsNumber() {
		ParamsMap<Number> params = new ParamsMap<Number>(); // OK
		//ParamsMap<? extends Number> params = new ParamsMap<? extends Number>(); // ERR
		//ParamsMap<? extends Number> params = new ParamsMap<Number>(); // ERR / store
		
		Param<Number> poids = new Param<Number>("poids", 67) ;
		params.storeParam(poids);
		Param<Number> largeur = new Param<Number>("largeur", 67.12) ;
		params.storeParam(largeur);
		params.storeParam(new Param<Number>("prix", 89.25));
		
		return params ;
	}	
	
	public static void printParams(ParamsMap<?> params ) {
		Set<String> names = params.getNames();
		System.out.println( names.size() + " parameter(s) : ");
		for ( String name : names ) {
			Param<?> param = params.getParam(name);
			System.out.println(" . " + param );
		}
	}
}
