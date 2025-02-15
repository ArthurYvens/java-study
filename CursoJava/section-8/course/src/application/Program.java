package application;
import java.util.Scanner;
import java.util.Locale;
import entities.Product;
public class Program {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
			
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.printf("Name: ");
		product.name = sc.nextLine();
		System.out.printf("Price: ");
		product.price = sc.nextDouble();
		System.out.printf("Quantity: ");
		product.quantity = sc.nextInt();	
		
		product.AddProducts(5);
		
		System.out.println(product.name);
		System.out.println(product.price);
		System.out.println(product.quantity);
		
		product.RemoveStock(3);
		
		System.out.println(product.TotalValueInStock());
		

		
	}
	
}

