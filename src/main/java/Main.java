import CartaoB.CartaoBFactory;
import cartaoA.CalcularAFactory;

public class Main {
    public static void main(String[] args) {


        var cartaoA = new Cartao();

        cartaoA.gerarBoleto(100, new CalcularAFactory());

        System.out.println("-------------------");

        var cartaoB = new Cartao();

        cartaoB.gerarBoleto(100, new CartaoBFactory());
    }
}
