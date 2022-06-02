package com.syntax.groupProject;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = scan.nextInt();
        int counter = 0;
        int i = 2;
        while(i < num) {
            if(num % i == 0) {
                counter++;
            }
            i++;
        }
        if(counter == 0) {
            System.out.println(num+" is a prime number.");
        }
        else {
            System.out.println(num+ " is not a prime number.");
        }

	}

}
