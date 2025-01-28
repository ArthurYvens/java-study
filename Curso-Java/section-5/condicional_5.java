import java.util.Scanner;
import java.util.Locale;
public class condicional_5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double codigo = sc.nextDouble();
		int quantidade = sc.nextInt();
		double preco;

		if(codigo == 1) {
			preco = quantidade * 4;
			System.out.println(preco);
		}
		else {
			if(codigo == 2){
				preco = quantidade * 4.50;
				System.out.println(preco);
			}
			else {
				if(codigo == 3){
					preco = quantidade * 5;
					System.out.println(preco);
				}
				else {
					if(codigo == 4){
						preco = quantidade * 2;
						System.out.println(preco);
					}
					else {
						if(codigo == 5){
							preco = quantidade * 1.50;
							System.out.println(preco);
						}
					}
				}
			}
		}
	}
}

