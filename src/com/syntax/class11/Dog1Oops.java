package com.syntax.class11;

public class Dog1Oops {
	/*
	 * Create a Dog Class and create 3 different objects of it: 
	 * Husky, Bulldog, labrador  with specific  attributes and behaviors.
	 */
	
	String name;
	String color;
	int weight;
	int biteForce;
	
	void agressiveDog(){
		System.out.println("He is agressive of dog");
	}
	void scaredOfDog() {
		System.out.println("I am scared dog");
	}
	public static void main(String[] args) {
		Dog1Oops bullDog=new Dog1Oops();
		
		bullDog.name="Scooby";
		bullDog.color="Tan";
		bullDog.weight=200;
		bullDog.biteForce=600;
		System.out.println(bullDog.name);
		bullDog.agressiveDog();
		bullDog. scaredOfDog();
		
		Dog1Oops labrador=new Dog1Oops();
		labrador.name="Tom";
		labrador.color="Gray";
		labrador.weight=150;
		labrador.biteForce=500;
		System.out.println(labrador.name);
		labrador.agressiveDog();
		labrador. scaredOfDog();
		
		Dog1Oops Husky=new Dog1Oops();
		Husky.name="Jerry";
		Husky.color="White";
		Husky.weight=155;
		bullDog.biteForce=700;
		System.out.println(Husky.name);
		Husky.agressiveDog();
		Husky.scaredOfDog();
	}
}
