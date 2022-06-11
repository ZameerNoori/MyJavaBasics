package com.syntax.class14;

public class HW4 {
	
	/*
	 * Create a method that will say Hello in different 
	 * language based on the country that will passed when method is executed
	 */
	void lang(String z) {
		if(z.equalsIgnoreCase("USA")) {
			System.out.println("Hello");
		}else if(z.equalsIgnoreCase("Afghanistan")) {
			System.out.println("Salam");
		}else if(z.equalsIgnoreCase("Mexico")) {
			System.out.println("Hola");
		}else if(z.equalsIgnoreCase("France")) {
			System.out.println("Bonjour");
		}else if(z.equalsIgnoreCase("Greece")) {
			System.out.println("Χαίρετε");
		}else {
			System.out.println("Aliens");
		}
	}
	public static void main(String[] args) {
		HW4 co=new HW4();
		co.lang("Greece");
	}

}
