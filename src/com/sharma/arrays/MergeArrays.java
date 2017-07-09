package com.sharma.arrays;

import java.util.Arrays;

//Write a program to merge 2 arrays.

public class MergeArrays {

	public static void main(String[] args) {

		int[] a={2,5,8};
		int[] b={6,3,7};
		int[] c= new int[a.length+b.length];
		
		int i=0, j=0, k=0;
		
		while(i<a.length && j<b.length)
			c[k++] = a[i]<b[j] ? a[i++] : b[j++];
			
		while(i<a.length)	
			c[k++] = a[i++];
		
		while(j<b.length)
			c[k++] = b[j++];
		
		/*int n=c.length;
		for(k=0; k<n; k++){
		System.out.print(c[k]+" ");
		}*/
		
		System.out.println(Arrays.toString(c));
					}

}
