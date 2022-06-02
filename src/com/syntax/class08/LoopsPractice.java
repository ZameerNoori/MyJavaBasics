package com.syntax.class08;

import java.util.Scanner;

public class LoopsPractice {

	public static void main(String[] args) {
		
		int sum=0;
		for(int i=1; i<6; i++) {
			System.out.print(sum+" "); //0 1 3 6 10
			sum+=i;
			//System.out.print(sum+" "); //1 3 6 10 15
		}
		
		System.out.println();
		
		System.out.println(sum); //15
		
		System.out.println();
		
		/* write a program, to find sum of all even and all odd numbers 
		 * from 1 to 70
		 */
		
		int add=0;
		for (int a=1; a<=70; a++) {
			if(a%2!=0) {
				add+=a;
			}
		}
		System.out.print("Sum of all odds = "+add);
		
		System.out.println();
		
		int add1=0;
		for (int a=1; a<70; a++) {
			if(a%2==0) {
				add+=a;
		}
	}
		System.out.print("Sum of all even = "+add1);
		
		System.out.println();
		
		//Another way
		
		int sumEven=0;
		int sumOdd=0;

		for (int i = 1; i <= 70; i++) {

		    if (i % 2 == 0) {
		    sumEven+=i;
		     }else {
		    sumOdd+=i;
		}
		}

		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);
		
		
		/*declare a secret number;
		 *you want to ask user to guess your secret number
		 *your code should keep asking to guess until user gets your secret number
		 *Once user gets the secret numbers --> you got it!
		 */
		
		System.out.println();
		
		Scanner input=new Scanner(System.in);
		int num;
		int secretNumber=25;
		
		do {System.out.println("Guess my secret number");
		num=input.nextInt();
		
		}while(num!=secretNumber);
		
		System.out.println("You got it");
	}

}
