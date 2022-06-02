package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		/*
		 * In order to be eligible to donate your blood you have to be 18 years old.
		 * Also once you identify age eligibility then we have to see if person matches weight requirements.
		 * If person weight it more than 110 lbs → then he/she is eligible, otherwise we cannot accept such a patient
		 */
		
		int ageelig=25;
		int weightelig=150;
		
		if (ageelig>18) {
			System.out.println("we have to see if person matches weight requirements");
			if (weightelig>110) {
				System.out.println("he/she is eligible");
			}else {
				System.out.println("not eligible");
				}
		}else {
			System.out.println("we cannot accept such a patient");
		}
		
		System.out.println("-------------------------------");
		
		int odd=7;
		int even=8;
		
		if (even% 4==0) {
			System.out.println(even+"  is even");
		}else {
			System.out.println(even+" is odd");
		}
	  
		
		
		
		System.out.println("--------------------------------");
		
		
		/*
		 * 3. Write a program to find largest number among three numbers using nested if provided 
		 * by a user (numbers must be distinct)
		 */
		
		int num1=1;
		int num2=2;
		int num3=3;
				
		if (num1>=num2) {
		    if (num1>=num3) {
		    	System.out.println(num1+" is the largest");
		}else {
			System.out.println(num2+" is the largest");
			}
		}
		else {
			if (num2<=num3) {
				System.out.println(num3 +" is the largest");
			}
		
		

	}

	}

}
