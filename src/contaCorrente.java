import lombok.Data;
import java.util.Scanner;

@Data
public class contaCorrente {
    private int numero;
    private double saldo, dinheiroReposito, dinheiroSaque;

    public contaCorrente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void imprimeInfo() {
        System.out.println("Número: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }

    public void efetuaDeposito() {
        System.out.println("Digite a quantia que deseja depositar na conta: ");
        Scanner depositos = new Scanner(System.in);
        double deposito = depositos.nextInt();
        if (deposito > 0) {
            saldo = saldo + deposito;
            System.out.println("Seu saldo é de " + saldo + " reais");
        } else
            System.out.println("O valor deve ser maior que zero, depósito cancelado");
    }
    public void efetuaSaque() {
        System.out.println("Digite a quantia que deseja sacar da conta: ");
        Scanner saques = new Scanner(System.in);
        double saque = saques.nextInt();
        if (saque > 0 && saldo - saque >= 0) {
            saldo = saldo - saque;
            System.out.println("Seu saldo é de " + saldo + "reais");
        }
        else if (saldo - saque < 0 ) {
            System.out.println("ERRO: Saldo insuficiente");
        }
        else if (saque < 0) {
            System.out.println("ERRO: Insira um valor positivo");
        }
    }
}