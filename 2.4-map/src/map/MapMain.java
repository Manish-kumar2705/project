package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {
	public static void main(String[] args) {
		System.out.println("\nHash map");		//hashmap based on hashtable principle
		HashMap<Integer,String>  hm = new HashMap<>();
		hm.put(1,"manish");									//random
		hm.put(2,"naman");
		hm.put(3,"sakshi");
		hm.put(3,"ashish");
		//doubt here,
		 for(Map.Entry i : hm.entrySet()){    
			    System.out.println(i.getKey()+" "+i.getValue());    
			   }  
		 LinkedHashMap<Integer,String> ht=new LinkedHashMap<Integer,String>();  
	      
	      ht.put(4,"dineesh");  					//mainatains insertion order
	      ht.put(3,"cat");  
	      ht.put(2,"bhanu");  
	      ht.put(1,"anuj");  

	      System.out.println("\nHash Table");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	       
	      }
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();     //sorts according to key
	      map.put(3,"manish");    
	      map.put(2,"ankit");    
	      map.put(1,"Cajaya");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    

	}
}
