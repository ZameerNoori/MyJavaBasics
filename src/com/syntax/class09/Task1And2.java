package com.syntax.class09;

public class Task1And2 {

	public static void main(String[] args) {
		
		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. 
		 * Then print a grade B (use 2 different ways of creating an array).

		 */
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade[1]);
		
		
		System.out.println();
		
		
		char[] grade1= {'A', 'B', 'C', 'D', 'E', 'F'};
		System.out.println(grade1[1]);
		
		System.out.println("-----------------------------");
		
		/* 2. Create an array of words: Java, Saturday, day, coding, is.
		 *  Print the following sentence using elements of array: �Saturday is Java coding Day�.
		 */
		
		String[] words= {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]+"." );
		
		
		System.out.println();
		
		
		String[] words1=new String[5];
		words1[0]="Java";
		words1[1]="Saturday";
		words1[2]="day";
		words1[3]="coding";
		words1[4]="is";
		System.out.println(words1[1]+" "+words1[4]+" "+words1[0]+" "+words1[3]+" "+words1[2]+"." );
		

	}

}
