import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = sc.next();
        System.out.print("Número da Conta: ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine().toUpperCase();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();

        String imprimir = imprimir(agencia, numero, nomeCliente, saldo);
        System.out.println(imprimir);

        sc.close();

    }

    public static String imprimir(String agencia, int numero, String nome, double saldo) {
        return "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";
    }

    /* método sem retorno
    public static void imprimir(String agencia, int numero, String nome, double saldo) {
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
    */
    
}
