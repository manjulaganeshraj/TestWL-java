package com.sharma.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//Write a program to search for a string in a file and then replace it with another string.
//Hi. Good Morning. This is a sample input file stream program.

public class SearchAndReplace {

	public static void main(String[] args) throws IOException {

		File log= new File("C:\\Users\\manju\\Desktop\\WBLInnovapath\\IOFiles\\input1.txt");
		String search = "sample";  
		String replacement = "basic";

		FileReader fr = new FileReader(log);
		String s;
		    BufferedReader br = new BufferedReader(fr);

		    while ((s = br.readLine()) != null) {
		        s.replaceAll(search, replacement);
		}
	
	}

}
