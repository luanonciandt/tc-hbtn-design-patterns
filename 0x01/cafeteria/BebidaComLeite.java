import java.util.ArrayList;
import java.util.List;

public class BebidaComLeite extends BebidaDecorator {

    public BebidaComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientesComLeite = new ArrayList<>(super.obterIngredientes());
        ingredientesComLeite.add("leite");
        return ingredientesComLeite;
    }

    @Override
    public double obterPreco() {
        return getBebidaDecorada().obterPreco() + 3.2;
    }
}
