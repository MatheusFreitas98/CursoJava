package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.print("Enter product data: \nName: ");		
		String name = scan.next();
		
		System.out.print("Price: ");
		double price = scan.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = scan.nextInt();		
		
		Product product = new Product(name, price, quantity);
		
		
		System.out.println("\nProduct data: " + product + "\n");
		
		
		System.out.print("Enter the number of products to be added in stock: ");
		
		quantity = scan.nextInt();
		product.addProducts(quantity);
		
		
		System.out.println("\nProduct data: " + product + "\n");
		
		
		System.out.print("Enter the number of products to be removed in stock: ");
		
		quantity = scan.nextInt();
		product.removeProducts(quantity);
		
		System.out.println("\nProduct data: " + product + "\n");
		
		scan.close();

	}

}
