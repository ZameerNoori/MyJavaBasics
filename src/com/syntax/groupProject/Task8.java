package com.syntax.groupProject;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		//8.Write a Java Program to print the first 10 numbers of
		//Fibonacci series.
		
		int one =0;
		int two =1;
		
		Scanner in = new Scanner(System.in);
		System.out.println("how many elements you want to print in a Fibonacci series");
		int n=in.nextInt();
		
		System.out.println("Fibocacci series");
		System.out.print(one+" "+two+" ");
		
		int next;
		
		for (int i=2; i<n; i++) {
			next=one+two;
			System.out.print(next + " ");
			one = two;
			two = next;}

	}

	}
