import java.util.Scanner;
public class doWhile_1 {
	public static void main (String[]args) {
			
		Scanner sc = new Scanner(System.in);
	
		int senha = sc.nextInt();
		
		while(senha != 2002){
			
			System.out.println("Senha inválida!");
			senha = sc.nextInt();
		}
		
		System.out.println("Senha Correta!");
		
	}
}
