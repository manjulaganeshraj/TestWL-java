package com.sharma.general;

//Program that implements various functions of different type of access modifiers(private,protected,default,public) and then access these methods with in or outside the class based on the identifier scope.


public class Animal {

	public String name;
	private String breed;
	protected String color;
	double weight;
	
	public Animal(String name, String breed, String color){
		this.name=name;
		this.breed=breed;
		this.color=color;
		
	}
	
	public void eatFood(){
		System.out.println("Animal- eats food");
	}
	protected void makeNoise(){
		System.out.println("It makes noise");
	}
	private void speed(){
		System.out.println("It is very fast");
	}
	void displayDetails(){
		System.out.println(name+ "::" +breed+"::" +color);
	}
	

}

