package com.java.interviewqueprgms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("enter the number:");
	  int num=sc.nextInt();
	  int rev=0;
	  while (num!=0) {
		rev=rev*10 + num%10; //o+1234%10=4,40+3=43,430+2=432,4320+1=4321
		num=num/10;//1234/10=123,123/10=12,12/10=1, 1/10=0
		
		
	}
	  System.out.println("reverse number is :"+rev);
	  //using string buffer 
	  int num1=2345;
	  StringBuffer sb=new StringBuffer(String.valueOf(num1));
	  StringBuffer rev1=sb.reverse();
	  System.out.println("reverse number in string buffer is:"+rev1);
	  //using string builder
	  int num2=9876;
	  StringBuilder sb1=new StringBuilder();
	  sb1.append(num2);
	  StringBuilder rev2=sb1.reverse();
	  System.out.println("reverse number in string builder is:"+rev2);

	}

}
