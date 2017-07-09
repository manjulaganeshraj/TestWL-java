package com.sharma.arrays;

//Write a program to locate and swap only 2 elements which are not sorted in a given sorted array.

public class LocateAndSwap {

	public static void main(String[] args) {

		int []a = {1,2,5,6,4};
		int temp;
		 for (int i = 0; i < a.length; i++) 
	        {
	            for (int j = i + 1; j < a.length; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
		 for (int i = 0; i < a.length ; i++) 
	        {
	            System.out.print(a[i] + " ");
	        }
	}

}
