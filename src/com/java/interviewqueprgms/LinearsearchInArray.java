package com.java.interviewqueprgms;

public class LinearsearchInArray {

	public static void main(String[] args) {
		int a[]= {20,30,50,60,90};
		int ele_search=30;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(ele_search==a[i]) {
				System.out.println("elemunt is found:"+i);
				flag=true;
				break;
			}
			
		}
		if(flag==false) {
			System.out.println("element is not found");
		}

	}

}
