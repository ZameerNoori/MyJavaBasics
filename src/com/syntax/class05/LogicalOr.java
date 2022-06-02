package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		//One condition has to be true
		
		/* Monday and Friday --> No class
		 * Tuesday and Wednesday --> Manual testing
		 * Thursday --> Review
		 * Saturday and Sunday --> Java
		 */
		
		String day="Monday";
		if(day.equals("Monday") || day.equals("Friday")) {
			System.out.println("I have no class");
		}else if(day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("I have Manual Testing class");
		}else if(day.equals("Thursday")) {
			System.out.println("I have Review class");
		}else if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
		}

	}

}
