package com.syntax.class14;

public class HW7 {

	/*
	 * Create class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score >80 -
	 * B score >70 - C score > 50 - D anything else - F
	 */
	char getGrade(int s) {
		if (s >= 90) {
			return 'A';
		} else if (s >= 80) {
			return 'B';
		} else if (s >= 70) {
			return 'C';
		} else if (s >= 50) {
			return 'D';
		} else {
			return 'F';
		}

	}
	public static void main(String[] args) {
		HW7 get=new HW7();
		System.out.println(get.getGrade(85));
	}

}
