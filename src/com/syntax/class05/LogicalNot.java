package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		//It gives the opposite of boolean or reverse condition!
		
		boolean boo=!true;
		System.out.println(boo);
		
		boolean boo1=!false;
		System.out.println(boo1);
		
		/*if there is no traffic --> I will reach work on time
		 */
		
		boolean traffic=false;
		if(!traffic) {
			System.out.println("I will reach work on time");
		}
		
		String name="Zam";
		if(!name.equals("Zameer")) {
			System.out.println("I am AZN");
		}

	}

}
