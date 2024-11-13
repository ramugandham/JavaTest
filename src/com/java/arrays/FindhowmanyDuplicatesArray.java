package com.java.arrays;

public class FindhowmanyDuplicatesArray {

	public static void main(String[] args) {
	
		int a[]= {10,40,10,25,22,25,23,40,10};
		int num=10;
		int count=0;
		boolean status=false;
		
		for(int x:a){
			if(x==num) {
				count++;
			}
		}
			System.out.println(count);
		}
		
		
		
		
		
		
		

	

}
