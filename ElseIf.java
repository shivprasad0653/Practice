package ConditionalANDLoop;

import java.util.Scanner;

class Marks{
	int marks;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Marks: ");
		marks = sc.nextInt();
		sc.close();
	}
	void grade() {
		if(marks < 0  || marks > 100) {
			System.out.println("Invalid Input");
		}else if(marks >= 80) {
			System.out.println("Grade : A");
		}else if(marks < 80 && marks >= 60 ) {
			System.out.println("Grade : B");
		}else if(marks < 60 && marks >= 40) {
			System.out.println("Grade : C");
		}else {
			System.out.println("Fail");
		}
	}
}

public class ElseIf {

	public static void main(String[] args) {
		Marks m = new Marks();
		m.input();
		m.grade();
		

	}

}
