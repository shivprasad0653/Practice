package com.edubridge.input;

import java.util.Scanner;

public class Inputdata {

	public static void main(String[] args) {
		int age;
		String Name;
		float salary;
		char gender;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name:");
		//Name = sc.next(); //string single word
		Name = sc.nextLine(); //with the space more than one word 
		
		System.out.println("Enter the age:");
		age = sc.nextInt();//int datatype
		
		System.out.println("Enter the salary:");
		salary = sc.nextFloat();
		
		System.out.println("Enter the gender (M/F):");
		gender = sc.next().charAt(0); // read char
		
		System.out.println("Employee Details:");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+age);
		System.out.println("Gender:");
		System.out.println("Salary: "+salary);
		
			

	}

}
