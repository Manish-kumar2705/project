package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Vector;

public class CollectionMain {
	public static void main(String[] args) {
		//arraylist
	ArrayList<Integer> list = new ArrayList<>();    
	System.out.println("ArrayList :");
	list.add(1);
	list.add(2);
	list.add(3);
	list.add(null);
	list.add(05);
	//can also use for(int i : list) sysout("i");
	Iterator<Integer> itr = list.iterator();  // iterator fn return the iterator on list
	while(itr.hasNext()) {					// has.next boolean return true if next element is present;
		System.out.println(itr.next());
	}
	
	//vectors
	System.out.println("\nvector:");
	Vector<String> v = new Vector<>();
	v.addElement("ankit");
	v.addElement("manish");
	//System.out.println(v);  print result in horizontal : [ankit, manish];
	Iterator<String> itr1 =v.iterator();  
	while(itr1.hasNext()) {					
		System.out.println(itr1.next());
	}
	
	//Linkedlist
	System.out.println("\nLinkedList:");
	LinkedList<Integer> li = new LinkedList<>();
	li.add(1);
	li.add(2);
	Iterator<Integer> itr2 = li.iterator();
	while(itr2.hasNext()) {
		System.out.println(itr2.next());
	}
	//hashset   //unordered, unique
	System.out.println("\nhashset:");
	HashSet<String> name = new HashSet<>();
	name.add(null);
	name.add("ankit");
	name.add("manish");
	for(String i :name) {
		System.out.println(i);
	}
	
	System.out.println("\npriority queue");
	PriorityQueue<Integer> pq = new PriorityQueue<>();
	pq.add(4); //no null is allowed
	pq.add(46); // priority queue only orders by the very first char, or number of the whole word or number --4 not 6 in 46.
	pq.add(2);
	for(int i : pq ) {
		System.out.println(i);
	}
	
	System.out.println("\nhash map");		//hashmap based on hashtable principle
	HashMap<Integer,String>  hm = new HashMap<>();
	hm.put(1,"manish");
	hm.put(2,"naman");
	hm.put(3,"sakshi");
	hm.put(3,"ashish");
	//doubt here,
	 for(Map.Entry i : hm.entrySet()){    
		    System.out.println(i.getKey()+" "+i.getValue());    
		   }  

	}
	

}
