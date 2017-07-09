package com.sharma.arrays;

public class MissingNumber {

	public static void main(String[] args) {

		int[] a={1,2,4,5,6,7};
		int n = a.length;
		int sum=(n+2)*(n+1)/2;     //sum of (n+1) elements
		
		int total=0;
		for(int i=0; i<n; i++){
			total=total+a[i];
		}
		int missingNum = sum-total;
		
		System.out.println("Missing Number is "+missingNum);
	}

}
