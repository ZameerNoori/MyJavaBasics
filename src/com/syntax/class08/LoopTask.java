package com.syntax.class08;

public class LoopTask {

	public static void main(String[] args) {
		 
		//Print numbers from 1 to 100 in 1 line with space
		for (int a=1; a<=100; a++) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		//Print numbers from 100 to 1
		for (int a=100; a>=1; a--) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		//Print even numbers from 20 to 1 (2 ways)
		for (int c=20; c>=1; c-=2) {
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		// other way
		for (int c=20; c>=1; c--) {
			if(c%2==0)
			System.out.print(c+" ");
		}
		
		System.out.println();
		
		//Print odd numbers between 20 and 50 (2 ways)
		for (int e=21; e<=50; e+=2) {
			System.out.print(e+" ");
		}
		
		System.out.println();
		
		// other way
		for (int e=21; e<=50; e++) {
			if(e%2!=0)
			System.out.print(e+" ");
		}
	}

}
