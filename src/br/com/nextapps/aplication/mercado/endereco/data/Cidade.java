package br.com.nextapps.aplication.mercado.endereco.data;

import java.io.Serializable;

class Cidade implements Serializable{

    private final int codigo;
    private final String nome;
    private final Estado estado;

    public Cidade() {
        this.codigo = 0;
        this.nome = null;
        this.estado = null;
    }

    public Cidade(int codigo, String nome, Estado estado) {
        this.codigo = codigo;
        this.nome = nome;
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.codigo;
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
        final Cidade other = (Cidade) obj;
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

    public Estado getEstado() {
        return estado;
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Cidade{"
                + "codigo=" + codigo
                + ", nome=" + nome
                + ", estado=" + estado + '}';
    }

    static public class Builder {

        private int codigo;
        private String nome;
        private Estado estado;

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

        public Builder setEstado(Estado estado) {
            this.estado = estado;
            return this;
        }

        public Cidade build() {
            return new Cidade(codigo, nome, estado);
        }

        public Builder(int codigo, String nome, Estado estado) {
            this.codigo = codigo;
            this.nome = nome;
            this.estado = estado;
        }

        @Override
        public String toString() {
            return "Builder{"
                    + "codigo=" + codigo
                    + ", nome=" + nome
                    + ", estado=" + estado + '}';
        }

    }
}
