package com.syntax.class10;

import java.util.Scanner;

public class Replit76 {

	public static void main(String[] args) {
		String[] day=new String[7];
	    Scanner input=new Scanner(System.in);
	    
	    for(int i=0; i<7; i++){
	      System.out.println("Please enter day "+(i+1)+" of the week");
	      day[i]=input.next();
	    }
	    for(int i=0; i<day.length; i++){
	      System.out.println(day[i]);
	    }
	  }
	    
	}

