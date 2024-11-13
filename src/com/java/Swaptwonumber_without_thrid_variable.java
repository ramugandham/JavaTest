package com.java;

public class Swaptwonumber_without_thrid_variable {

	public static void main(String[] args) {
		int x=23;
		int y=34;
		 System.out.println("before swapping:"
                 + " x = " + x + ", y = " + y);
		x=x+y;
		y=x-y;
		x=x-y;
		 System.out.println("After swapping:"
                 + " x = " + x + ", y = " + y);

	}

}
