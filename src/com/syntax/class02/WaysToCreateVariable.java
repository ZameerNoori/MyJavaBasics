package com.syntax.class02;

public class WaysToCreateVariable {

	public static void main(String[] args) {
		//to create a variable we need 2 things: dateType & name
		
		/*
		 * 1 way to create a variable 
		 * dataType name=value
		 */
		//declare a variable temperature and we initialized it
		int temperature=60;
		
		/*
		 * 2 ways that is done is 2 steps
		 * to create a variable (dataType and name)
		 * assign the value
		 */
		
		int sum; //create a variable 
		sum=30; //assign the value
		sum=50; // reassign the value
		
		int num1, num2, num3; //create 3 variables of int type
		num1=10; //assign the value
		num2=20; //assign the value
		num3=30; //assign the value
		
		System.out.println(sum); //50 --->top to bottom

	}

}
