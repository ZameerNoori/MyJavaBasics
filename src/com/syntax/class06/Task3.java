package com.syntax.class06;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		/* HW: Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 * Based on operator provide the result to user.
           Please complete this assignment in 2 ways: using if statement and switch case.*/
		
		Scanner inp=new Scanner(System.in);
		
		System.out.println("calculator");
		int num1=inp.nextInt();
		int num2=inp.nextInt();
		char arith=inp.next().charAt(0);
		
		int nu=233;
		
		if(arith=='/') {
			nu=(num1/num2);}
		else if(arith=='*') {
			nu=(num1*num2);}
		else if(arith=='+') {
			nu=(num1+num2);}
		else if(arith=='-') {
			nu=(num1-num2);}
		System.out.println("The result is "+nu);
		
		System.out.println("--------------------------------------");
		
        switch(arith) {
		
		case '/':
			nu=(num1/num2);
			break;
		case '*':
			nu=(num1*num2);
			break;
		case '+':
			nu=(num1+num2);
			break;
		case '-':
			nu=(num1-num2);
			break;	
	}
        System.out.println("The result is "+nu);

}
}
