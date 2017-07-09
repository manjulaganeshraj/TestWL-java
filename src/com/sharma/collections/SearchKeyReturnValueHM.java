package com.sharma.collections;
//To search for a key in the created map and then returns its value.

import java.util.HashMap;

public class SearchKeyReturnValueHM {

	public static void main(String[] args) {

HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("California", 33);
		hm.put("New York", 31);
		hm.put("New Jersey", 41);
		hm.put("Chicago", 24);
		hm.put("Texas", 55);
		
		System.out.println(hm);
		
		System.out.println(hm.get("California"));
	}

}
