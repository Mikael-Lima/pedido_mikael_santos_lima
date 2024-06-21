import java.math.BigInteger;
import java.time.LocalDate;

public class Pedido {
    private BigInteger id;
    private LocalDate pagamento;
    private LocalDate entrega;
    private LocalDate compra;
    private BigInteger numero;
    private Cliente cliente;
    private FormaPagamento formaPagamento;
    
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public LocalDate getPagamento() {
        return pagamento;
    }
    public void setPagamento(LocalDate pagamento) {
        this.pagamento = pagamento;
    }
    public LocalDate getEntrega() {
        return entrega;
    }
    public void setEntrega(LocalDate entrega) {
        this.entrega = entrega;
    }
    public LocalDate getCompra() {
        return compra;
    }
    public void setCompra(LocalDate compra) {
        this.compra = compra;
    }
    public BigInteger getNumero() {
        return numero;
    }
    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    
    public Pedido(BigInteger id, LocalDate pagamento, LocalDate entrega, LocalDate compra, BigInteger numero,
            Cliente cliente, FormaPagamento formaPagamento) {
        this.id = id;
        this.pagamento = pagamento;
        this.entrega = entrega;
        this.compra = compra;
        this.numero = numero;
        this.cliente = cliente;
        this.formaPagamento = formaPagamento;
    }
    @Override
    public String toString() {
        return "Pedido [id=" + id + ", pagamento=" + pagamento + ", entrega=" + entrega + ", compra=" + compra
                + ", numero=" + numero + ", cliente=" + cliente + ", formaPagamento=" + formaPagamento + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((pagamento == null) ? 0 : pagamento.hashCode());
        result = prime * result + ((entrega == null) ? 0 : entrega.hashCode());
        result = prime * result + ((compra == null) ? 0 : compra.hashCode());
        result = prime * result + ((numero == null) ? 0 : numero.hashCode());
        result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
        result = prime * result + ((formaPagamento == null) ? 0 : formaPagamento.hashCode());
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
        Pedido other = (Pedido) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (pagamento == null) {
            if (other.pagamento != null)
                return false;
        } else if (!pagamento.equals(other.pagamento))
            return false;
        if (entrega == null) {
            if (other.entrega != null)
                return false;
        } else if (!entrega.equals(other.entrega))
            return false;
        if (compra == null) {
            if (other.compra != null)
                return false;
        } else if (!compra.equals(other.compra))
            return false;
        if (numero == null) {
            if (other.numero != null)
                return false;
        } else if (!numero.equals(other.numero))
            return false;
        if (cliente == null) {
            if (other.cliente != null)
                return false;
        } else if (!cliente.equals(other.cliente))
            return false;
        if (formaPagamento == null) {
            if (other.formaPagamento != null)
                return false;
        } else if (!formaPagamento.equals(other.formaPagamento))
            return false;
        return true;
    }

}
