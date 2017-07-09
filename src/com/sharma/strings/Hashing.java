package com.sharma.strings;

public class Hashing {

	
	     public static void main(String args[])
	    {
	       HashCodeEquals hv=new HashCodeEquals();
	       HashCodeEquals hv2=new HashCodeEquals();

	      System.out.println(hv.hashCode());
	      System.out.println(hv2.hashCode());

	      if(hv.equals(hv2))
	        System.out.println("EQUAL");
	      else
	         System.out.println("NOT EQUAL");
	    }
}
