package stringExample;

import java.util.Scanner;

public class StringPallindrome {

	public static void main(String[] args) {
		String name;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The name:");
		name = sc.nextLine();
		sc.close();
		
		if(isPallindrome(name)) {
			System.out.println(name+ " is pallindrome");
			
		}else {
			System.out.println(name+ " is not pallindrome");
		}
	}
	 
	public static boolean isPallindrome(String str) {
		String cleanStr = str.replaceAll("\\s", "").toLowerCase();
		int length = cleanStr.length();
		
		 for (int i = 0; i < length / 2; i++) {
		    if (cleanStr.charAt(i) != cleanStr.charAt(length - i - 1)) {
		        return false;
		    }
		}
		return true;


	}
}
