import java.util.Scanner;

public class ContaTerminal {
    import java.util.Scanner;

    public class ContaTerminal {
        public static void main(String[] args) {
            int numero;
            String agencia = "067-8";
            String nomeCliente = "Fabio Henrique";
            double saldo = 237.48;

            Scanner ler = new Scanner(System.in);
            System.out.println("Por favor, digite o número da Agência:");
            numero = ler.nextInt();

            String mensagem = "Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                    ", conta " + numero +
                    " e seu saldo " + saldo +
                    " já está disponível para saque.";

            System.out.println(mensagem);
        }
    }
}
