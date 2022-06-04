package com.syntax.class10;

public class Replit81 {

	public static void main(String[] args) {
		int[][] a={{5, 4, 8}};
	      
	      int max=Integer.MIN_VALUE;
	      for(int b=0; b<a.length; b++){
	        for(int c=0; c<a[b].length; c++){
	          if(a[b][c]>max){
	            max=a[b][c];
	          }
	        }
	     }
	         System.out.println(max);  
	      }
	}


