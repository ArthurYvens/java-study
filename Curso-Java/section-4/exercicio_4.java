import java.util.Locale;
import java.util.Scanner;
public class exercicio_4 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double salario = B * C;
		
		System.out.printf("NUMBER: %d %n", A);
		System.out.printf("SALARY: %.2f", salario);
	}
}
