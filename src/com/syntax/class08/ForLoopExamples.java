package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		
		// I need to print numbers from 1 to 90
		for (int i=1; i<=90; i++) {
			System.out.print(i+" ");
		}
		
		/* start point 
		 * end point 
		 * increment/decrement
		 */
		
		System.out.println();
		
		// I need number from 60 to 10
		for (int a=60; a>=10; a--) {
			System.out.print(a+" ");
		}
		
		System.out.println();
		
		// from 5 to 40 in 5 digit ahead
		for (int c=5; c<=40; c+=5) {
			System.out.print(c+" ");
		}

	}

}
