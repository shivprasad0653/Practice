package com.edubridge.input;

import java.util.Scanner;

class Person{
	int age;
	String Name;
	float salary;
	char gender;
	public void Inputdata() {
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
		
	}
	public void Displaydata() {
		System.out.println("Person Details:");
		System.out.println("Name: "+Name);
		System.out.println("Age: "+age);
		System.out.println("Gender:"+gender);
		System.out.println("Salary: "+salary);
		
	}
}

	
public class Encapsulation {

	public static void main(String[] args) {//execution starts from main method
		Person p = new Person();//object creation 
		p.Inputdata();// call the method 
		p.Displaydata();
		

	}

}
