package com.java.interviewqueprgms;

import java.util.Arrays;
import java.util.Collections;

public class SortingArray {

	public static void main(String[] args) {
		int a[]= {50,20,10,40,30};
		System.out.println("before sorting array is :"+Arrays.toString(a));
		//approch-1 using paralle sort method
		Arrays.parallelSort(a);
		System.out.println("after sorting array is :"+Arrays.toString(a));
		//approche -2
		Arrays.sort(a);
		System.out.println("after sorting array is :"+Arrays.toString(a));
		//approch-3 reverse order or descending order sorting
		
		Integer b[]= {3,5,7,10,2,6,15};
		System.out.println("before sorting array is :"+Arrays.toString(b));
		Arrays.sort(b,Collections.reverseOrder());
		System.out.println("after revrseorder sorting array is :"+Arrays.toString(b));
	}

}
