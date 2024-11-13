package com.java;

public class ReverseNumbersUsingLoops {
	public static int reverse(int num) {
	    int reverse = 0;
	    while (num != 0) {
	        reverse = reverse * 10 + num % 10;
	        num /= 10;
	    }
	    return reverse;
	
}

	public static void main(String[] args){
		
		int num=202;
		System.out.println("reverse number is "+reverse(num));
		// and find if it is a palindrome or not
		if (num == reverse(num))
            System.out.println("Palindrome = Yes");
        else
            System.out.println("Palindrome = No");
	}
}
