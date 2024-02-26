import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String Agencia;
        int Numero;
        String NomeCliente;
        double Saldo;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        Agencia = sc1.next();
        System.out.println("Por favor, digite o número da conta!");
        Numero = Integer.parseInt(sc1.next());
        System.out.println("Por favor, digite o nome do cliente!");
        NomeCliente = sc1.next();
        System.out.println("Por favor, digite o saldo !");
        Saldo = Double.parseDouble(sc1.next());
        System.out.println("Olá "+ NomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+Agencia +", conta "+Numero+" e seu saldo "+Saldo+" já está disponível para saque");
    }
}
