package com.java.oops;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		 ArrayList arrlist = new ArrayList();
		 arrlist.add(100);
		 arrlist.add(10.5);
		 arrlist.add('A');
		 arrlist.add("str");
		 arrlist.add(true);
		 arrlist.add(null);
		 arrlist.add(null);
		 arrlist.add("str");
		 arrlist.add('A');
		 System.out.println(arrlist);
		int ar = arrlist.size();
        System.out.println(ar);
        arrlist.remove(5);
        System.out.println(arrlist);
        arrlist.add(2, 500);
        System.out.println(arrlist);
        arrlist.set(2, "java");
        System.out.println(arrlist);
        System.out.println(arrlist.get(2));
        //for loop
       for(int i=0;i<arrlist.size();i++) {
    	   System.out.println(arrlist.get(i));
       }
       // for each loop
       for( Object x:arrlist) {
    	   System.out.println(x);
       }
       //using iterator
      Iterator itr = arrlist.iterator();
      while (itr.hasNext()) {
		System.out.println(itr.next());
		
	}
      System.out.println("arraylist is empty or not "+arrlist.isEmpty());
      
      
	}

}
