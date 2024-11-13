package com.java.arrays;

import java.util.Arrays;

public class SortingElementStrings {

	public static void main(String[] args) {
	
		String s[]= {"DDDD","CCCC","BBBB","AAAA"};
		System.out.println("before sorting strings :"+Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("after sorting strings :"+Arrays.toString(s));

	}

}
