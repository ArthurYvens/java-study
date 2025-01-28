import java.util.Scanner;
import java.util.Locale;
public class condicional_8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double x = sc.nextDouble();

		if(x <= 2000) {
			System.out.println("Isento");
		}
		else if(x >= 2000.01 && x <= 3000){
			x = (x - 3000) + 1000 * 0.8;
			System.out.printf("R$ %.2f",x);	
		}
		else if(x >= 3000.01 && x <= 4500){
			x = (x - 3000) * 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f",x);
		}
		else if(x >= 4500.01){
			x = (x - 4000) * 0.28 + 1500 + 0.18 + 1000 * 0.08;
			System.out.printf("R$ %.2f",x);
		}
	}
}
