package com.sharma.arrays;

import java.util.Scanner;

// Write a program to perform a linear search on any given array

public class LinearSearch {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("How many numbers you want to enter");
		int num = scan.nextInt();
		
		int a[] = new int[num];
		
		System.out.println("Enter the "+num+" numbers now");
		for(int i=0; i<a.length; i++){
			a[i] = scan.nextInt();
		}
		System.out.println("Enter the number to be searched");
		int x = scan.nextInt();
		int count=0;
		for(int i=0; i<a.length; i++){
			if(a[i]==x){
				count=count+1;
			}
			
	}
		if(count==0){
			System.out.println("The nuumber is not present");
		}
		else
			System.out.println("The number is present");
		}

}
