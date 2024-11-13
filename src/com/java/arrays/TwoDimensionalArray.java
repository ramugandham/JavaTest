package com.java.arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];
		a[0][0]=10;
		a[0][1]=12;
		a[1][0]=11;
		a[1][1]=14;
		a[2][0]=15;
		a[2][1]=16;
		
		System.out.println(a[2][1]);
		System.out.println("length of rows:"+a.length);
		System.out.println("length of colms:"+a[0].length);
		
		
	int b[][]= {{20,21},{23,24},{26,27}};
		for(int r=0;r<=b.length-1;r++) {
			for(int c=0;c<=b[r].length-1;c++) {
				System.out.print(b[r][c]+"  ");
			}
			System.out.println();
		}
		
		//for foreach loop
		
		for(int arr[]:a) {
			for(int x:arr) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
