package com.sharma.general;

public class Dog extends Animal {

	 private String breed;
	 
		public Dog(String name, String breed, String color, String breed2) {
			super(name, breed, color);
			breed = breed2;
		}

		@Override
		public void eatFood() {

			super.eatFood();
		}

		@Override
		protected void makeNoise() {

			super.makeNoise();
		}

		@Override
		void displayDetails() {

			super.displayDetails();
		}

		
	    
		
}
