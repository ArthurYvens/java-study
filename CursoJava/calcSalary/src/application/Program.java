package application;
import java.util.Locale;
import java.util.Scanner;
import entities.calcSalary;
public class Program {
	
	public static void main(String [] args) {
		
	Scanner sc = new Scanner(System.in);
	calcSalary employee = new calcSalary();
	
	System.out.println("Name: ");
	employee.name = sc.next();
	System.out.println("GrossSalary: ");
	employee.GrossSalary = sc.nextDouble();
	System.out.println("Tax: ");
	employee.Tax = sc.nextDouble();
	
	System.out.println("Insert a percentage: ");
	double percentage = sc.nextDouble();
	
	employee.IncreaseSalary(percentage);
	
	System.out.println(employee.NetSalary());
	
	}
}
