package com.sharma.collections;
//To print the elements in the reverse order using ListIterator.
import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseOrderListIterator {

	public static void main(String[] args) {


		ArrayList<String> al = new ArrayList<String>();
		System.out.println("Initial size of array list "+al.size());
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		
		System.out.println("Size of array list after additions "+al.size());
		System.out.println("Contents of arraylist "+al);
		
		ListIterator<String> itr = al.listIterator(al.size());
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
		
	}

}
