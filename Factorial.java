package Assignment;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		number = sc.nextInt();
		sc.close();
		
		 long factorial = 1;

	        
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }

	        System.out.println("Factorial of " + number + " is: " + factorial);
		

	}

}
