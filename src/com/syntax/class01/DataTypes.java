package com.syntax.class01;

public class DataTypes {

	public static void main(String[] args) {
		
		//to create a variable: datatype and name
		
		//whole numbers
		byte box1=127;
		short box2=32767;
		int box3=76666; // mostly will be used
		long box4=12345678999L; //---> L or l
		
		//decimal values
		float container=1.99f; //---> f or F
		double container2=89.99;
		
		//to represent 1 character 
		char gender='m';
		char dollar='$';
		
		//to represent true or false (yes or no)
		boolean hungry=true;
		boolean sleepy=false;
		
		//how to access values from variables?
		
		System.out.println(container2);//do not use "" to access variables
		
		// access and print values from all variables
		System.out.println(box1);
		System.out.println(box2);
		System.out.println(box3);
		System.out.println(box4);
		System.out.println(container);
		System.out.println(container2);
		System.out.println(gender);
		System.out.println(dollar);
		System.out.println(hungry);
		System.out.println(sleepy);
	}

}
