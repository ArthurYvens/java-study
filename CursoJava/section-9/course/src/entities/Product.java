package entities;
import java.util.Scanner;
import java.util.Locale;
public class Product {		
	
		private String name;
		private double price;
		private int quantity;
		
		public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
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
		
		public String getName(){
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getPrice() {
			return price;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}

		public int getQuantity() {
			return quantity;
		}
		
}
