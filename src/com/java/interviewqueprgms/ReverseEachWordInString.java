package com.java.interviewqueprgms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
	    String str="welcome to java";
	    String []word=str.split(" ");
	    String reverseString="";
	    for(String w:word) {
	    	String ReverseWord="";
	    	for(int i=w.length()-1;i>=0;i--) {
	    		ReverseWord=ReverseWord+w.charAt(i);
	    	}
	    	reverseString=reverseString+ReverseWord+" ";
	    }
       System.out.println("reverse string is :"+reverseString);
       //approch-2
       String str1="selenium java testing";
	    String []word1=str1.split("\\s");
	    String reversewordsString="";
	    for(String w1:word1) {
	    	StringBuilder sb=new StringBuilder(w1);
	    	sb.reverse();
	    	reversewordsString=reversewordsString+sb.toString()+" ";
	    }
	    System.out.println("reverse wordsin string:"+reversewordsString);
	    	
	}
	
	
	
	
	

}
