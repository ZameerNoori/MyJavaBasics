package com.syntax.class05;

import java.util.Scanner;

public class LogOpHW3 {

	public static void main(String[] args) {
		/*
		 * Ask user to enter a number and then define if number is small, medium or large
           Small number is value between 1 and 10
           Medium number is value between 11 and 100
           Large number is value between 101 and 1000
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=in.nextInt();
		
		if(number>=1 & number<=10) {
			System.out.println("Small");
		}else if (number>=11 & number<=100) {
			System.out.println("medium");
		}else if(number>=101 & number<=1000) {
			System.out.println("large");
		}

	}

}
