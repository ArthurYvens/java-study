import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        int numeroDaConta;
        String nomeCliente, agencia;
        double saldo;

        numeroDaConta = sc.nextInt();
        agencia =sc.next();
        nomeCliente = sc.next();
        saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
}
}