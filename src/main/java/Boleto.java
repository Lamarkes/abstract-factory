import interfaces.CalculoFactory;
import interfaces.Desconto;
import interfaces.Juros;
import interfaces.Multa;
import lombok.Data;

@Data
public class Boleto {

    private double valor;
    private Juros juros;
    private Multa multa;
    private Desconto desconto;


    public Boleto(double valor, CalculoFactory calculoFactory){
        this.valor = valor;
        this.juros = calculoFactory.criarJuros();
        this.desconto = calculoFactory.criarDesconto();
        this.multa = calculoFactory.criarMulta();
    }

    public double calcularJuros(){
        return this.valor * this.juros.getJuros();
    }

    public double calcularMulta(){
        return this.valor * this.multa.getMulta();
    }

    public double calcularDesconto(){
        return this.valor * this.desconto.getDesconto();
    }
}
