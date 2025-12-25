import java.util.Scanner;

public class ContaTerminal {

        private Scanner sc = new Scanner(System.in);

        public int NumeroDaConta() {
            System.out.print("Por favor, digite o número da Conta: ");
            int numero = sc.nextInt();
            sc.nextLine();
            return numero;
        }

        public String NomeCliente() {
            System.out.print("Por favor, digite o nome do Cliente: ");
            return sc.nextLine();
        }

        public String Agencia() {
            System.out.print("Por favor, digite o número da Agência: ");
            return sc.nextLine();
        }

        public double Saldo() {
            System.out.print("Por favor, digite o saldo da Conta: ");
            return sc.nextDouble();
        }

        public void close() {
            sc.close();
        }
}