package com.syntax.class09;

public class HW123 {

	public static void main(String[] args) {
		
		/* Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array.*/
		
		String[] cars=new String[6];
		cars[0]="Mustang";
		cars[1]="Challenger";
		cars[2]="Charger";
		cars[3]="Camaro";
		cars[4]="Civic";
		cars[5]="Accord";
		for(String car:cars) {
			System.out.print(car+" ");
		}
		
		System.out.println();
		
		for(int c=0; c<cars.length; c++) {
			System.out.print(cars[c]+" ");
		}
		
		System.out.println("---------------------------");
		
		/*
		 * Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 */
		String[] animals= {"Lion", "Tiger", "Cheetah", "Jaguar", "Leopard"};
		for(String animal:animals) {
			System.out.print(animal+" ");
		}
		
		System.out.println();
		
		for(int a=0; a<animals.length; a++) {
			System.out.print(animals[a]+" ");
		}
		
		
		System.out.println("-----------------------------");
		/* Create an array to store double values and 
		 * then print all elements using 2 different loops
		 */
		double[] number= {1.0, 2.0, 3.0, 4.0, 5.0};
		for(double numb:number) {
			System.out.print(numb+" ");
		}
		
		System.out.println();
		
		for(int n=0; n<number.length; n++) {
			System.out.print(number[n]+" ");
		}
		
		
	}
}




