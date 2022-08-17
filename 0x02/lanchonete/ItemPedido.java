import java.util.Objects;

public class ItemPedido {

    private TipoItemPedido tipo;
    private String nome;

    public TipoItemPedido getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setTipo(TipoItemPedido tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ItemPedido that = (ItemPedido) o;
        return getTipo() == that.getTipo() && Objects.equals(getNome(), that.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo.toString().charAt(0), nome.charAt(0));
    }
}
