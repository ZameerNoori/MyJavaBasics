package com.syntax.class08;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
   /* Write a program to ask a user to enter item they want to buy and the price of that item.
    * Every time user enters money, accumulate the amount and tell the user how much is left to pay off.
	* If user give more money program should return a change.
	*  Whenever a user done with payments program should say “Thank you for shopping!” */
		Scanner sc=new Scanner(System.in);
		int extraMoney;
		int change;
		
		System.out.println("What item u want to buy?");
		String item=sc.nextLine();
		System.out.println("What price?");
		int price=sc.nextInt();
		System.out.println("how much u gotta pay?");
		int left=sc.nextInt();
		
		while(price>left) {
			change=price-left;
			System.out.println("You paid $"+left+" u also have to pay extra $"+change+". Ur extra payment is?");
			extraMoney=sc.nextInt();
			left+=extraMoney;	
		}if(left>price) {
			System.out.println("change is $"+(left-price));
		}System.out.println("Thank you for shopping!");
		
	}

}
