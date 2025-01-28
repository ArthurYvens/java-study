import java.util.Scanner;
import java.util.Locale;
public class condicional_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		
		if(horaInicial < horaFinal){
			duracao = horaFinal - horaInicial;
		}
		else{
			duracao = 24 - horaInicial + horaFinal;
			// Pego do github, eu não sabia como fazer o cálculo (burro)
			// aprenda a porcaria da matemática. Você precisa adicionar a quatidade de tempo que tem em um dia para fazer o cálculo de horas, IMBECIL!
		}
		System.out.printf("O jogo durou %d", duracao);
	}
}
