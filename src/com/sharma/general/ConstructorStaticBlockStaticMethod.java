package com.sharma.general;

// Write a program that contains a constructor, a static block and a static method. Execute the program in order to verify the order to execution of methods and block.

public class ConstructorStaticBlockStaticMethod {

		   static int num;
		   static String mystr;
		   
		   static{
		      num = 97;
		      mystr = "Static keyword in Java";
		   }
		   
		   public ConstructorStaticBlockStaticMethod() {

		   System.out.println("This is a costructor");
		   }
		   
		   public static void main(String args[])
		   {
		      System.out.println("Value of num="+num);
		      System.out.println("Value of mystr="+mystr);
		   }
		

}
