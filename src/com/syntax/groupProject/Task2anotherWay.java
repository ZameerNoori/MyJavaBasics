package com.syntax.groupProject;

import java.util.Scanner;

public class Task2anotherWay {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in array");
		int num = scan.nextInt();
		
		String[] countries = new String[num];
		System.out.println("Enter country ");
		
		String capital = "null";
		scan.nextLine();
		
		for (int i = 0; i < num; i++) {
			countries[i] = scan.nextLine();
			switch (countries[i]) {
			case "Italy":
				capital = "Rome";
				break;
			case "Egypt":
				capital = "Cairo";
				break;
			case "Mexico":
				capital = "Mexico City";
				break;
			case "Iceland":
				capital = "Reykjavík";
				break;
			case "Japan":
				capital = "Tokyo";
				break;
			default:
				capital = "Country not in database";
			}
			System.out.println(countries[i] + ":" + capital);
		}

	}

}
