import java.util.Scanner;
import java.util.Locale;
public class condicional_3 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
	
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
	
		if(num2 % num1 == 0 || num1 % num2 == 0) {
		System.out.println("São multiplos entre si");
		}
		else {
		System.out.println("Não são multiplos entre si");
		}
	}
}
