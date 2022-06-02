package com.syntax.class10;

public class AllElementsFrom2DArray {

	public static void main(String[] args) {
		
		String [][] USA= {
				{"Time Square", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Falls Church", "Leesburg"},	
		};
		
		//outer loop iterates over rows
		//inner loop iterates over columns
		for(int row=0; row<USA.length; row++) {
			for(int col=0; col<USA[row].length; col++) {
				System.out.print(USA[row][col]+" ");
			}
			System.out.println();
		}

	}

}
