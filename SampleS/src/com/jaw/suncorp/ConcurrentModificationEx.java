package com.jaw.suncorp;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;


public class ConcurrentModificationEx {

	public static void main(String[] args) {

	// Copyonwrite ArrayList
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("Sew");
		list.add("Achu");
		list.add("Mary");
		
		for(String st:list) {
			list.remove("Sew");
		}
		
		/*Iterator<String> iter = list.iterator();

		while (iter.hasNext()) {
		    String str = iter.next();
System.out.println(""+str);
		   if(str.equals("Sew")) {
			   list.remove("Sew");
		   }
		      
		  
		}*/
		System.out.println(""+list);
		
		// another way ConcurrentHashmap
		
		Map<Integer,String> map = new ConcurrentHashMap<>();
		map.put(1, "Swathi");
		map.put(2, "Mary");
		map.put(3, "Achu");
		
		Iterator<Integer> itr= map.keySet().iterator();
		while(itr.hasNext()) {
			Integer in = itr.next();
			if(in==1) {
				map.remove(1);
			}
		}
		System.out.println(map);
		
		// another way Remove if java 8
		List<String> lists = new ArrayList<>(Arrays.asList("a", "b", "c"));
		lists.removeIf(e -> (e.equals("a")));
		for (String str : lists) { 
            System.out.println(str); 
        } 
	}

	
}
