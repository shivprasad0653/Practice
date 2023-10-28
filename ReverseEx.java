package Assignment;

import java.util.Scanner;

public class ReverseEx {

	public static void main(String[] args) {
		int Number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number to be reverse:");
		Number = scanner.nextInt();
		scanner.close();
		
		int reverse = 0;
		
	        while (Number != 0) {
	            int reminder = Number % 10;
	            reverse = reverse * 10 + reminder;
	            Number = Number / 10;
	        }

		System.out.println("The rerverse of number is:"+reverse);
		

	}

}
