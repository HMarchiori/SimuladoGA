import lombok.Data;

@Data
public class Imovel {
    private String endereco;
    private double valorVenda, valorAluguel;

    public Imovel(String endereco, double valorVenda, double valorAluguel) {
        this.endereco = endereco;
        this.valorVenda = valorVenda;
        this.valorAluguel = valorAluguel;
    }
    public void infoImovel() {
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Valor de Venda: " + getValorVenda());
        System.out.println("Valor de Aluguel: " + getValorAluguel());
    }
    public void calculaImposto() {

    }
}
