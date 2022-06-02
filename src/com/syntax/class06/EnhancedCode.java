package com.syntax.class06;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Quiz Midterm Final");
		
		int Quiz=in.nextInt();
		int Midterm=in.nextInt();
		int Final=in.nextInt();
		
		int score=(Quiz+Midterm+Final)/3;
		char grade;
		
		if(score>=90) {
			grade='A';
		}else if(score>=70 & score <90) {
			grade='B';
		}else if(score>=50 & score<70) {
			grade='C';
		}else {
			grade='F';
		}
		System.out.println("You are a "+grade+" student");

	
		/* if you are A or B student --> you are doing great
		* otherwise --> please try to study more
		*/
	
	if(grade=='A' || grade=='B') {
		System.out.println("you are doing great");
	}else {
		System.out.println("please try to study more");
	}

}
}
