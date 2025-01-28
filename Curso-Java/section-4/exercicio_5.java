import java.util.Locale;
import java.util.Scanner;
public class exercicio_5 {
	public static void main(String[] args) {
		

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int  C1 = sc.nextInt();
		double NP1 = sc.nextDouble();
		double VU1 = sc.nextDouble();
		
		int  C2 = sc.nextInt();
		double NP2 = sc.nextDouble();
		double VU2 = sc.nextDouble();
		
		double calculo = NP1 * VU1 + NP2 * VU2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", calculo);
		
		
	}
}
