package com.java.interviewqueprgms;

public class MaxAndMinNumberInArray {

	public static void main(String[] args) {
		int a[]= {50,20,100,40,60};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
         System.out.println("maximum element in array is:"+max);
         
         int min=a[0];
 		for(int i=1;i<a.length;i++) {
 			if(a[i]<min) {
 				min=a[i];
 			}
 		}
          System.out.println("minimum element in array is:"+min);
           
         
	}

}
