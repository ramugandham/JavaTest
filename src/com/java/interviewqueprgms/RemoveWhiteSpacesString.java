package com.java.interviewqueprgms;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {
	  String str="  java hello Selenium123  ";
	  str=str.replaceAll("\\s", "");
	  System.out.println("after remove white speces in above string:"+str);

	}

}
