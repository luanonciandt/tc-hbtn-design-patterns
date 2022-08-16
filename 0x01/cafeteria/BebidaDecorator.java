import java.util.List;

public class BebidaDecorator extends Bebida {

    private Bebida bebidaDecorada;

    public BebidaDecorator(Bebida bebida) {
        bebidaDecorada = bebida;
    }

    @Override
    public List<String> obterIngredientes() {
        return bebidaDecorada.obterIngredientes();
    }

    @Override
    public double obterPreco() {
        return bebidaDecorada.obterPreco();
    }

    public Bebida getBebidaDecorada() {
        return bebidaDecorada;
    }

}
