package br.com.nextapps.aplication.mercado.endereco.data;

import java.io.Serializable;

class Estado  implements Serializable {

    private final int codigo;
    private final String nome;
    private final String uf;

    public Estado() {
        this.codigo = 0;
        this.nome = null;
        this.uf = null;
    }

    public Estado(int codigo, String nome, String uf) {
        this.codigo = codigo;
        this.nome = nome;
        this.uf = uf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + this.codigo;
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
        final Estado other = (Estado) obj;
        if (this.codigo != other.codigo) {
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

    public String getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Estado{" + "codigo=" + codigo + ", nome=" + nome + ", uf=" + uf + '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigo;
        private String nome;
        private String uf;

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

        public Builder setUf(String uf) {
            this.uf = uf;
            return this;
        }

        public Estado build() {
            return new Estado(codigo, nome, uf);
        }

        public Builder(int codigo, String nome, String uf) {
            this.codigo = codigo;
            this.nome = nome;
            this.uf = uf;
        }

    }
}
