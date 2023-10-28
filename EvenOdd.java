package ConditionalANDLoop;

import java.util.Scanner;

class Number{
	int a;
	
	void Input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Number:");
		a = sc.nextInt();
		sc.close();
	}
	void Check() {
		if(a % 2 == 0) {
			System.out.println(a+ "is even");
		}else {
			System.out.println(a+ "is odd");
		}
	}
}

public class EvenOdd {

	public static void main(String[] args) {
		Number n = new Number();
		n.Input();
		n.Check();

	}

}
