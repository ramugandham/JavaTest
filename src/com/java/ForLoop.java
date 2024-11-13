package com.java;

public class ForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				System.out.println("even num:"+i);
			}else {
				System.out.println("odd num:"+i);
			}
			
		}
//descending order
		
		for(int a=10;a>0;a--) {
			System.out.println("descending order :"+a);
			
		}
	}

}
