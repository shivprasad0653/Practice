package edubridge;

import java.util.Scanner;

public class PallindromeEx {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        int nextPalindrome = findNextPalindrome(number);
	        
	        System.out.println("Next palindrome number is: " + nextPalindrome);
	        scanner.close();
	    }

	   
	    private static boolean isPalindrome(int number) {
	        int reversedNumber = 0;
	        int originalNumber = number;
	        while (number != 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }
	        return originalNumber == reversedNumber;
	    }

	    
	    private static int findNextPalindrome(int number) {
	        number++;
	        while (!isPalindrome(number)) {
	            number++;
	        }
	        return number;

	}

}