
import java.math.BigInteger;

public class Estado {

    private BigInteger id;
    private String nome;

    public BigInteger getid(){
        return id;
    }

    public void setid (BigInteger id){
        this.id = id;
    }

    public String getnome() {
        return nome;
    }
    
    public void setnome(String nome){
        this.nome = nome;
    }

    public Estado(){
        super();
    }

    public Estado(BigInteger id, String nome) {
        
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Estado [id=" + id + ", nome=" + nome + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
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
        Estado other = (Estado) obj;
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
        return true;
    }

   
    
}

