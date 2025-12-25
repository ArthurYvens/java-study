import java.util.Scanner;

public class ContaTerminal {

    int numeroDaConta;
    String nomeCliente, agencia;
    double saldo;

    Scanner sc = new Scanner(System.in);

    int NumeroDaConta(int numeroDaConta) {
        numeroDaConta = sc.nextInt("Por favor, digite o número da Agência");
        return numeroDaConta;
    }           
              
    String NomeCliente(String nomeCliente) {
        nomeCliente = sc.next("Por favor, digite o nome do Cliente");
        return nomeCliente;
    }
        
    String Agencia(String agencia) {
        agencia = sc.next("Por favor, digite o número da Conta");
        return agencia;
    }
    double Saldo(double saldo) {
        saldo = sc.nextDouble("Por favor, digite o saldo da Conta");
        return saldo;
        }
    }