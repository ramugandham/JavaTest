package com.java.interviewqueprgms;

public class FactorialNum {

	public static void main(String[] args) {
		int num=5;
		long fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial number is ascn:"+fact);
		int num1=5;
		long fact1=1;
		for(int i=num1;i>=1;i--) {
			fact1=fact1*i;
		}
		System.out.println("factorial number is descn:"+fact1);
	}

}
