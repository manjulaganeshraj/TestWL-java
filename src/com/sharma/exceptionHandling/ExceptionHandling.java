package com.sharma.exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		try{
		int a=50;
		int c=50/0;
		System.out.println("Value of c is"+c);
		
		try{
		String s = null;
		System.out.println("Converting to string"+s.toString());
		
		}
		catch (NullPointerException e){
			
			System.out.println("NullPointerExceptiion occured");
			e.printStackTrace();
		}
		}
		catch(ArithmeticException e){
			
			System.out.println("Exceptiion occured");
			e.printStackTrace();
		}
		finally{
			System.out.println("Exception handled");
		}
		
		System.out.println("Exception is handled");
	}
	}


