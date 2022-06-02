package com.syntax.class05;

import java.util.Scanner;

public class DMVScIfElse {

	public static void main(String[] args) {
		
		/*
		 * You are DMV representative and you need to ask customer their age. 
		 * If they are 18 and older you will issue a driver license to them, 
		 * otherwise you will offer them to get a learners permit.
		 */
		
		Scanner input=new Scanner(System.in);
		
        System.out.println("Your age?");
        int age=input.nextInt();
        if(age>=15) {
        	System.out.println("You will issue a driver license to them");
        }else {
        	System.out.println("you will offer them to get a learners permit");
        }
        
		

	}

}
