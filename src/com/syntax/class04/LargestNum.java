package com.syntax.class04;

import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		
		/*
		 * Create a java program in which using Scanner you are going to capture 2 numbers.
           And once you capture 2 numbers, please check which one is the largest
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("type the #");
		int a1=scan.nextInt();
		
		System.out.println("type a different # than previous");
		int a2=scan.nextInt();
		
		if (a1>a2) {
			System.out.println(a1+" is larger than "+a2);
		}else if (a2>a1) {
			System.out.println(a2+" is larger than "+a1);
		}
	
		
	}
}
