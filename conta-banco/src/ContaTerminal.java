import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {

    //TODO: Conhecer e importar a classe Scanner

    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência!");
    String agencia = scanner.nextLine();

    System.out.println("Por favor, digite o número da Conta!");
    int conta = Integer.parseInt(scanner.nextLine());

    System.out.println("Por favor, digite o nome do Cliente!");
    String nomeCliente = scanner.nextLine();

    System.out.println("Por favor, digite o Saldo!");
    double saldo = scanner.nextDouble();

    System.out.println(
        String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, "
            + "conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, conta, saldo));
  }
}
