package com.syntax.class05;

import java.util.Scanner;

public class CreditCardIfElseSc {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask if user has a credit card or not. 
		 * If you user does not have a credit card then offer them. 
		 * If they do have one ask what is balance on the card? 
		 * If balance of the card is larger than 1000, tell them to pay off immediately, 
		 * otherwise you can tell them that they can spend more.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("if user has a credit card or not?");
		String cre=sc.nextLine();
		
		if(cre.equals("not")) {
			System.out.println("We will offer u a credit card");
		}else {
			System.out.println("What is the balance on the card?");
		}
		    int balance=sc.nextInt();
		    if(balance>1000) {
		    	System.out.println("pay off immediately");
		    }else {
		    	System.out.println("you can tell them that they can spend more");
		    }
		
	}

}
