package com.sharma.strings;

 
// c. Write a program which accepts a string like "This is nice" and converts it to a string like "This1 is2 nice3".

public class StringToString {

	
	public static void main(String[] args) {

		String text = "This is nice";
		
		String[] str = text.split(" ");
			StringBuilder builder = new StringBuilder();
			for(int i=0; i<str.length; i++){
				builder.append(str[i]);
				builder.append(i+1);
				builder.append(" ");
			}
			
		System.out.println(builder.toString());	
			
	}

}
