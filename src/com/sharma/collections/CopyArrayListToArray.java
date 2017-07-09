package com.sharma.collections;

//Write a program to copy arraylist to an array.

import java.util.ArrayList;
import java.util.List;

public class CopyArrayListToArray {

	public static void main(String[] args) {

		List<String> li = new ArrayList<String>();
		li.add("lion");
		li.add("tiger");
		li.add("cat");
		li.add("dog");

		String[] liArr = new String[li.size()];
		liArr = li.toArray(liArr);

		for(String s : liArr)
		    System.out.println(s);
	}

}
