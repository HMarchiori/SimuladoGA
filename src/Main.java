import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, informe seu número de conta corrente ");
        Scanner valorNumero = new Scanner(System.in);
        int num = valorNumero.nextInt();
        System.out.println("Agora informe seu saldo: ");
        Scanner valorSaldo = new Scanner(System.in);
        double saldo = valorSaldo.nextInt();

        contaCorrente conta1 = new contaCorrente(num, saldo);
        int contador = 0;
        while (contador != 4) {
            System.out.println("\n--MENU PRINCIPAL--");
            System.out.println("1) Efetuar um saque");
            System.out.println("2) Efetuar um depósito");
            System.out.println("3) Imprimir informações da conta");
            System.out.println("4) Sair do menu");
            Scanner cont = new Scanner(System.in);
            contador = cont.nextInt();
            if (contador == 1) {
                conta1.efetuaSaque();
            }
            else if (contador == 2) {
                conta1.efetuaDeposito();
            } else if (contador == 3) {
                conta1.imprimeInfo();
            }
            else break;
        }
        for (int i=0; i<3; i++) {
            System.out.println("teste");
        }
    }
}