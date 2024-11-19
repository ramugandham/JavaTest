package com.java.interviewqueprgms;

import java.util.Scanner;

public class Largestof3numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  System.out.println("enter the first number:");
		  int a=sc.nextInt();
		  System.out.println("enter the second number:");
		  int b=sc.nextInt();

		  System.out.println("enter the third number:");
		  int c=sc.nextInt();
		  
			/*
			 * if(a>b&&a>c) { System.out.println(a+":largest num"); }else if (b>a&&b>c) {
			 * System.out.println(b+":largest num"); }else {
			 * System.out.println(c+":largest num"); }
			 */
        //ternary operator?
		/*
		 * int largest1=a>b?a:b; int largest2=c>largest1?c:largest1;
		 * System.out.println(largest2+":is largest number");
		 */
       int largest=c>(a>b?a:b)?c:(a>b?a:b);
       System.out.println(largest+":largest num is ");
       
	}

}
