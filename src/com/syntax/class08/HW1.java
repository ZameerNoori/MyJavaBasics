package com.syntax.class08;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		/*
		 * Write a program that reads a range of integers (start and end point), 
		 * provided by a user and then from that range prints the sum of the even and odd integers.
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("start number:");
		int startNum=sc.nextInt();
		System.out.println("end number:");
		int endNum=sc.nextInt();
		int even=0, odd=0;
		for(int a=startNum; a<=endNum; a++) {
			if(a%2==0) {
				even+=a;	
		}else {
			    odd+=a;
		}	
	}
		System.out.println("Even number is "+even);
		System.out.println("Odd number is "+odd);
}
}
