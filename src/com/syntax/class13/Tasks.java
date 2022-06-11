package com.syntax.class13;

public class Tasks {

	public static void main(String[] args) {
		
		/*1. Create a String that will hold a sentence. Write a program to get a new String without any spaces.*/
		String a="Mopar all the way";
		System.out.println(a.replaceAll("[ ]",""));
		
		/* Create a String that should be combination of letters, numbers and special characters. 
		 * Find out how many Alphanumeric characters are there in the String.*/
		String b="gt500-->mustnag";
		String c=b.replaceAll("[a-z0-9]","");
		System.out.println(b.length());
		
		/*You have a String a="Is it Saturday? Is it raining? Do we have a Java Class today?"
		 * How would you find out how many sentences are in that String?*/
		String a1="Is it Saturday? Is it raining? Do we have a Java Class today?";
	    int b1=a1.split("[?]").length;
	    System.out.println(b1);
	   
	}

}
