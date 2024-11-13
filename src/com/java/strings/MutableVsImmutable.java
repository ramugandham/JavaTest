package com.java.strings;

public class MutableVsImmutable {
	
	public static void main(String[] args) {
		///mutable can change
		/*int a[]= {20, 10, 40, 50, 30};
		System.out.println(Arrays.toString(a)); Arrays.sort(a); //mutable we can change System.out.println(Arrays.toString(a));
		*/
		//immutable
		String s=new String("welcome");
		System.out.println(s); // welcome
		String concatstring=s.concat("to java");
		System.out.println(s); //welcome ---> immutable
		System.out.println(concatstring);
		//mutable
		StringBuffer sb = new StringBuffer("hellojava");
		System.out.println(sb.append("selenium"));
		StringBuilder sb1 = new StringBuilder("selenium java");
		System.out.println(sb1.append(" testing"));
		
		
		
		}
		
	
	
	

}
