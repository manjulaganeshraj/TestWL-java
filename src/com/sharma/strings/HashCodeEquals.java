package com.sharma.strings;

public class HashCodeEquals {

	int x;

	public boolean equals(Object oo) {
		HashCodeEquals hh = new HashCodeEquals();
		if (oo instanceof HashCodeEquals)
			hh = (HashCodeEquals) oo;

		if (this.x == hh.x)
			return true;
		else
			return false;
	}

	HashCodeEquals()
	  {
	     x=11;
	   }

}
