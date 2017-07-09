package com.sharma.arrays;

//Write a program to find the largest number in a given array.

public class LargestNumOfArray {

	public static void main(String[] args) {

		int[] a= {2,44,6,12,23};
		int large = a[0];
		
		for(int i=0; i<a.length; i++){
				if(a[i]>large){
					
					large=a[i];
				}

		}
		System.out.println("Largest number is "+large);
		
	}

}
