package br.com.nextapps.aplication.mercado.endereco.data;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Mercado implements Serializable {

    private final int codigo;
    private final String nome;
    private final String cnpj;
    private final String telefone;
    private final String email;
    private final List<Endereco> enderecos;

    public Mercado() {
        this.codigo = 0;
        this.nome = null;
        this.cnpj = null;
        this.telefone = null;
        this.email = null;
        this.enderecos = null;
    }

    public Mercado(int codigo,
            String nome,
            String cnpj,
            String telefone,
            String email,
            List<Endereco> enderecos) {

        this.codigo = codigo;
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.email = email;
        this.enderecos = enderecos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mercado other = (Mercado) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.enderecos, other.enderecos)) {
            return false;
        }
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    @Override
    public String toString() {
        return "Mercado{"
                + "codigo=" + codigo
                + ", nome=" + nome
                + ", cnpj=" + cnpj
                + ", telefone=" + telefone
                + ", email=" + email
                + ", enderecos=" + enderecos + '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigo;
        private String nome;
        private String cnpj;
        private String telefone;
        private String email;
        private List<Endereco> enderecos;

        private Builder() {
        }

        public Builder setCodigo(int codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setCnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder setTelefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setEnderecos(List<Endereco> enderecos) {
            this.enderecos = enderecos;
            return this;
        }

        public Mercado build() {
            return new Mercado(codigo, nome, cnpj, telefone, email, enderecos);
        }

        public Builder(int codigo,
                String nome,
                String cnpj,
                String telefone,
                String email,
                List<Endereco> enderecos) {

            this.codigo = codigo;
            this.nome = nome;
            this.cnpj = cnpj;
            this.telefone = telefone;
            this.email = email;
            this.enderecos = enderecos;
        }

        @Override
        public String toString() {
            return "Builder{"
                    + "codigo=" + codigo
                    + ", nome=" + nome
                    + ", cnpj=" + cnpj
                    + ", telefone=" + telefone
                    + ", email=" + email
                    + ", enderecos=" + enderecos + '}';
        }

    }
}
