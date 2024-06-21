import java.math.BigInteger;

public class Cliente {

    private BigInteger id;
    private String nome_razo_social;
    private String cpf;
    private String cnpj;
    private String telefone;
    private String informacoes;
    private Boolean ativo;
    private String email;
    private String cep;
    private String bairro;
    private String endereco;
    private Municipio municipio;

    // metodos acessores
    public BigInteger getId() {
        return id;
    }
    public void setId(BigInteger id) {
        this.id = id;
    }
    public String getNome_razo_social() {
        return nome_razo_social;
    }
    public void setNome_razo_social(String nome_razo_social) {
        this.nome_razo_social = nome_razo_social;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getInformacoes() {
        return informacoes;
    }
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
    public Boolean getAtivo() {
        return ativo;
    }
    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Municipio getMunicipio() {
        return municipio;
    }
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    } 

    // construtores
    public Cliente(BigInteger id, String nome_razo_social, String cpf, String cnpj, String telefone, String informacoes,
            Boolean ativo, String email, String cep, String bairro, String endereco, Municipio municipio) {
        this.id = id;
        this.nome_razo_social = nome_razo_social;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.informacoes = informacoes;
        this.ativo = ativo;
        this.email = email;
        this.cep = cep;
        this.bairro = bairro;
        this.endereco = endereco;
        this.municipio = municipio;
    }

     //toString
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome_razo_social=" + nome_razo_social + ", cpf=" + cpf + ", cnpj=" + cnpj
                + ", telefone=" + telefone + ", informacoes=" + informacoes + ", ativo=" + ativo + ", email=" + email
                + ", cep=" + cep + ", bairro=" + bairro + ", endereco=" + endereco + ", municipio=" + municipio + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nome_razo_social == null) ? 0 : nome_razo_social.hashCode());
        result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
        result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
        result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
        result = prime * result + ((informacoes == null) ? 0 : informacoes.hashCode());
        result = prime * result + ((ativo == null) ? 0 : ativo.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((cep == null) ? 0 : cep.hashCode());
        result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
        result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
        result = prime * result + ((municipio == null) ? 0 : municipio.hashCode());
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
        Cliente other = (Cliente) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nome_razo_social == null) {
            if (other.nome_razo_social != null)
                return false;
        } else if (!nome_razo_social.equals(other.nome_razo_social))
            return false;
        if (cpf == null) {
            if (other.cpf != null)
                return false;
        } else if (!cpf.equals(other.cpf))
            return false;
        if (cnpj == null) {
            if (other.cnpj != null)
                return false;
        } else if (!cnpj.equals(other.cnpj))
            return false;
        if (telefone == null) {
            if (other.telefone != null)
                return false;
        } else if (!telefone.equals(other.telefone))
            return false;
        if (informacoes == null) {
            if (other.informacoes != null)
                return false;
        } else if (!informacoes.equals(other.informacoes))
            return false;
        if (ativo == null) {
            if (other.ativo != null)
                return false;
        } else if (!ativo.equals(other.ativo))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (cep == null) {
            if (other.cep != null)
                return false;
        } else if (!cep.equals(other.cep))
            return false;
        if (bairro == null) {
            if (other.bairro != null)
                return false;
        } else if (!bairro.equals(other.bairro))
            return false;
        if (endereco == null) {
            if (other.endereco != null)
                return false;
        } else if (!endereco.equals(other.endereco))
            return false;
        if (municipio == null) {
            if (other.municipio != null)
                return false;
        } else if (!municipio.equals(other.municipio))
            return false;
        return true;
    }
    

}
