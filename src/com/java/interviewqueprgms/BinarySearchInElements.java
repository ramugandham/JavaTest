package com.java.interviewqueprgms;

import java.util.Arrays;

public class BinarySearchInElements {

	public static void main(String[] args) {
		//binary search means not search entire elements only oneside elements only
		//first to find midd value based on mid value (l+H)/2
		//H=Min-1   L=min+1  array should be sorted order only
		int a[]= {1,2,3,4,5,6,7,8,9};
		boolean flag=false;
		int key=5;
		int l=0;
		int h=a.length-1;
		
		while(l<h) {
			int m=(l=h)/2;
			if(a[m]==key) {
				System.out.println("element is found");
				flag=true;
				break;
			}
			if(a[m]<key) {
				l=m+1;
			}if(a[m]>key) {
				h=m-1;
			}
			
		}
		if (flag==false) {
			System.out.println("element is not found");
		}
		//approche -2 Arrays.binarySearch(a, 8)
		System.out.println("binary searching ele position is :"+Arrays.binarySearch(a, 8));

	}

}
