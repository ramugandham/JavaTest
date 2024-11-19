package com.java.interviewqueprgms;

public class CountCharactersOccuresInStr {

	public static void main(String[] args) {
		String str="java programming java oops";
		int totalcount=str.length();
		int totalcount_afterremove=str.replace("j", "").length();
		int count=totalcount-totalcount_afterremove;
		System.out.println("number of occuarance in a is :"+count);

	}

}
