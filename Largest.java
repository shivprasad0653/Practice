package ConditionalANDLoop;

import java.util.Scanner;

class Check{
	int a,b;
	
	void Inputdata() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		
	}
	void Confirm() {
		if(a > b) {
			System.out.println(a+ "is largest");
		}else {
			System.out.println(b+ "is largest");
		}
	}
}

public class Largest {

	public static void main(String[] args) {
		Check c = new Check();
		c.Inputdata();
		c.Confirm();
		

	}

}
