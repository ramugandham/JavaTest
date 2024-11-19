package com.java.interviewqueprgms;

public class RemoveSplCharAndJunkLetters {

	public static void main(String[] args) {
	 String s="!@#$%^&test123 Selenium _)(*";
	 s=s.replaceAll("[^a-zA-B0-9]", "");
	 System.out.println("after remove spl charcter and junk letters:"+s);

	}

}
