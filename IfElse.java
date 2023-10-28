package ConditionalANDLoop;

import java.util.Scanner;

class Checknumber{
	int a;
	
	void inputdata() {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		a = sc.nextInt();
		sc.close();
		
	}
	void displayresult() {
		if(a > 0) {
			System.out.println(a+" is Positive");
		}else  {
			System.out.println(a+" is negative");
		} 
			
		}
		
	}
	


public class IfElse {

	public static void main(String[] args) {
		Checknumber c= new Checknumber();
		c.inputdata();
		c.displayresult();
		
		
		
		
		
	}

}
