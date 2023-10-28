package com.edubridge.input;

class Pen{
	String color;
	String type;
	
	public void write() {
		System.out.println("Writing");
	}
	public void printcolor() {
		System.out.println(color);
	}
	public void printtype() {
		System.out.println(type);
	}
}
public class OOPS {

	public static void main(String[] args) {
		Pen Pen1 = new Pen();// object creation
		Pen Pen2 = new Pen();// creating another object of same class
		Pen1.color = "blue";
		Pen1.type = "Gel";
		
		Pen2.color = "black";
		Pen2.type = "ball";
		
		
		Pen1.write();// call the method
		Pen1.printcolor();
		Pen2.printcolor();
		

	}

}
