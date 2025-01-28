import java.util.Scanner;
import java.util.Locale;
public class condicional_1 {
;
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if(numero >= 0) {
			System.out.println("O número é positivo");
		}
		else {
			System.out.println("O número é negativo");
		}
	}
	
}
