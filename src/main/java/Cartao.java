import interfaces.CalculoFactory;

public class Cartao {

    public Boleto gerarBoleto(double valor, CalculoFactory calculoFactory){
        var boleto = new Boleto(valor, calculoFactory);
        System.out.println("Valor do boleto R$: "+ boleto.getValor());
        System.out.println("Juros do boleto R$: " + boleto.calcularJuros() );
        System.out.println("Multa do boleto R$: "+ boleto.calcularMulta());
        System.out.println("Desconto do boleto R$: "+ boleto.calcularDesconto());

        return null;
    }
}
