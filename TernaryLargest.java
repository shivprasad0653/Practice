package com.edubridge.operator;

import java.util.Scanner;

public class TernaryLargest {

	public static void main(String[] args) {
		int a,b,c,d,l;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr 4 numbers");
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();		
		
		l = (a>b && a>c && a>d)?a: (b>a && b>c && b>d) ?b: (c>a && c>b && c>d)?c:d;
		
		System.out.println("The largest of 4 numbers is:"+l);;
		
	}

}
