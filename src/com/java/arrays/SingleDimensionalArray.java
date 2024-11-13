package com.java.arrays;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		a[0]=10;
		a[1]=13;
		a[2]=11;
		a[3]=14;
		a[4]=9;
		//2nd way
		int b[]= {15,16,18,19};
		System.out.println("length of array:"+b.length);
		System.out.println(a[2]);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			
		}
		for(int x:a){
			System.out.println("for each loop"+x);
			
		}
	}

}
