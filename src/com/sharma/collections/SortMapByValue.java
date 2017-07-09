package com.sharma.collections;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByValue {

	public static void main(String[] args) {
		        HashMap<String, Integer> map = new HashMap<String, Integer>();
		        ValueComparator vc = new ValueComparator(map);
		        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(vc);

		        map.put("A", 59);
		        map.put("B", 97);
		        map.put("C", 84);
		        map.put("D", 40);

		        System.out.println("unsorted values: " + map);
		        sorted_map.putAll(map);
		        System.out.println("sorted result: " + sorted_map);
		    }
		}

		class ValueComparator implements Comparator<String> {
		    Map<String, Integer> base;

		    public ValueComparator(Map<String, Integer> base) {
		        this.base = base;
		    }

		    public int compare(String a, String b) {
		        if (base.get(a) <= base.get(b)) {
		            return -1;
		        } else {
		            return 1;
		        } 
		    }
		
	}


