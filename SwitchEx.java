package ConditionalANDLoop;

import java.util.Scanner;

class Calculator{
	static Scanner sc = new Scanner(System.in);
	double a,b,answer;
	
	void inputdata() {
		
		System.out.println("Enter Two numbers:");
		a = sc.nextDouble();
		b = sc.nextDouble();
		
	}
	void addition(){
		answer = a + b;
		System.out.println("The Sum of "+a+" and "+b+" is:"+answer);
	}
	void substraction() {
		answer = a - b;
		System.out.println("The Substraction of "+a+" and "+b+" is:"+answer);
		
	}void multiplication(){
		answer = a * b;
		System.out.println("The multiplication of "+a+" and "+b+" is:"+answer);
		
	}void division(){
		// divide by 0 exception can be occur
		if(b == 0) {
			System.out.println("Divide by zero error");
		}else {
			answer = a / b;
			System.out.println("The division of "+a+" and "+b+" is:"+answer);
			
		}
		
	}
}

public class SwitchEx {

	public static void main(String[] args) {
		
		Calculator c = new Calculator();
		
		
		System.out.println("*********MENU**********");
		System.out.println("Enter Your Choice:");
		System.out.println("1 is for Addition");
		System.out.println("2 is for Substraction");
		System.out.println("3 for multiplication");
		System.out.println("4 for division");
		
		int choice = Calculator.sc.nextInt();// static scanner
		c.inputdata();
		
		switch(choice) {
		case 1:c.addition();
		break;
		
		case 2:c.substraction();
		break;
		
		case 3: c.multiplication();
		break;
		
		case 4:c.division();
		break;
		
		default:
			System.out.println("Invalid Choice");
		}
		
	}
	
}
