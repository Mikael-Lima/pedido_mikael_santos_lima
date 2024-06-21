import java.math.BigDecimal;
import java.math.BigInteger;

public class Produto {
   private BigInteger id;
   private String descricao;
   private Double quantidadeEstoque; 
   private BigDecimal precoUnidadeAtual;
   private Boolean ativo;
   
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Double getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
    public void setQuantidadeEstoque(Double quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public BigDecimal getPrecoUnidadeAtual() {
        return precoUnidadeAtual;
    }
    public void setPrecoUnidadeAtual(BigDecimal precoUnidadeAtual) {
        this.precoUnidadeAtual = precoUnidadeAtual;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Produto(BigInteger id, String descricao, Double quantidadeEstoque, BigDecimal precoUnidadeAtual, Boolean ativo) {
        this.id = id;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.precoUnidadeAtual = precoUnidadeAtual;
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Produto [id=" + id + ", descricao=" + descricao + ", quantidadeEstoque=" + quantidadeEstoque
                + ", precoUnidadeAtual=" + precoUnidadeAtual + ", ativo=" + ativo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((quantidadeEstoque == null) ? 0 : quantidadeEstoque.hashCode());
        result = prime * result + ((precoUnidadeAtual == null) ? 0 : precoUnidadeAtual.hashCode());
        result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
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
        Produto other = (Produto) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (quantidadeEstoque == null) {
            if (other.quantidadeEstoque != null)
                return false;
        } else if (!quantidadeEstoque.equals(other.quantidadeEstoque))
            return false;
        if (precoUnidadeAtual == null) {
            if (other.precoUnidadeAtual != null)
                return false;
        } else if (!precoUnidadeAtual.equals(other.precoUnidadeAtual))
            return false;
        if (ativo == null) {
            if (other.ativo != null)
                return false;
        } else if (!ativo.equals(other.ativo))
            return false;
        return true;
    }

   
}
