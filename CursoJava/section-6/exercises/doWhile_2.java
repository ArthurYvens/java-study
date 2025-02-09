import java.util.Scanner;
public class doWhile_2 {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int resposta = 0;
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		while(resposta != 4) {
			resposta = sc.nextInt();
			if(resposta == 1) {
				alcool += 1;
			}else if(resposta == 2){
				gasolina += 1;
			}else if(resposta == 3) {
				disel += 1;
			}else if(resposta == 4){
				System.out.println("Muito Obrigado!");
				System.out.printf("alcool: %d %ngasolina: %d %ndisel: %d %n", alcool, gasolina, disel);
			}
		}
	}
}
