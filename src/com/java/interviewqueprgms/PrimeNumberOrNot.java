package com.java.interviewqueprgms;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		if (num > 0) {

			for (int i = 1; i <= 10; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("is prime number");
			} else {
				System.out.println("is not prime number");
			}
		} else {
			System.out.println("is not prime number");
		}
	}
}
