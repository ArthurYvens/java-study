import java.util.Locale;
import java.util.Scanner;
public class exercicio_2 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		double calculo = Math.pow(x, 2);
		double resultado = calculo * 3.14159;
		x = sc.nextDouble();
		double calculo1 = Math.pow(x, 2);
		double resultado1 = calculo1 * 3.14159;
		x = sc.nextDouble();
		double calculo2 = Math.pow(x, 2);
		double resultado2 = calculo2 * 3.14159;
		
		System.out.printf("%.4f %n",resultado);
		System.out.printf("%.4f %n",resultado1);
		System.out.printf("%.4f",resultado2);
	}
}
