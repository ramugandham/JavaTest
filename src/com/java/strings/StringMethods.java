package com.java.strings;

public class StringMethods {

	public static void main(String[] args) {
	String s="   welcome to    ";
	String s1=new String("hellojava");
	System.out.println(s.length());//find no of characters
	System.out.println("java"+"selenium");
	System.out.println(s+s1);//add strings
	System.out.println(s.concat(" " +s1));//add strings
    //trim() remove strings right and left side
	System.out.println(s.trim());
	System.out.println(s.length());
	System.out.println(s.trim().length());
	//charAt() based on index displayed characters
	System.out.println(s.charAt(3));
	//contains return true or false
	System.out.println(s1.contains("jav"));
	String a="ramu hi to all ramu java to new";
	String a1="RAMU@bac.edu.my";
	System.out.println(a.equals(a1) +" casesensitive accepts same case only");
	System.out.println(a.equalsIgnoreCase(a1) +" not casesensitive accepts any case");
	System.out.println(a.replace('a', 'e'));
	System.out.println(a.replace("to","hello"));
	System.out.println(a.substring(2, 7));
	System.out.println(a1.toLowerCase());
	System.out.println(a.toUpperCase());
	String[] b = a1.split("@");
	System.out.println(b[0]);
	System.out.println(b[1]);
	//ex1 remove $ and , symbolls below string
	String x="$100,30,70";
	System.out.println(x.replace("$", "").replace(",", ""));
	
	
	
	}

}
