package ConditionalANDLoop;

import java.util.Scanner;

class Input{
	double area;
	static Scanner sc = new Scanner(System.in);
	
	
	void Rectangle() {
		System.out.println("Enter The Length and Breadth:");
		int length = Input.sc.nextInt();
		int breadth = Input.sc.nextInt();
		
		area = length * breadth;
		
		System.out.println("The Area Of Rectangle is"+area);
		
		
	}
	void Square() {
		System.out.println("Enetr side:");
		int side = Input.sc.nextInt();
		
		area = side * side;
		System.out.println("The area of square :"+area);
	}
	void triangle() {
		System.out.println("Enter base and height:");
		int base = Input.sc.nextInt();
		int height = Input.sc.nextInt();
		
		area = (base * height)/2;
		
		System.out.println("The area of triangle is:"+area);
		
	}
	void circle() {
		System.out.println("Enter radius:");
		int radius = Input.sc.nextInt();
		
		area = 3.14 * radius * radius;
		
		System.out.println("The area of circle is:"+area);
	}
}

public class SwitchArea {

	public static void main(String[] args) {
		
		Input i = new Input();
		
		System.out.println("*********MENU**********");
		System.out.println("Enter Your Choice:");
		System.out.println("1 is for Reactangle");
		System.out.println("2 is for Square");
		System.out.println("3 for Triangle");
		System.out.println("4 for circle");
		
		int choice = Input.sc.nextInt();
		
		switch(choice) {
		case 1:i.Rectangle();
		break;
		
		case 2:i.Square();
		break;
		
		case 3:i.triangle();
		break;
		
		case 4: i.circle();
		break;
		
		default:
			System.out.println("invalid Choice");
		
		
		}
		

	}

}
