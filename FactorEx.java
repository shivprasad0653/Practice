package Assignment;

import java.util.Scanner;

public class FactorEx {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
		 System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        System.out.print("Factors of " + number + ": ");
	        for (int i = 1; i <= number; ++i) {
	            if (number % i == 0) {
	                System.out.print(i + " ");
	            }
	        }
	}

}
