package com.java.arrays;

import java.util.Arrays;

public class SortingElementArray {

	public static void main(String[] args) {
	
		int a[]= {10,40,70,25,30};
		System.out.println("before sorting array is :");
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
    	System.out.println("after sorting array is :");
        System.out.println(Arrays.toString(a));
        
		/*
		 * for(int x:a){ if(x==search) { System.out.println("element is found");
		 * status=true; break; } }
		 * 
		 * if(status==false) { System.out.println("Element not found"); }
		 */

	}

}
