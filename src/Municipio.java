import java.math.BigInteger;

public class Municipio {
    
    private BigInteger id;
    private String nome;
    private Boolean entrega;
    private Estado estado;

    
    public BigInteger getid(){
        return id;
    }

    public void setid(BigInteger idEnviado){
        this.id = idEnviado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getEntrega() {
        return entrega;
    }

    public void setEntrega(Boolean entrega) {
        this.entrega = entrega;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Municipio(){
        super();
    }

    public Municipio(BigInteger id, String nome, Boolean entrega, Estado estado){
        
        this.id = id;
        this.nome = nome;
        this.entrega = entrega;
        this.estado = estado;
    }
    
    // toString - Multiplas Linhas
    public String toString(){
        return getid() + "\n" + getNome() + "\n" + getEntrega() + "\n" + getEstado();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((entrega == null) ? 0 : entrega.hashCode());
        result = prime * result + ((estado == null) ? 0 : estado.hashCode());
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
        Municipio other = (Municipio) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (entrega == null) {
            if (other.entrega != null)
                return false;
        } else if (!entrega.equals(other.entrega))
            return false;
        if (estado == null) {
            if (other.estado != null)
                return false;
        } else if (!estado.equals(other.estado))
            return false;
        return true;
    }

    
}   
