package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;
public class Program {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Triangle x, y;
		x = new Triangle();
		y = new Triangle();
		
		System.out.println("Enter the mesures of triangle X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the mesures of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		double areaY = y.area();
		
		if(areaX > areaY) {
			System.out.println("Area X is higher: " + areaX);
		}else {
			System.out.println("Area Y is higher: " + areaY);
		}
		
	}
}
