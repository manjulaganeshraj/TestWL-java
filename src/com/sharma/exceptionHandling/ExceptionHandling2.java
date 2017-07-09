package com.sharma.exceptionHandling;

import java.io.IOException;

public class ExceptionHandling2 {
	
	//it will check if the passed age is correct or not
	public static void checkAge(int age) throws InvalidAge {
		
		if(age<18){
			throw new InvalidAge("Age is not valid");//throw new ArithmeticException();
		}
		else{
			System.out.println("Age is valid");
		}
		
	}
	public static void passAge() throws InvalidAge{
		
		int age = 16;
		checkAge(age);
	
	}

	public static void main(String[] args) {
		try{
		ExceptionHandling2.passAge();
		}
		catch(InvalidAge e){
			System.out.println("Hello exception occured");}
		}
	

}
