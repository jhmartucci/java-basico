import java.util.Scanner;

public class ContaTerminal{

    public static void main(String[] args) throws Exception {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;   

        Scanner sc = new Scanner(System.in);

        System.out.print("Ditige o nome do cliente...: ");
        nomeCliente = sc.nextLine().toUpperCase();

        System.out.print("Digite o número da agência...: ");
        agencia = sc.nextLine();

        System.out.print("Digite o numero da conta...: ");
        numero = sc.nextInt();

        System.out.print("Digite o saldo do cliente...: ");
        saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso  banco, sua agência é " + agencia + " conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");


    }
}
