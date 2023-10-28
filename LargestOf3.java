package ConditionalANDLoop;

import java.util.Scanner;

class Threenumber{
	int a,b,c;
	
	void InputData() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sc.close();
	}
	
	void check() {
		if(a >b && a > c) {
			System.out.println(a+ "is largest");
		}else if(b >a && b > c){
			System.out.println(b+"is largest");
			
		}else {
			System.out.println(c+ "is largest");
		}
		
	}
}

public class LargestOf3 {

	public static void main(String[] args) {
		Threenumber t = new Threenumber();
		t.InputData();
		t.check();
	}

}
