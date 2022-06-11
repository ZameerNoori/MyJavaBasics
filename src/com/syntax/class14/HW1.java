package com.syntax.class14;

public class HW1 {
	/*
	 * Create a method that will take 2 parameters as a numbers and prints which number is larger.
	 */
	void largest(int z, int n) {
		if(z>n) {
			System.out.println(z+" is the largest");
		}else if(n>z) {
			System.out.println(n+" is the largest");
		}
	}
	public static void main(String[] args) {
		HW1 nums=new HW1();
		nums.largest(10,23);
	}

}
