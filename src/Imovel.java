import lombok.Data;

import java.util.Scanner;

@Data
public class Imovel {
    private String endereco;
    private double valorVenda, valorAluguel, imposto;
    private boolean novo;

    public Imovel(String endereco, double valorVenda, double valorAluguel, boolean novo) {
        this.endereco = endereco;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
        this.novo = novo;
    }
    public void infoImovel() {
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Valor de Venda: " + getValorVenda());
        System.out.println("Valor de Aluguel: " + getValorAluguel());
        System.out.println("Imposto: " + getImposto());
    }
    public void verificaIdade() {
        System.out.println("O imóvel é novo? (S/N)");
        Scanner verificaIdade = new Scanner(System.in);
        String idade = verificaIdade.next();
        if (idade == "S")
            novo = true;
        else novo = false;
    }
    public void calculaImposto() {
        if (novo) {
            imposto = 0.15 * getValorVenda();
        }
        else
            imposto = 0.10 * getValorAluguel();
    }
}
