package com.syntax.class10;

public class Replit82 {

	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
			};
	    int s=0;
	    for(int b=0; b<a.length; b++){
	      for(int c=0; c<a[b].length; c++){
	      s+=a[b][c];
	        }
	    }
		System.out.println(s);
	    s=0;
	}

}
