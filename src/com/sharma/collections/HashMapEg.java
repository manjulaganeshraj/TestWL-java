package com.sharma.collections;

import java.util.HashMap;

public class HashMapEg {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("California", 33);
		hm.put("New York", 31);
		hm.put("New Jersey", 41);
		hm.put("Chicago", 24);
		hm.put("Texas", 55);
		
		System.out.println(hm);
	}

}
