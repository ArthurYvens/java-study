import java.util.Scanner;
public class For_1 {
	public static void main (String []args) {
		
		Scanner sc = new Scanner(System.in);
		
		int quantidadeDeRepeticoes = sc.nextInt();
		int entrada = 0;
		int out = 0;
		int in = 0;

		for(int i = 0; i<quantidadeDeRepeticoes; i++) {
			
			entrada = sc.nextInt();
			if(entrada <= 10) {
				in += 1;			
			}else{
				out += 1;
			}
		}
		System.out.println(out + " out");
		System.out.println(in + " in");
	}
}
