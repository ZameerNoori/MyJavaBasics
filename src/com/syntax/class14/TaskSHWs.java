package com.syntax.class14;

public class TaskSHWs {

	public static void main(String[] args) {

		/*
		 * 1. Create a String that will hold a sentence. Write a program to get a new
		 * String without any spaces.
		 */
		String str = "Oleg building is on fire";
		System.out.println(str.replace(" ", ""));

		/*
		 * Create a String that should be combination of letters, numbers and special
		 * characters. Find out how many Alphanumeric characters are there in the String
		 */
		String str1 = "asdasd132546!@#";
		System.out.println(str1.replaceAll("[^A-Za-z0-9]", "").length());
		
		/*
		 * You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
		 * How would you find out how many sentences are in that String?
		 */
		String str3="Is it saturday? Is it raining? Do we have a Java Class today? i love Java. we go to park today.";
		System.out.println(str3.split("[?.!]").length);
		
		/*
		 * How would you reverse a String word by word? for example
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		 */
		String str4="This is sentence i want to reverse";
		String[] arr=str4.split(" ");
		
		for(String s:arr) {
			System.out.print(new StringBuilder(s).reverse()+" ");
		}
		//new StringBuilder(s) object of StringBuilder is created
		
		System.out.println();
		//System.out.println(new StringBuilder(str4).reverse());

	}

}
