package com.sharma.loopsConditionalStatements;

/*Write a program  that prints a pattern like below.
*
**
***
****
*****
*******/
public class PrintPattern {

	public static void main(String[] args) {

		for(int i=0; i<7; i++){
			for(int j=0; j<i; j++){
				System.out.print("* ");
		}
			System.out.println(" ");

		}
		
		
	}

}
