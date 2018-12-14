package br.com.nextapps.aplication.mercado.produto.data;

import java.io.Serializable;

public class Categoria  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int codigo;
    private final int codigoMercado;
    private final String nome;

    public Categoria() {
        this.codigo = 0;
        this.codigoMercado = 0;
        this.nome = null;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigo;
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
        final Categoria other = (Categoria) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{"
                + "codigo=" + codigo
                + ", codigoMercado=" + codigoMercado + ", nome=" + nome + '}';
    }

    public Categoria(int codigo,
            int codigoMercado,
            String nome) {

        this.codigo = codigo;
        this.codigoMercado = codigoMercado;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCodigoMercado() {
        return codigoMercado;
    }

    public String getNome() {
        return nome;
    }

    public Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigo;
        private int codigoMercado;
        private String nome;

        private Builder() {
        }

        public Builder setCodigo(int codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder setCodigoMercado(int codigoMercado) {
            this.codigoMercado = codigoMercado;
            return this;
        }

        public Builder setNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Categoria build() {
            return new Categoria(codigo, codigoMercado, nome);
        }

        public Builder(int codigo,
                int codigoMercado,
                String nome) {

            this.codigo = codigo;
            this.codigoMercado = codigoMercado;
            this.nome = nome;
        }

        @Override
        public String toString() {
            return "Builder{"
                    + "codigo=" + codigo
                    + ", codigoMercado=" + codigoMercado
                    + ", nome=" + nome + '}';
        }

    }

}
