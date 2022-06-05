package com.syntax.class11;

public class Phone {
		/*
		 * Create a Class “Phone”.
		 * Create 3 Objects of it: iPhone, Pixel, Samsung with specific  attributes and behaviors.
		 */
	String brand;
	String color;
	double screen;
	int weight;
	double memorySize;
	
	void favoritePhone(){
		System.out.println("My favorite phone");
	}
	void bestPhone() {
		System.out.println("The best phone ever");
	}
	public static void main(String[] args) {
		Phone iPhone=new Phone();
		
		iPhone.brand="7 plus";
		iPhone.color="Black";
		iPhone.screen=5.5;
		iPhone.weight=188;
		iPhone.memorySize=128;
		System.out.println(iPhone.brand);
		iPhone.favoritePhone();
		iPhone.bestPhone();
		
		iPhone.brand="Pixel";
		iPhone.color="white";
		iPhone.screen=5.0;
		iPhone.weight=150;
		iPhone.memorySize=28;
		System.out.println(iPhone.brand);
		iPhone.favoritePhone();
		iPhone.bestPhone();
		
		iPhone.brand="Samsung";
		iPhone.color="Black";
		iPhone.screen=6.0;
		iPhone.weight=200;
		iPhone.memorySize=68;
		System.out.println(iPhone.brand);
		iPhone.favoritePhone();
		iPhone.bestPhone();
		
		
	}
	
	
	
	
	
	
	
	

	

}
