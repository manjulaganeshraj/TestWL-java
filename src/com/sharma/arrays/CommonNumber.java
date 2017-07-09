package com.sharma.arrays;

// Write a program to find the common number in any given two arrays.

public class CommonNumber {

	public static void main(String[] args) {

		int[] ar1={1,5,20,80,40};
		int[] ar2={6,7,20,80,100};
		
		int i=0; int j=0; 
		
		System.out.println("Common elements are");

		while(i<ar1.length && j<ar2.length ){
			

			if(ar1[i]==ar2[j]) {
				System.out.print(ar1[i]+" ");
				i++;j++;
			}
			else if(ar1[i]<=ar2[j]){
				i++;
			}
			else {
				j++;
			}
			
		}
				
	}

}
