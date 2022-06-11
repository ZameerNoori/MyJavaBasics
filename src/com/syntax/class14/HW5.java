package com.syntax.class14;

public class HW5 {
	
	/*
	 * Create a method createEmail(). 
	 * Based on values of users name, lastName and email type, your method should return complete email Address. 
	 * Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com 
	 */
	void emailAddress(String firstName, String lastName, String email){
		System.out.println(firstName+lastName+"@"+email+".com");
	}
	public static void main(String[] args) {
		HW5 em=new HW5();
		em.emailAddress("a","z","gmail");
	}

}
