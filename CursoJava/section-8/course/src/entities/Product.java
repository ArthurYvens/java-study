package entities;
import java.util.Scanner;
import java.util.Locale;
public class Product {		
	
		public String name;
		public double price;
		public int quantity;
		
		public double TotalValueInStock() {
			return price * quantity;
		}
		
		public int AddProducts(int quantity) {	
			this.quantity += quantity;		
			return quantity;
		}
		
		public void RemoveStock(int quantity) {
			this.quantity -= quantity;
		}
		
		
}
