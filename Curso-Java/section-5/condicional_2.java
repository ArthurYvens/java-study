import java.util.Locale;
import java.util.Scanner;
public class condicional_2 {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		int resto = numero % 2;
		
		if( resto == 0) {
			System.out.printf("O número %d é inteiro", numero);
		}
		else {
			System.out.printf("O número %d não é inteiro", numero);
		}
		
	}
}
