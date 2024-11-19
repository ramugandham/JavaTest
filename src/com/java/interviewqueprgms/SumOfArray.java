package com.java.interviewqueprgms;

public class SumOfArray {

	public static void main(String[] args) {
		int a[]= {4,5,7,9,2};
		int sum=0;
		/*
		 * for(int i=0;i<=a.length-1;i++) { sum=sum+a[i];
		 * 
		 * }
		 */
		//enhanced for loop
		for(int value:a) {
			sum=sum+value;
		}
        System.out.println("sum of array element:"+sum);
	}

}
