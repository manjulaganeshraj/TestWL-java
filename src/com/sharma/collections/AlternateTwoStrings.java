package com.sharma.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AlternateTwoStrings {

	 public static void main(String[] args) {
	

		 String[] a1 = {"a1","a2","a3","a4"};
		 String[] b1 = {"b1","b2","b3","b4"};
		 
		 

	        ArrayList<String> a = new ArrayList<String>(Arrays.asList(a1));
	        ArrayList<String> b = new ArrayList<String>(Arrays.asList(b1));
	        merge(a, b);
	        System.out.println(a);
	    }
	   public static void merge(List<String> a, List<String> b){
	        for (Iterator<String> itb = b.iterator();
	        		itb.hasNext();
	        		){
	            for (ListIterator<String> it = a.listIterator() ; it.hasNext() ; ){
	                it.next();
	                it.add(itb.next());

	            }
	        }

	   } 
	
}
	
	