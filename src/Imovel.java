import lombok.Data;

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
    }
    public void calculaImposto() {
        if (novo = true) {
            imposto = 0.15 * valorVenda;
        }
        else
            imposto = 0.10 * valorAluguel;
    }
}
