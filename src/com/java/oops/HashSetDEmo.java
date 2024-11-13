package com.java.oops;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDEmo {

	public static void main(String[] args) {
		
             HashSet hset=new HashSet<>();
             hset.add(100);
             hset.add(10.5);
             hset.add('A');
             hset.add("str");
             hset.add(true);
             hset.add(null);
             hset.add(null);
             hset.add("str");
             hset.add('A');
             System.out.println(hset);
             System.out.println("after removing:"+hset.remove("str")+hset);
             //inserting element not possible 
             //access specific element not possible
             
             //but to covert to hashset to arraylist
             ArrayList arrlist = new ArrayList(hset);
             System.out.println(arrlist);
             System.out.println(arrlist.get(1));
             
             // for each loop
             for( Object x:hset) {
          	   System.out.println(x);
             }
             Iterator itr = hset.iterator();
             while (itr.hasNext()) {
       		System.out.print(itr.next());
       		
       	}
             
	}

}
