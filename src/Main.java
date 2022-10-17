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
            System.out.println("Informe o endereço do imóvel");
            Scanner valorEndereco1 = new Scanner(System.in);
            String endereco1 = valorEndereco1.next();

            System.out.println("Informe o valor de venda do imóvel");
            Scanner valorVenda1 = new Scanner(System.in);
            double venda1 = valorVenda1.nextDouble();

            System.out.println("Informe o valor de aluguel do imóvel");
            Scanner valorAluguel1 = new Scanner(System.in);
            double aluguel1 = valorAluguel1.nextDouble();

            System.out.println("O imóvel é novo? (S/N)");
            Scanner verificaIdade = new Scanner(System.in);
            String idade1 = verificaIdade.next();
            boolean novo;
            if (idade1 == "S")
                novo = true;
            else novo = false;

            Imovel imovel1 = new Imovel(endereco1, venda1, aluguel1, novo);

        System.out.println("Informe o endereço do imóvel 2");
        Scanner valorEndereco2 = new Scanner(System.in);
        String endereco2 = valorEndereco2.next();

        System.out.println("Informe o valor de venda do imóvel 2");
        Scanner valorVenda2 = new Scanner(System.in);
        double venda2 = valorVenda2.nextDouble();

        System.out.println("Informe o valor de aluguel do imóvel 2");
        Scanner valorAluguel2 = new Scanner(System.in);
        double aluguel2 = valorAluguel2.nextDouble();

        System.out.println("O imóvel 2 é novo? (S/N)");
        Scanner verificaIdade2 = new Scanner(System.in);
        String idade2 = verificaIdade.next();
        boolean novo2;
        if (idade2 == "S")
            novo2 = true;
        else novo2 = false;

        Imovel imovel2 = new Imovel(endereco2, venda2, aluguel2, novo2);
            }
        }