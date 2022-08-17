public class PedidoBuilder extends PedidoAbstractBuilder {

    private Pedido pedido;

    public PedidoBuilder() {
        this.pedido = new Pedido();
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        ItemPedido lanche = new ItemPedido();

        lanche.setTipo(TipoItemPedido.LANCHE);
        lanche.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(lanche);
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        ItemPedido batata = new ItemPedido();

        batata.setTipo(TipoItemPedido.BATATA);
        batata.setNome(tamanho.name());

        pedido.adicionarItemDentroCaixa(batata);
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        ItemPedido brinde = new ItemPedido();

        brinde.setTipo(TipoItemPedido.BRINDE);
        brinde.setNome(tipo.name());

        pedido.adicionarItemDentroCaixa(brinde);
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        ItemPedido bebida = new ItemPedido();

        bebida.setTipo(TipoItemPedido.BEBIDA);
        bebida.setNome(tipo.name());

        pedido.adicionarItemForaCaixa(bebida);
    }

    public Pedido build() {
        return pedido;
    }

}
