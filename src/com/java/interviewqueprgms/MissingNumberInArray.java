package com.java.interviewqueprgms;

public class MissingNumberInArray {

	public static void main(String[] args) {
		//array should not have duplicates and no need sorted order and value should be range only one number missing applicable
	
		int a[]= {1,2,3,4,5,6,7,9,10};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("sum of element in array:"+sum1);
		int sum2=0;
		for(int i=1;i<=10;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum ofrange element in array:"+sum2);
         System.out.println("missing number  of array is:"+(sum2-sum1));
	}

}
