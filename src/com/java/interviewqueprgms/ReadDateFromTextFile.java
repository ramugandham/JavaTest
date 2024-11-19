package com.java.interviewqueprgms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDateFromTextFile {

	public static void main(String[] args) throws IOException {
		//approch -1 using file reader and buffer reader
		
		FileReader fr=new FileReader("‪C:\\Users\\User\\Desktop\\email.txt");
		BufferedReader br =new BufferedReader(fr);
		String str;
		while((str = br.readLine())!= null){
		    System.out.println(str);
		}
         br.close();
         //apporch- 2 using scnner file 
         File file =new File("C:\\\\Users\\\\User\\\\Desktop\\\\email.txt");
         Scanner sc =new Scanner(file);
         while(sc.hasNextLine()){
 		    System.out.println(sc.nextLine());
 		}
         //apporch -3 without while loop using
         
         sc.useDelimiter("\\Z");
         System.out.println(sc.next());
	}

}
