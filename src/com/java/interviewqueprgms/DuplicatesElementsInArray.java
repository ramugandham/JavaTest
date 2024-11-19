package com.java.interviewqueprgms;

import java.util.HashSet;

public class DuplicatesElementsInArray {

	public static void main(String[] args) {
		String arr[]= {"java","python","c","java","c","c++"};
		boolean flag=false;
		/*
		 * //apporch-1 for(int i=0;i<arr.length;i++) { for(int j=i+1;j<arr.length;j++) {
		 * if(arr[i]==arr[j]) {
		 * System.out.println("duplicate elements in array found:"+arr[i]); flag=true; }
		 * 
		 * }
		 * 
		 * } if(flag==false) { System.out.println("duplicate elements not found"); }
		 */
		
		//approch -2 using hashset 
		
		HashSet<String>hs=new HashSet<>();
		for(String l:arr) {
			if(hs.add(l)==false) {
				System.out.println("duplicate elements found:"+l);
				flag=true;
			}
			
			
		}
		if(flag==false) {
			System.out.println("not found duplicate elements");
		}
	}

}
