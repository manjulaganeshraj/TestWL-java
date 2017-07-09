package com.sharma.file;

//BufferedReader and InputStreamReader: Use this classes to input 2 integer numbers and subtract them

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedAndInputStream {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("Enter 2 numbers");
		int num1 = Integer.parseInt(br.readLine());
		int num2 = Integer.parseInt(br.readLine());
		
		int result = num1-num2;
		
		System.out.println("Subtract:"+result);
		
	}

}
