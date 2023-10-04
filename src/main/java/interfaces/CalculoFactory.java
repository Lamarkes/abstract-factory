package interfaces;

public interface CalculoFactory {

    Juros criarJuros();

    Desconto criarDesconto();

    Multa criarMulta();
}
