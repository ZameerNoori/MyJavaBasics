package com.syntax.class06;

import java.util.Scanner;

public class HWTask1and2 {

	public static void main(String[] args) {
		
		/* Ask user to enter their country and capture it.
		 * Once values are captured print which language user speaks.
		 */
		Scanner in=new Scanner(System.in);
		String country,language;
		
		System.out.println("Which language user speaks");
		language=in.next();
		
		switch(language) {
		
		case "Dari":
			country="Afghanistan";
			break;
		case "English":
			country="US";
			break;
		case "Portugese":
			country="Portugal";
			break;
		default:
		    country="No country";
		
		}
		System.out.println("The user speaks "+language);
		//---------------------------//
		
		/*
		 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
		 *  A-Excellent, B-Good, C-Average, D-Bad, any other grade -->
		 *   Not Acceptable. At the end your program should print 
		 *   which grade was entered by a user with explanation.
		 */
		char grade;
		String explanation;
		
		System.out.println("What is your grade");
		grade=in.next().charAt(0);
		
        switch(grade) {
		
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
		case 'C':
			explanation="Average";
			break;
		case 'D':
			explanation="Bad";
			break;
		default: 
		    explanation="Not Acceptable";
		}
        System.out.println("Your grade is "+grade+" "+explanation);
		

	}

	}


