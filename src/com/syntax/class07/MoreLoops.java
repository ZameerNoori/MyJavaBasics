package com.syntax.class07;

public class MoreLoops {

	public static void main(String[] args) {
		
		int a=20;
		while(a<=100) {
			System.out.print(a+" ");
			a+=2;
		}
		System.out.println("--------------------------");
		
		int b=99;
		while(b>=1) {
			System.out.print(b+" ");
			b-=2;
		}
		
		System.out.println("--------------------------");
		
		int c=20;
		while(c<=100) {
			if(c%2==0) {
				System.out.print(c+" ");
			}
			c++;
		}
		
		System.out.println("--------------------------");
		
		int d=100;
		while(d>=1) {
			if(d%2!=0) {
				System.out.print(d+" ");
			}
			d--;
		}

	}

}
