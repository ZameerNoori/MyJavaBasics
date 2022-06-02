package com.syntax.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program and name it Temperature Check. 
		Create variable to store temperature. 
		Your program should check if temperature is below 32 then it should print 
		“Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“.
		 */
		
		int temperature=23;
		int temo=32;
		if (temperature<32) {
			System.out.println("Water will freeze with temperature "+temperature);
			System.out.println("Too cold");
			
		}else {
			System.out.println("Water will not freeze with temperature "+temo);
			System.out.println("Too hot");
			
		}
            System.out.println("I will go home");// free line or independent code no if or else 
            System.out.println("Play soccer");
	}

}
