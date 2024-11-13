package com.java;

public class WhileLoop {

	public static void main(String[] args) {
		// approach 1
		/*
		 * int i=2; while (i<=10) {
		 * System.out.println("print even number in between 1 to 10 :"+i); i+=2;//i=i+2
		 * }
		 */
		/*
		 * //approach 2 print even &Odd number in between 1 to 10 int i=1; while(i<=10)
		 * { if(i%2==0) { System.out.println(i+": is even num"); }else {
		 * System.out.println(i+": is odd num"); } i++; }
		 */
		// approach 3 print descending order 10 to 1
		int i = 10;
		while (i >= 1) {

			System.out.println(i);
			i--;

		}

	}

}
