package com.sharma.general;
//Write a program to print 1 to 10 numbers without using loops and you should not have more than 1 print statement.
public class OneToTenWithoutLoops {
	 
	public static void oneToTen(int n) 
	{ 
	 
	  if(n <= 10) {
	 
	       System.out.println(n); 
	       oneToTen(n+1); 
	       }
	}
	 
	public static void main(String args[]) 
	{
	 
		oneToTen(1); 
	 
	 }
	 
	}
