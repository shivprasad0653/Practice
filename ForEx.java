package ConditionalANDLoop;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		int i=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n:");
		n = sc.nextInt();
		sc.close();
		
		for(i=1;i<=n;i++) {
			System.out.println(i);
		}

	}

}
