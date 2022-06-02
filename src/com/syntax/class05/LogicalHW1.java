package com.syntax.class05;

import java.util.Scanner;

public class LogicalHW1 {

	public static void main(String[] args) {
		/*Prompt the user to enter person heights in inches. Person should be classified as one of the following:
          short (under 60 inch)
          medium(between 60 -72 inch)
          tall (over 72 inch)
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Person's height in inches");
		int height=in.nextInt();
		
		if(height>59 && height>55) {
			System.out.println("short");
		}else if(height==60 && height==72) {
			System.out.println("medium");
		}else if(height>72) {
			System.out.println("tall");
		}
		//----------------------
		
		
		/*
		 * Write a program that will print whether it is a weekend or weekday. 
		 * If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, 
		 * any other day → output “Invalid day”
		 * 
		 */
		System.out.println("day");
		int day=in.nextInt();
		if(day==1 || day==2 || day==3 || day==4 || day==5) {
			System.out.println("It is weekday");
		}else if(day==6 || day==7){
		System.out.println("Weekend");
	    }
		else {
		System.out.println("Invalid day");
	}

}
}
