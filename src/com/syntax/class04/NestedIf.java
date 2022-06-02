package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		boolean vaccine=false;// if the outer condition is false then the output is nothing!
		int dose=1;
		
		if(vaccine) {
			System.out.println("Let me check how many doses you have");
			
			if (dose==1)// Nested if or inner if 
				{
				System.out.println("You need 1 more shot");
			}else {
				System.out.println("You are fully vaccinated");
			}
		}
		
		
		System.out.println("----------------");
		
		
		String month="June";
		int day=19;
		
		if (month.equals("May")) {
			System.out.println("Let me check what is today's date");
			
			if (day==8) {
				System.out.println("Today is a Mother's Day");
			}
		}else if (month.equals("June")) {
			System.out.println("Let me check what is today's date");
			
			if (day==19) {
				System.out.println("Today is a Father's Day");
			}
			
		}

	}

}
