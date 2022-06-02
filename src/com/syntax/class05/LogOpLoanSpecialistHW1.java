package com.syntax.class05;

import java.util.Scanner;

public class LogOpLoanSpecialistHW1 {

	public static void main(String[] args) {
		
				/*You are a loan specialist and you need to ask user what is the amount of loan is needed. 
				 * If loan is less or equal to 200,000 then you would lend the money
				 *  otherwise you would reject the client.*/
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("what is the amount of loan is needed?");
		double amount=in.nextDouble();
		if(amount<=200000) {
			System.out.println("you would lend the money");
		}else {
			System.out.println("you would reject the client");
		}
		
		/*
		 * Create a Java program that will ask user to input city and temperature. 
		 * Your program should convert Fahrenheit into celsius and print “The temperature is the city __ is __”
		 */
		System.out.println("City: ");
		String city=in.next();
		
		System.out.println("Temp: ");
		int temp=in.nextInt();
		System.out.println("The temperature is the city "+city+" is "+(temp-32)*5/9);
		
	}

}
