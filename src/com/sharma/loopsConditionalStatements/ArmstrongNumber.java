package com.sharma.loopsConditionalStatements;

import java.util.Scanner;

//write a program  to check an armstrong number

public class ArmstrongNumber {

	public static void main(String[] args) {

		int sum=0, temp, rem;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = scan.nextInt();
		
		temp=a;
		while(temp>0){
			rem=temp%10;
			sum=sum+(rem*rem*rem);
			temp=temp/10;
		}
		if(a==sum){
			System.out.println(a+" is an Armstrong number");
		}
		else{
			System.out.println(a+" is not an Armstrong number");
		}
		
	}

}
