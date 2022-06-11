package com.syntax.class13;

public class Recap3 {

	public static void main(String[] args) {
		
		//from a string get the part which starts from the symbol # and ends at the symbol
		String str="I am confused";
		System.out.println(str.substring(5));
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,4));//2 ignores I and space and 4 ignores the rest after m
		System.out.println(str.substring(0,1));
		str="Asghar is great";
		System.out.println(str.substring(0,6));

	}

}
