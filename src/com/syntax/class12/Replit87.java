package com.syntax.class12;

public class Replit87 {

	String carColor;
	int carYear;
	String carMake;
	String carColor1;
	int carYear1;
	String carMake1;

	public static void main(String[] args) {
		Replit87 BMW = new Replit87();
		BMW.carColor = "Black";
		BMW.carYear = 2019;
		BMW.carMake = "BMW";
		System.out.print("Car color is " + BMW.carColor);
		System.out.print(" and car year is " + BMW.carYear);
		System.out.println(" and car model is " + BMW.carMake);

		Replit87 Toyota = new Replit87();
		Toyota.carColor1 = "White";
		Toyota.carYear1 = 2018;
		Toyota.carMake1 = "Toyota";
		System.out.print("Car color is " + Toyota.carColor1);
		System.out.print(" and car year is " + Toyota.carYear1);
		System.out.print(" and car model is " + Toyota.carMake1);

	}

}
