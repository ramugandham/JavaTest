package com.java.strings;

public class ReverseAstring {

	public static void main(String[] args) {
	String s="welcomeToJava";
	String rev="";
	//1st way
	/*
	 * for(int i=s.length()-1;i>=0;i--) { rev=rev+s.charAt(i); }
	 * 
	 * System.out.println("reverse string is :"+rev);
	 */
	//2nd way
	char[]a=s.toCharArray();
	for(int i=a.length-1;i>=0;i--) {
		rev=rev+a[i];
	}
	System.out.println("reverse string to char array type:" +rev);
	//3rd way
	StringBuffer sb = new StringBuffer("hellojava");
	System.out.println(sb.reverse());
	
	//4th way
		StringBuilder sb1 = new StringBuilder("selenium java");
		System.out.println(sb1.reverse());
	}

}
