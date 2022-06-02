package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		
		int[][] nums= {
				{1, 2, 3, 4, 5},
				{199, 300, 588, 700},
				{1900, 4578, 98787},
		};
		
		/* i loop iterates over rows
		 *nums.length gives # of arrays inside 2D array=3
		 *j loop iterates over columns
		 */
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("All values using enhanced for loop");
		
		/*enhanced for loop uses variables to access elements from an array
		 *outer for loops -> iterates over 1D array 
		 *inner loop --> iterates over elements of each 1D array
		 */
		
		for(int[] num:nums) {
			for(int n:num) {
				System.out.print(n+" ");
			}
			System.out.println();
		}
		
		System.out.println("Retrieve all values using for each loop");
		
		String [][] USA= {
				{"Time Square", "Albany", "Buffalo"},//-->0 row
				{"Los Angeles", "San Fransisco", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Falls Church", "Leesburg"},	//-->McLean is 1st column
		};
		
		for(String[] state:USA) {
			for (String usa:state) {
				System.out.print(usa+" ");
			}
			System.out.println();
		}

	}

}
