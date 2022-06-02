package com.syntax.class08;

import java.util.Scanner;

public class TaskContinue {

	public static void main(String[] args) {
		
		/* Print numbers from 1 to 50 except those that are divisible by 3
		 */
		
		for (int i=1; i<=50; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		/*Create a program that will keep asking user to apply for a credit card. 
          As soon you get “yes” from a user program should stop asking.
		 */
		Scanner sc=new Scanner(System.in);
		String yesOrno="yes";
		do {System.out.println("Apply for credit card");
		yesOrno=sc.nextLine();
		}while (!yesOrno.equals("yes"));
		System.out.println("stop asking");
	}

}
