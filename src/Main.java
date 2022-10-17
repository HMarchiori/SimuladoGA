public class Main {
    public static void main(String[] args) {
        contaCorrente conta = new contaCorrente(10, 20);
        conta.efetuaSaque();
        conta.imprimeInfo();
    }
}