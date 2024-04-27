import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da sua Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite seu Nome Completo: ");
        String nome_cliente = scanner.nextLine();
        
        System.out.print("Digite o seu saldo: R$ ");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque.", nome_cliente, agencia, numero, saldo);

        scanner.close();
    }
}
