package br.com.nextapps.aplication.mercado.endereco.data;

import java.io.Serializable;

class Endereco implements Serializable {

    private int codigo;
    private String logradouro;
    private String nome;
    private String numero;
    private Cidade obClidade;
    private Estado obEstado;

    public Endereco(int codigo, String logradouro, String nome, String numero, Cidade obClidade, Estado obEstado) {
        this.codigo = codigo;
        this.logradouro = logradouro;
        this.nome = nome;
        this.numero = numero;
        this.obClidade = obClidade;
        this.obEstado = obEstado;
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
        final Endereco other = (Endereco) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public Cidade getObClidade() {
        return obClidade;
    }

    public Estado getObEstado() {
        return obEstado;
    }

    @Override
    public String toString() {
        return "Endereco{"
                + "codigo=" + codigo
                + ", logradouro=" + logradouro
                + ", nome=" + nome
                + ", numero=" + numero
                + ", obClidade=" + obClidade
                + ", obEstado=" + obEstado + '}';
    }

    public Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigo;
        private String logradouro;
        private String nome;
        private String numero;
        private Cidade obClidade;
        private Estado obEstado;

        public Builder() {
        }

        public Builder setCodigo(int codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder setLogradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder setNumero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder setObClidade(Cidade obClidade) {
            this.obClidade = obClidade;
            return this;

        }

        public Builder setObEstado(Estado obEstado) {
            this.obEstado = obEstado;
            return this;
        }

        public Endereco build() {
            return new Endereco(codigo, logradouro, nome, numero, obClidade, obEstado);
        }

        public Builder(int codigo,
                String logradouro,
                String nome,
                String numero,
                Cidade obClidade,
                Estado obEstado) {

            this.codigo = codigo;
            this.logradouro = logradouro;
            this.nome = nome;
            this.numero = numero;
            this.obClidade = obClidade;
            this.obEstado = obEstado;
        }

    }

}
