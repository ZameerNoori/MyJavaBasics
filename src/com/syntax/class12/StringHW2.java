package com.syntax.class12;

import javax.sound.sampled.ReverbType;

public class StringHW2 {

	public static void main(String[] args) {
		/* Create a String and print it in reverse order (Sunday → yadnuS). */

		String weekDay = "Sunday";

		String Sun = "Sunday", Sn = "";
		char S;
		for (int i = 0; i < Sun.length(); i++) {
			S = Sun.charAt(i);
			Sn = S + Sn;
		}
		System.out.println(Sn);
	}
}
