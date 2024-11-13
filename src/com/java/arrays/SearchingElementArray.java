package com.java.arrays;

public class SearchingElementArray {

	public static void main(String[] args) {
	
		int a[]= {10,40,70,25};
		int search=40;
		boolean status=false;
		
		/*
		 * for(int i=0;i<a.length;i++) {
		 * 
		 * if(a[i]==search) { System.out.println("element is found"); status=true;
		 * break; } }
		 */
		//foreach loop
		
		
		for(int x:a){
			if(x==search) {
				System.out.println("element is found");
				status=true;
				break;
			}
		}
		
		if(status==false) {
			System.out.println("Element not found");
		}
		
		
		
		
		
		
		

	}

}
