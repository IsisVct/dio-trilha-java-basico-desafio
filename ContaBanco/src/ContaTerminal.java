import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // conhcer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // exibir as mensagens para o usuárioe obter pela classe Scanner os dados do
        // usuário no terminal
        System.out.println("Por favor, informe o número da agência: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, informe o nome da dua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, informe o saldo da sua conta: ");
        String saldoStr = scanner.next().replace(",", "."); // Substitui vírgula por ponto
        double saldo = Double.parseDouble(saldoStr);
        // exibir as informações do usuário da conta criada
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
