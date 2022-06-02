package com.syntax.class10;

public class AnotherWayOf2DArrasy {

	public static void main(String[] args) {
		
		//create 2D array of states 
		/*
		 * 1 array -> NY --> all cities of NY state
		 * 2 array -> CA --> all cities of CA state
		 * 3 array -> FL --> all cities of FL state
		 * 4 array -> VA --> all cities of VA state
		 */
		
		String [][] USA= {
				{"Time Square", "Albany", "Buffalo"},//-->row
				{"Los Angeles", "San Fransisco", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Falls Church", "Leesburg"},	//-->McLean is 1st columns
		};
		System.out.println(USA[1][2]);// SanDiego
		System.out.println("I want to go to "+USA[2][0]);// Miami
		
		System.out.println("Total # of 1D arrays in array USA = "+USA.length);//4
		
		//I want to see how many element inside my first array
		int elem1array=USA[0].length;
		System.out.println("# of elements in 1st array = "+elem1array);
		
		//I want to see how many element inside my 2nd array
		int elem2array=USA[1].length;
		System.out.println("# of elements in 2nd array = "+elem2array);

	}

}
