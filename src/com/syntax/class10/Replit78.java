package com.syntax.class10;

import java.util.Scanner;

public class Replit78 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
	    
		 int numbers =input.nextInt();  
		 
		 int [] num = new int [5];
		
		    num[0]= input.nextInt();
		    num[1]= input.nextInt();
		    num[2]= input.nextInt();
		    num[3]= input.nextInt();
		    num[4]= input.nextInt();

		   for(int i=0; i<num.length; i++){
        
			 int calc = num[i]*10; 
			 
			 System.out.println(calc);
		   }	 	  
	}

}
