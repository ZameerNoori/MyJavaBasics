package com.syntax.class07;

public class MoreLoop {

	public static void main(String[] args) {
		//100 to 50
		int a=100;
		while(a>=50) {
			System.out.print(a+" ");
			a--;
		}
		
	    System.out.println("  -------------------------------  ");
		//-1 to -10
		int b=-1;
		while(b>=-10) {
			System.out.print(b+" ");
			b--;
		}
		
		System.out.println("  -------------------------------  ");
		
		// one way
		// 2 to 20 even numbers
		int c=2;
		while(c<=20) {
			System.out.print(c+" ");
			c+=2;
		}
		
        System.out.println("  -------------------------------  ");
      //99 to 1 odd numbers
		int y=99;
		while(y>=1) {
			System.out.print(y+" ");
			y-=2;
		}
		
		System.out.println("  -------------------------------  ");
		
		// other way
		// 2 to 20 even numbers
		int f=1;
		while(f<=20) {
			if(f%2==0) {
			System.out.print(f+" ");
			}
			f++;
		}
		
		System.out.println("  -------------------------------  ");
		//99 to 1 odd numbers
		int r=100;
		while(r>=1) {
			if(r%2!=0) {
				System.out.print(r+" ");
			}
			r--;
		}
		

	}

}
