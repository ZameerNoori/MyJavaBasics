package com.syntax.class13;

import java.util.Scanner;

public class TasksContinued {

	public static void main(String[] args) {

		/* How would you reverse a String word by word? for example */
		// input=>This is sentence i want to reverse
		// output=>sihT si ecnetnes i tnaw ot esrever
		Scanner sc = new Scanner(System.in);
		String camaro = sc.nextLine();
		String words[] = camaro.split("\\s");
		String mustang = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String demon = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				demon = demon + word.charAt(j);
			}
			mustang = mustang + demon + " ";
		}
		System.out.print(mustang);
		sc.close();
	}
}
