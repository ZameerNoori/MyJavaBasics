package com.syntax.class06;

import java.util.Scanner;

public class Replit35 {

	public static void main(String[] args) {
		{
			   
			   Scanner in=new Scanner(System.in);
			   System.out.println("Do you need a loan?");
			   
			   boolean creditScore=true;
			   creditScore=in.nextBoolean();
			   if(creditScore){
			     System.out.println("What is you credit score?");
			   }else {
			     System.out.println("Unknown");
			   }

			   int score=in.nextInt();

			   if(score<=600){
			     System.out.println("Not eligible");
			   }else if(score<=600 && score>=700){
			     System.out.println("Maybe eligible");
			   }else if(score<=701 && score>=800){
			     System.out.println("Eligible");
			   }else {
			     System.out.println("Definitely eligible");
			   }
			   System.out.println("The eligibility is "+score);
			   

			   }
	}

}
