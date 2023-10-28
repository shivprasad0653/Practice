package com.edubridge.input;

import java.util.Scanner;

class Studenet{
	String name;
	int age;
	

public void Input() {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The Name: ");
	name = sc.nextLine();
	
	System.out.println("Enter the age: ");
	age = sc.nextInt();
}
}

public class StudentDetails {

	public static void main(String[] args) {
		Student s = new Student();
		Student.Input();
		
		System.out.println("Name: "+s.name);
		System.out.println("Age: "+s.age);
		

	}

   }

