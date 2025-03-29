import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_conta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, Digite o número da conta: ");

        num_conta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, Digite o número da agência: ");

        agencia = scanner.nextLine();

        System.out.println("Por favor, Digite seu nome: ");

        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, Digite o saldo: ");

        saldo = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + num_conta + " e seu saldo " + saldo+ " já está disponível para saque");
    }
}