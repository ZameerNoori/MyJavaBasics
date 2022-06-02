package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Zameer";
		String lastName="Noori";
		char grade='A';
		String city="Falls Church";
		String state="VA";
		long phone=76344763733l;
		
		System.out.println("My name is "+name+" and "+" my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in "+city+" and "+state);
		System.out.println("And my phone number is "+phone);
		
		city="Alexandria";
		state="DC";
		phone=1232463594l;
		
		System.out.println("My name is "+name+" and "+" I moved to city "+city+" and new state "+state);
		System.out.println("My new phone number is "+phone);
		
		/*
		 * Rules for identifiers 
		 * 1. no space
		 * 2. no keywords 
		 * 3. cannot start with numbers (numbers can be used after the name)
		 * 4. cannot start with special characters (except _, $)
		 */
		
		//String break="Hello"; error
		//int 1number=10;
		int number1=10;
		
		// num%=20; error
		double $price=3.99;
		float f_=2.09f;
		
		/*
		 * Naming Conventions
		 * follow camel cases
		 * variable names should start with lower case and then follow camel casing
		 * class names should start with upper case
		 */
		
		String mycity="Tysons";
		
		
		
		
		
		

	}

}
