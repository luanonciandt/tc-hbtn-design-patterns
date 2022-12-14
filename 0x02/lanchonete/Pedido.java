import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();

    public Pedido() {}

    public void adicionarItemDentroCaixa(ItemPedido item) {
        this.itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        this.itensForaCaixa.add(item);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("\tFora da Caixa:\n");

        for (ItemPedido item : this.itensForaCaixa) {
            sb.append("\t\t- ").append(item.getTipo()).append(" ").append(item.getNome()).append("\n");
        }
        sb.append("\tDentro da Caixa:\n");

        for (ItemPedido item : this.itensDentroCaixa) {
            sb.append("\t\t- ").append(item.getTipo()).append(" ").append(item.getNome()).append("\n");
        }

        return sb.toString();
    }
}
