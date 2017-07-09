package com.sharma.strings;

// Write a program which takes an input series as a1,a2,a3....an,b1,b2,b3...bn and produces output as a1,b1,a2,b2,a3,b3.......,an,bn.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TwoInputSeriesToONe {

	public static void main(String[] args) {

	
		List<String> input1  = new ArrayList<String>();
		List<String> input2  = new ArrayList<String>();
		         /////inserting first name
		         String string1 = "a1";
		         input1.add(string1);
		         String string2 = "a2";
		         input1.add(string2);
		         ///////inserting last name
		         String string3 = "b1";
		         input2.add(string3);
		         String string4 = "b2";
		         input2.add(string4);

		         Iterator<String> iterator = input1.iterator();
		         Iterator<String> iterator1 = input2.iterator();
		         List<String> newList = new ArrayList<String>();
		         
		         while(iterator.hasNext() && iterator1.hasNext()){
		             String Input1 = iterator.next();
		             String Input2 = iterator1.next();
		             System.out.println(newList.add(Input1 + ", " + Input2));    
		             
		         }
		         
	  }
}
