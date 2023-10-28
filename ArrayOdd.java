package arrays;

import java.util.Scanner;

public class ArrayOdd {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of elements:");
		int n = sc.nextInt();
		int a[]=new int[n];
		
		System.out.println("Enter "+a.length+" elements:");
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}

		 System.out.println("Odd position elements in the array:");
	        for (int i = 0; i < a.length; i++) {
	        	if(i%2 == 1) {
	        		
	            System.out.print(a[i] + " ");
	        }
	        	sc.close();
		
	}
	}

}
