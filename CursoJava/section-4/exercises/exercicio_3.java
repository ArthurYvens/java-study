import java.util.Locale;
import java.util.Scanner;
public class exercicio_3 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		
		double diferenca = (A * B) - (C * D);
		
		System.out.println(diferenca);
	}
}
