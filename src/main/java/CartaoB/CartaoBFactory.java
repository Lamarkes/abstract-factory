package CartaoB;

import interfaces.CalculoFactory;
import interfaces.Desconto;
import interfaces.Juros;
import interfaces.Multa;

public class CartaoBFactory implements CalculoFactory {
    @Override
    public Juros criarJuros() {
        return new CartaoBJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new CartaoBDesconto();
    }

    @Override
    public Multa criarMulta() {
        return new CartaoBMulta();
    }
}
