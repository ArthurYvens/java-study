import java.util.Scanner;
import contaBanco;

public class ContaBanco {
    public static void main(String[] args) throws Exception {

        ContaTerminal conta = new ContaTerminal();

        int numeroDaConta = conta.NumeroDaConta();
        String nomeCliente = conta.NomeCliente();
        String agencia = conta.Agencia();
        double saldo = conta.Saldo();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

        
}
}