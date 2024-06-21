import java.math.BigInteger;

public class ItemPedido {
     private BigInteger id;
     private Double quantidade;
     private BigInteger precoUnidade;
     private Pedido pedido;
     private Produto produto;
     
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public Double getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Double quantidade) {
        this.quantidade = quantidade;
    }
    public BigInteger getPrecoUnidade() {
        return precoUnidade;
    }
    public void setPrecoUnidade(BigInteger precoUnidade) {
        this.precoUnidade = precoUnidade;
    }
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    public ItemPedido(BigInteger id, Double quantidade, BigInteger precoUnidade, Pedido pedido, Produto produto) {
        this.id = id;
        this.quantidade = quantidade;
        this.precoUnidade = precoUnidade;
        this.pedido = pedido;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "ItemPedido [id=" + id + ", quantidade=" + quantidade + ", precoUnidade=" + precoUnidade + ", pedido="
                + pedido + ", produto=" + produto + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((quantidade == null) ? 0 : quantidade.hashCode());
        result = prime * result + ((precoUnidade == null) ? 0 : precoUnidade.hashCode());
        result = prime * result + ((pedido == null) ? 0 : pedido.hashCode());
        result = prime * result + ((produto == null) ? 0 : produto.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemPedido other = (ItemPedido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (quantidade == null) {
            if (other.quantidade != null)
                return false;
        } else if (!quantidade.equals(other.quantidade))
            return false;
        if (precoUnidade == null) {
            if (other.precoUnidade != null)
                return false;
        } else if (!precoUnidade.equals(other.precoUnidade))
            return false;
        if (pedido == null) {
            if (other.pedido != null)
                return false;
        } else if (!pedido.equals(other.pedido))
            return false;
        if (produto == null) {
            if (other.produto != null)
                return false;
        } else if (!produto.equals(other.produto))
            return false;
        return true;
    }

     
}
