import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta");
        numero = sc.nextInt();

        System.out.println("Por favor, digite o número da agencia");
        agencia = sc.next();

        System.out.println("Por favor, digite o nome do cliente");
        nomeCliente = sc.next();

        System.out.println("Por favor, digite o saldo");
        saldo = sc.nextDouble();

        System.out.println("Olá "
            + nomeCliente
            + ", obrigado por criar uma conta em nosso banco, sua agência é "
            + agencia
            + ", conta "
            + numero
            + " e seu saldo "
            + saldo
            + " já está disponível para saque"
         );
    }
}
