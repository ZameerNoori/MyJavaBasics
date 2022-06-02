package com.syntax.groupProject;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		String[] array = new String[4];
		String country = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("What countries: ");
		for (int i = 0; i < 4; i++) {
			country=sc.nextLine();
			if (country.equals("usa")) {
				System.out.println("The capital of " + country + " is Washigton");
			}
			else if (country.equals("russia")) {
				System.out.println("The capital of " + country + " is Moscow");
			}
			else if (country.equals("france")) {
				System.out.println("The capital of " + country + " is PAris");
			}
			else if (country.equals("spain")) {
				System.out.println("The capital of " + country + " is madrid");
			} else {
				System.out.println("Error");
			}
		}
	}

}
