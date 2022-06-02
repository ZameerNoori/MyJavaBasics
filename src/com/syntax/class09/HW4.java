package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		
		/*
		 * 1. Create an array on integers and calculate the sum of all elements in an array
		 */
		int[] a= {1,2,3};
		int total=0;
		
		for(int z=0; z<a.length; z++){
		total+=a[z];
		}
		System.out.println(total+" is the total");
		
		
		System.out.println();
		
		
		int total1=0;
		for(int n:a) {
			total1+=n;
		}System.out.println(total1+" is the total");
		

	}

}
