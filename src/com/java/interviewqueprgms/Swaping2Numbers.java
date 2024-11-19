package com.java.interviewqueprgms;

public class Swaping2Numbers {

	public static void main(String[] args) {
	
		int a=10;
		int b=20;
		//using 3rd variable
		System.out.println("before swaping :"+a+" "+b);
		int t=a;
		a=b;
		b=t;
		System.out.println("after swaping :"+a+" "+b);
		//using without 3rd variable using + - operators
		System.out.println("before swaping + - operators:"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swaping + - operators :"+a+" "+b);
		//using * / operators with out using 3rd varibale a, b are not zero using logic
		System.out.println("before swaping * /:"+a+" "+b);
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after swaping * / operators :"+a+" "+b);
		//using xor ^ operator
		System.out.println("before swaping using xor ^:"+a+" "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("after  swaping using xor ^:"+a+" "+b);
		//single statement
		b=a+b -(a=b);
		System.out.println("after  swaping using single line :"+a+" "+b);
	}

}
