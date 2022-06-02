package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		
		/*From an array of integer elements find the largest number.*/
		int[] nums= {2, 4, 6, 8};
		int largest = 0;
		
		for(int large:nums) {
			if(largest<large) {
				largest=large;
			}
		}
		System.out.println("The largest # is "+largest);
		
		
		System.out.println();
		
		
		/*
		 * Create an array to store char values and then print those in reverse order
		 */
		char myName[]= {'R','E','E','M','A','Z'};
		for(int name=myName.length-1; name>=0; name--){
		   System.out.print(myName[name]);   
		}
	}
}
