package generics.td1;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Test;

public class HashMapTest {

	@Test
	public void test1() {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		//--- Methode "put" fortement typée
		hm.put(new Integer(44), "Loire-Atlantique" );
		hm.put(new Integer(49), "Maine et Loire" );
		hm.put(new Integer(35), "Ille et Vilaine" );
		hm.put(new Integer(85), "Vendée" );
		hm.put(1,"Ain"); // Autoboxing
		//hm.put("44", "Loire-Atlantique"); // ERR : type HashMap<Integer,String> not applicable 

		//--- Methode "get" faiblement typée : get(Object)
		System.out.println("-----");
		System.out.println( " . 44 : "  + hm.get(new Integer(44)) ) ; 	
		System.out.println( " . 44 : "  + hm.get(44) ) ;	// Autoboxing	
		System.out.println( " .  1 : "  + hm.get(1) ) ;	// Autoboxing 	
		System.out.println( " . 12 : "  + hm.get(12) ) ;	// Autoboxing 	
		
		System.out.println("-----");
		System.out.println( " . 44 : "  + hm.get(new Long(44)) ) ;	// Not found : pas d'ERR de compil 	
		System.out.println( " . 44 : "  + hm.get("44") ) ;	//  Not found : pas d'ERR de compil
		
		assertTrue(true);
	}

}
