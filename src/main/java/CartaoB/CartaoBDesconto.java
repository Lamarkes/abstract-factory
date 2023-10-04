package CartaoB;

import interfaces.Desconto;

public class CartaoBDesconto implements Desconto {
    @Override
    public double getDesconto() {
        return 0.04;
    }
}
