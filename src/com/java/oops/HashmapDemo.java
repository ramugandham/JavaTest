package com.java.oops;

import java.util.HashMap;
import java.util.Iterator;

public class HashmapDemo {

	public static void main(String[] args) {
	
		HashMap map=new HashMap();
		
		map.put(101, "ramu");
		map.put(102, "hi");
		map.put(103, "hello");
		map.put(104, "java");
		map.put(101, "test");
		System.out.println(map);
		System.out.println(map.size());
		map.remove(101);
		System.out.println(map);
		System.out.println(map.get(102));
		//get all keys data
		System.out.println(map.keySet());
		//get all values data
		System.out.println(map.values());
		//get all key&values data
				System.out.println(map.entrySet());
				 // for each loop
	             for( Object x:map.keySet()) {
	          	   System.out.println(map.get(x));
	             }
	             Iterator itr = map.entrySet().iterator();
	             while (itr.hasNext()) {
	       		System.out.println(itr.next());
	       		Object entry = itr.next();
	       		//System.out.println(entry.getKey()+""  +entry.getValue());
	       		
	       		
	       	}
		
	}
}
