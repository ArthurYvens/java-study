public class ContaBanco {
    public static void main(String[] args) throws Exception {

        ContaTerminal contaTerminal = new ContaTerminal();

        int numeroDaConta = contaTerminal.NumeroDaConta();
        String nomeCliente = contaTerminal.NomeCliente();
        String agencia = contaTerminal.Agencia();
        double saldo = contaTerminal.Saldo();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo " + saldo + " já está disponível para saque.");

        contaTerminal.close();

    }
}