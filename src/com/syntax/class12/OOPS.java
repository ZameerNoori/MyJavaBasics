package com.syntax.class12;

public class OOPS {
	String model;
	String make;
	double screenSize;
	int RAM;
	int ROM;
	int storage;
	int camera;
	
	void call() {
		System.out.println("calling someone");
	}
	void takePicture() {
		System.out.println("use my camera app take pictures");
	}
	
	
	public static void main(String[] args) {
		
		OOPS  s22Ultra= new OOPS ();
		s22Ultra.make="Samsung";
		s22Ultra.model="Samsung";
		s22Ultra.screenSize=6.8;
		s22Ultra.RAM=12;
		s22Ultra.storage=512;
		s22Ultra.call();
		
		
	}

}
