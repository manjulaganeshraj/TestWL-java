package com.sharma.collections;
//To search for an element in the array list.

import java.util.ArrayList;

public class SearchInArrayList {

	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of array list "+al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		
		System.out.println("Size of array list after additions "+al.size());
		System.out.println("Contents of arraylist "+al);
		
		//search an element at index number 2
		System.out.println(al.get(2));
		
	}

}
