package ConditionalANDLoop;

import java.util.Scanner;

class ElectricBill{
	String n;
	int units;
	double bill;
	
	void accept() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name:");
		n = sc.nextLine();
		System.out.println("enter number of units:");
		units = sc.nextInt();
		sc.close();
	}
	void calculate() {
		if(units <=100) {
			bill = (units * 2);
		}else if(units >= 200) {
			bill = 100 * 2 + (units -100)*3;
			
		}else if(units >300) {
			bill = (100 * 2 + 100 *3 +(units - 200)*5)*0.025;
	}
		System.out.println("The Bill is:"+bill);
}

public class Bill {

	public static void main(String[] args) {
		ElectricBill e = new ElectricBill();
		e.accept();
		e.calculate();
		
	}
		

	}

}
