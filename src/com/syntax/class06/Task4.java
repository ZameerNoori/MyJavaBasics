package com.syntax.class06;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
	 /* Write a program to ask user to enter value for sale: yes or no
      * if there is no sale --> you are not going for shopping
      * if there is sale ask user which item they want to buy and it’s price
      * Based on the price you have to calculate the price of the item after the discount, discount rule:
      * if price is less than $20 --> apply 10%
      * if price is between $20 & $100 --> 20%
      * if price between $100 & $500 --> 30%
      * otherwise apply 50% discount
      After discount ___ the price of the item reduce from __ to ___ */
		
		Scanner in=new Scanner(System.in);
		System.out.println("enter value for sale: yes or no:");
		String sale=in.nextLine();
		if(sale.equals("no")) {
			System.out.println("you are not going for shopping");
		}else {
			System.out.println("going for shopping");
			System.out.println("which item they want to buy and it’s price");
		}
		String item=null;
		int price=0;
		int disc, priceDisc, finPrice;
		
		item=in.next();
		price=in.nextInt();
		disc=20;
		disc=30;
		disc=40;
		disc=50;
		
		if(price<=20) {
		}else if(price>=20&price<=100) {
		}else if(price>=100&price<=500) {
		}
		priceDisc=price*disc/100;
			switch(disc) {
			
			case 10:
				finPrice=price-priceDisc;
				break;
			case 20:
				finPrice=price-priceDisc;
				break;
			case 30:
				finPrice=price-priceDisc;
				break;
			default:
				finPrice=price-priceDisc;
			}
			System.out.println("After discount %"+disc+" the price of the item is reduce from $"+price+" to $"+finPrice);
		}
		
	

	}


