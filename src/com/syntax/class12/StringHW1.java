package com.syntax.class12;

public class StringHW1 {
	public static void main(String[] args) {
		/*
		 * Create a String and if the String is not empty perform the following: if the
		 * String has an odd number of characters and has 3 or more characters, print
		 * the character in the middle of the String.
		 */
		// Function to find the middle of three number

		String oddChar = "Zamir";
		if (!oddChar.isEmpty()) {
			if (oddChar.length() > 3 || oddChar.length() % 2 == 1) {
				System.out.println(oddChar.substring(2, 3));
			}
		} else {
			System.out.println("No odd character");
		}
	}
}
