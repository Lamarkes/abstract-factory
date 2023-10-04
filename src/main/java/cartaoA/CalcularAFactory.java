package cartaoA;

import interfaces.CalculoFactory;
import interfaces.Desconto;
import interfaces.Juros;
import interfaces.Multa;

public class CalcularAFactory implements CalculoFactory {
    @Override
    public Juros criarJuros() {
        return new CartaoAJuros();
    }

    @Override
    public Desconto criarDesconto() {
        return new CartaoADesconto();
    }

    @Override
    public Multa criarMulta() {
        return new CartaoAMulta();
    }
}
