package com.sharma.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicatesInSet {

	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of array list "+al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("B");
		
		System.out.println("Size of array list after additions "+al.size());
		System.out.println("Contents of arraylist "+al);
		
		Set<String> set = new HashSet<String>();
	    for (String arrayElement : al) {
	        if (!set.add(arrayElement)) {
	            System.out.println("Duplicate Element is : " + arrayElement);
	        }
	    }
	}
}
