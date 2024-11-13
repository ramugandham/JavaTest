package com.java;

public class First {
	
	public static void main(String[] args) {
		int a; //declaration
		a=100;//assignment
		int b=50;
		int x=(a<b)? a:b;
		System.out.println("hello java :"+x);
		a=30;
		System.out.println("hello java :"+(a+b));
		
		int person_age=10;
		String res = (person_age>=18)?"eligible":"not eligible";
		System.out.println(res);
		
	}

}
