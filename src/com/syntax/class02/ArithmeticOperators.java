package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {
		
		int num1=10;
		int num2=20;
		
		int sum, sub, mult, div;
		
		System.out.println(num1/num2); //0
		
		sum=num1+num2;
		System.out.println(sum); //30
		
		sub=num1-num2;
		System.out.println(sub); //-10
	
		mult=num1*num2;
		System.out.println(mult); //200
		
		div=num1/num2;
		System.out.println(div); //0
		
		double num3=9.99;
		double num4=3.50;
		double sum1, sub1,mult1, div1;
		sum1=num3+num4;
		sub1=num3-num4;
		mult1=num3*num4;
		div1=num3/num4;
		System.out.println(sum1); //13.49
		System.out.println(sub1); //6.49
		System.out.println(mult1); //34.965
		System.out.println(div1); //2.8542857142857145
		
		int a=10;
		int b=3;
		int result=a/b;
		System.out.println(result); //3
		
		double c=10.0;
		double d=3.0;
		double result2=c/d;
		System.out.println(result2); //3.3333333333333335
		
		float e=10.0f;
		float f=3.0f;
		float result3=e/f;
		System.out.println(result3); //3.3333333
		
	}

}
