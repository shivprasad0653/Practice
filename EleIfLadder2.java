package ConditionalANDLoop;

import java.util.Scanner;

class TakeGrade{
	char Grade;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Grade:");
		Grade = sc.next().toUpperCase().charAt(0);
		sc.close();
		
	}
	void DisplayMarks() {
		if(Grade == 'A') {
			System.out.println("Marks are between 80 to 100");
			
		}else if(Grade == 'B' ) {
			System.out.println("Marks are between 60 to 79");
		}else if(Grade == 'C' ) {
			System.out.println("Marks are between 49 to 59");
		}else if(Grade == 'F' ) {
			System.out.println("You are Fail and Marks are between 0 to 39");
		}else {
			System.out.println("Invalid Input");
		}
	}
}

public class EleIfLadder2 {

	public static void main(String[] args) {
		TakeGrade grade = new TakeGrade();
		grade.input();
		grade.DisplayMarks();
		

	}

}
