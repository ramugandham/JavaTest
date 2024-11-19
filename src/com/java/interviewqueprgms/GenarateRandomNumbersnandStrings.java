package com.java.interviewqueprgms;

import java.util.Random;

public class GenarateRandomNumbersnandStrings {

	public static void main(String[] args) {
		//approch-1
		Random rand=new Random();
		int ranint=rand.nextInt(100);
		System.out.println(ranint);
		double randoub=rand.nextDouble(10);
		System.out.println(randoub);
		//approch-2 math
		System.out.println(Math.random());
		//approch -3 apache comman-lang api
		
		/*
		 * String randNum=RandomstringUtils.randomNumeric(10);
		 * System.out.println(randNum); String
		 * randstr=RandomstringUtils.randomAlphabetic(10); System.out.println(randstr);
		 */
		 
		

	}

}
