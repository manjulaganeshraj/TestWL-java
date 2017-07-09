package com.sharma.collections;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.List;

public class MonthsEnumValue {
	
	public enum months
	{
	    JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC
	}


    public static void main(String[] args){
    	
    	EnumMap<months, Integer> monthsV = new  EnumMap<months, Integer>(months.class);
    	
    	monthsV.put(months.JAN, 0);
    	monthsV.put(months.FEB, 1 );
    	monthsV.put(months.MAR, 2);
    	monthsV.put(months.APR, 3);
    	monthsV.put(months.MAY, 4);
    	monthsV.put(months.JUN, 5);
    	monthsV.put(months.JUL, 6);
    	monthsV.put(months.AUG, 7);
    	monthsV.put(months.SEP, 8);
    	monthsV.put(months.OCT, 9);
    	monthsV.put(months.NOV, 10);
    	monthsV.put(months.DEC, 11);

        System.out.println(monthsV);
    }


		
	}

	

