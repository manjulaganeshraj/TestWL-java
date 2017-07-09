package com.sharma.file;

//

import java.io.Console;

public class ConsoleDivide {

	public static void main(String[] args) {

		Console console = System.console();
		int c;


		System.out.println("Enter dividend");


		 int N= console.hashCode();


		 System.out.println("Enter Divisor:");


		 int D =console.hashCode();
		 
		 c = N/D;
		 
		 System.out.println(c);
		
	}

}
