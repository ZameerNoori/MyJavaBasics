package com.syntax.class12;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {

		/*
		 * Write a program that reads two people's first names and if they expecting boy
		 * or girl? Based on the input suggests a name for a baby: Example Output: Mom's
		 * first name? Mary Dad's first name? Daniel Boy or Girl? boy Suggested baby
		 * name: DANRY Example Output: Mom's first name? Mary Dad's first name? Daniel
		 * Boy or Girl? girl Suggested baby name: MAIEL
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Mom's first name?");
		String firstName=sc.next();
		System.out.println("Dad's first name?");
		String firstName1=sc.next();
		System.out.println("Boy or Girl?");
		String or=sc.next();
		if(or.equalsIgnoreCase("Boy")) {
			System.out.println("Daniel");
		}else {
			System.out.println("Maiel");
		}
		sc.close();

	}

}
