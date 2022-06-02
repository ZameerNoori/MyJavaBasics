package com.syntax.class05;

import java.util.Scanner;

public class HW3ForLogOp {

	public static void main(String[] args) {
		
		/* Write a program to ask user to enter numbers of worked years and annual salary. 
		 * If user worked for more or equals to 5 years than user is eligible for the bonus,
		 * otherwise he is not.
		 * Once user is eligible and salary is larger than 50000 than bonus = 5000, otherwise bonus=3000.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("worked years");
		int worked=sc.nextInt();
		
		System.out.println("annual salary");
		int annual=sc.nextInt();
		
		if(worked>=5) {
			System.out.println("eligible for the bonus");
			if(annual>50000) {
				System.out.println("bonus=5000");
			}else {
				System.out.println("bonus=3000");
			}
		}else {
			System.out.println("Not eligible");
		}

		//----------------------------------------//
		/* Write a program that will ask user to input inputs the current time (use 24 hour format).
         Based on the given time define:
         if hour is between 1-11 --> Morning
         if hour between 12-15 --> Afternoon
         if hour between 16-20 --> Evening
         if hour between 21-24 --> Night
		 */
		
		System.out.println("What is the current time?");
		double time=sc.nextDouble();
		
		if(time>=1 && time<=11) {
			System.out.println("Morning");
		}else if(time>=12 && time>=15) {
			System.out.println("Afternoon");
		}else if(time>=16 && time<=20) {
			System.out.println("Evening");
		}else if(time>=21 && time<=24) {
			System.out.println("Night");
		}
		//-------------------------------//
		/* Write a program for user to enter his/hers birth month. Based on the month define the season.
           Example: if user is born in March, April, May → season =“Spring”
           if user is born in June, July, August →
           season =“Summer” etc …
           At the end of the program we should see output as “You were born is season ______“.*/
		
		
		String month=sc.next();
		
		if(month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("Spring");
		    }else if(month.equals("June") || month.equals("July") || month.equals("August")){
				System.out.println("Summer");
		    }else if(month.equals("September") || month.equals("October") || month.equals("November")) {
		    	System.out.println("Winter");
			}else if(month.equals("December") || month.equals("January") || month.equals("February")) {
				System.out.println("Fall");
			}System.out.println("You were born is season "+month);
		}
	
	}


