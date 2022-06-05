package com.syntax.class12;

public class StringDemo4 {

	public static void main(String[] args) {
		
		String name="kat";
		String name2="kat";
		System.out.println(name.equals(name2));
		name2="KAT";
		System.out.println(name.equalsIgnoreCase(name2));
		
		/*
		 * Username and Password cannot be  empty, if so→ message=”Username and Password cannot be empty”.
			Password should be minimum 8 characters, if less → message=”Password is too short”.
			Password cannot contain username if so, → message=”Password cannot contain username”.
			Password should match confirmed password, if not  → message=“Passwords do not match”.
			Only after all requirements met → message “Your username and password has been created”
		 */
		
		String userName="Zam";
		String password="123456";
		String confirmedPassword="123456";
		
		if(userName.isEmpty() & password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		}if(password.length()<8) {
			System.out.println("Password is too short");
		}if(!password.contains(userName)) {
			System.out.println("password cannot contain username");
		}if(password.contains(confirmedPassword)) {
			System.out.println("Passwords do not match");
		}System.out.println("Your username and password has been created");

	}

}
