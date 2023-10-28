package com.edubridge.input;

import java.util.Scanner;

class Product{
	int productId;
	String productName;
	double productPrice;


  void InputProduct() {
	 
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Name of the product:");
	 productName = sc.next();
	 
	 System.out.println("Enter product ID:");
	 productId = sc.nextInt();
	 
	 System.out.println("Enter Price of Product:");
	 productPrice = sc.nextDouble();	
}
  void DisplayProduct() {
	  System.out.println("Name="+this.productName);
	  System.out.println("ID="+this.productId);
	  System.out.println("Price="+this.productPrice);
  }

public class MainProduct {

	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		
		p1.InputProduct();
		p2.InputProduct();
		p3.InputProduct();
		p4.InputProduct();
		p5.InputProduct();
		
		p1.DisplayProduct();
		p2.DisplayProduct();
		p3.DisplayProduct();
		p4.DisplayProduct();
		p5.DisplayProduct();
	}

}
}
