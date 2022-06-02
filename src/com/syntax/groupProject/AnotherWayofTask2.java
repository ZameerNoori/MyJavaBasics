package com.syntax.groupProject;

import java.util.Scanner;

public class AnotherWayofTask2 {

	public static void main(String[] args) {
		
		 Scanner input=new Scanner(System.in);
	        System.out.println("Enter the number of elements in array");
	        int el=input.nextInt();
	        String [] countries=new String[el];
	        System.out.println("Enter the name of the countries ");
	        String  capital="null";
	        input.nextLine();
	        for (int i=0; i<el; i++){
	            countries[i]=input.nextLine();

	        switch (countries[i]) {
	            case "Mexico":
	                capital="Mexico City";
	                break;
	            case "Peru":
	                capital="Lima";
	                break;
	            case "Honduras":
	                capital="Tegucigalpa";
	                break;
	            case "Colombia":
	                capital="Bogota";
	                break;
	            case "El Salvador":
	                capital="San Salvador";
	                break;
	            case "Panama":
	                capital="Panama City";
	                break;
	            case "Chili":
	                capital="Santiago";
	                break;
	            case "Costa Rica":
	                capital="San Jose";
	                break;
	            case "Nicaragua":
	                capital="Managua";
	                break;
	            case "Brazil":
	                capital="Brasilia";
	                break;
	            default:
	                capital="unknown";
	        }
	            System.out.println(countries[i]+":"+capital);
	        }
	}

}
