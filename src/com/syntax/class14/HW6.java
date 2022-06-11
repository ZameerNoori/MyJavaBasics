package com.syntax.class14;

import java.util.Scanner;

public class HW6 {

	/*
	 * Write a method to return whether given number is prime or not?
	 */
	public static class PrimeNumberProgram 
	{
	static boolean checkForPrime(int inputNumber)
	{
	boolean isItPrime = true;
	 
	if(inputNumber <= 1) 
	{
	isItPrime = false;
	 
	return isItPrime;
	}
	else
	{
	for (int i = 2; i<= inputNumber/2; i++) 
	{
	if ((inputNumber % i) == 0)
	{
	isItPrime = false;
	 
	break;
	}
	}
	 
	return isItPrime;
	}
	}
	 
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	 
	System.out.println("Enter a number :");
	 
	int inputNumber = sc.nextInt();
	 
	boolean isItPrime = false;
	try {
		isItPrime = checkForPrime(inputNumber);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	if (isItPrime)
	{
	System.out.println(inputNumber+" is a prime number.");
	}
	else
	{
	System.out.println(inputNumber+" is not a prime number.");
	}
	 
	sc.close();
	}

}
}
