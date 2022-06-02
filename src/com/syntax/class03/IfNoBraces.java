package com.syntax.class03;

public class IfNoBraces {

	public static void main(String[] args) {
		/*
		 * without braces java can identify only 1 statement per block
		 */
		
		String time="morning";
		
		if (time.equals("Morning")) 
			System.out.println("Say good morning");
			
		else 
			System.out.println("Say good day");
			
		
		    System.out.println("End of the code");

	}

}
