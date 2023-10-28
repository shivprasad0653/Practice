package com.edubridge.operator;

public class Increment {

	public static void main(String[] args) {
		int a,b,c;
		 a = 10;
		 b = 10;
		
		//c= ++a + b++;
		// c= 11 + 10 //in memory b=11
		//System.out.println(c);
		//System.out.println(a);
		//System.out.println(b);
		
		
		c = a++ + b++;
		
		System.out.println("sum:"+(a+b));
		System.out.println((a+b)+ "sum=");
		

	}

}
