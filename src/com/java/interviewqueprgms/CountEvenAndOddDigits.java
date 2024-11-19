package com.java.interviewqueprgms;

public class CountEvenAndOddDigits {

	public static void main(String[] args) {
	int num=12345542;
	int evencount=0;
	int oddcount=0;
	while (num>0) {
		int rem=num%10;
		if (rem%2==0)
		{
			evencount++;
		}
		else {
			oddcount++;
		}
		num=num/10;
	}
	System.out.println("number is even:"+evencount);
	System.out.println("number is odd:"+oddcount);
	}

}
