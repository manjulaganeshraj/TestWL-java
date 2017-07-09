package com.sharma.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class PrintElementUsingIterator {

	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of array list "+al.size());
		
		al.add("A");
		al.add("B");
		al.add("c");
		al.add("D");
		
		System.out.println("Size of array list after additions "+al.size());
		System.out.println("Oriinal Contents of arraylist "+al);
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			String element = itr.next();
			System.out.println(element+" ");
		}
		System.out.println();
	}

}
