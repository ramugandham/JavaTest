package com.java.interviewqueprgms;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="ABCD";
		String rev="";
		//using concatenation operator +
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		System.out.println("reverse string is :"+rev);
		//using charecter array str to char converting  to chararray()
		String str1="wxyz";
		String rev1="";
		char a[]=str1.toCharArray();
		int len1=str1.length();
		for(int j=len1-1;j>=0;j--) {
			rev1=rev1+a[j];
		}
		System.out.println("string reverse is :"+ rev1);
		//using string buffer 
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
