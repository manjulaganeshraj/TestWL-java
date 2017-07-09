package com.sharma.collections;

import java.util.ArrayList;
import java.util.List;

//To create an arraylist and add elements to it.

public class AddElementsArrayList {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of array list "+al.size());
		
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("D");
		
		System.out.println("Size of array list after additions "+al.size());
		System.out.println("Contents of arraylist "+al);
		
		
	}

}
