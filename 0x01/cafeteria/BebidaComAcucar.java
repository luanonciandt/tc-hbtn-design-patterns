import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator {

    public BebidaComAcucar(Bebida bebida) {
        super(bebida);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientesComAcucar = new ArrayList<>(super.obterIngredientes());
        ingredientesComAcucar.add("acucar");
        return ingredientesComAcucar;
    }

    @Override
    public double obterPreco() {
        return super.obterPreco() + 1.9;
    }
}
