import java.util.HashSet;
import java.util.Set;

public class Pedido {

    private Set<ItemPedido> itensDentroCaixa = new HashSet<>();
    private Set<ItemPedido> itensForaCaixa = new HashSet<>();

    public Pedido() {}

    public void adicionaItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionaItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fora da Caixa:\n");

        for (ItemPedido item : this.itensForaCaixa) {
            sb.append(" - ").append(item.getTipo()).append(" ").append(item.getNome()).append("\n");
        }
        sb.append("Dentro da Caixa:\n");

        for (ItemPedido item : this.itensDentroCaixa) {
            sb.append(" - ").append(item.getTipo()).append(" ").append(item.getNome()).append("\n");
        }

        return sb.toString();
    }
}
