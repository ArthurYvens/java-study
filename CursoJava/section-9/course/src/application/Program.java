package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;
public class Program {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
			
		
		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		String name = sc.nextLine();
		System.out.printf("Price: ");
		double price = sc.nextDouble();
		System.out.printf("Quantity: ");
		int quantity = sc.nextInt();	
		
		Product product = new Product(name, price, quantity);
		
		product.setPrice(1200);
		product.setName("Computer");
		
		product.AddProducts(2);
		
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getQuantity());
		
		product.RemoveStock(1);
		
		System.out.println(product.TotalValueInStock());
		

	}
	
}

