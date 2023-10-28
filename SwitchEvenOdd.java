package ConditionalANDLoop;

import java.util.Scanner;

public class SwitchEvenOdd {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = sc.nextInt();
	        sc.close();
	        
	        switch(number % 2) {
	            case 0:
	                System.out.println(number + " is even.");
	                break;
	            case 1:
	                System.out.println(number + " is odd.");
	                break;
	            default:
	                System.out.println("Invalid input");
	        }
	        
	}

}
