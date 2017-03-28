package br.com.nextapps.aplication.mercado.produto.data;

import java.io.Serializable;

public class Produto  implements Serializable{

    private final int codigo;
    private final int codigoMercado;
    private final String nome;
    private final float valor;
    private final String foto;
    private final String descricao;
    private final Categoria categoria;

    public Produto() {
        this.codigo = 0;
        this.codigoMercado = 0;
        this.nome = null;
        this.valor = 0;
        this.foto = null;
        this.descricao = null;
        this.categoria = null;
    }

    public Produto(int codigo,
            int codigoMercado,
            String nome,
            float valor,
            String foto,
            String descricao,
            Categoria categoria) {

        this.codigo = codigo;
        this.codigoMercado = codigoMercado;
        this.nome = nome;
        this.valor = valor;
        this.foto = foto;
        this.descricao = descricao;
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + this.codigo;
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
        final Produto other = (Produto) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
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

    public float getValor() {
        return valor;
    }

    public String getFoto() {
        return foto;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Produto{"
                + "codigo=" + codigo
                + ", codigoMercado=" + codigoMercado
                + ", nome=" + nome
                + ", valor=" + valor
                + ", foto=" + foto
                + ", descricao=" + descricao
                + ", categoria=" + categoria + '}';
    }

    public Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigo;
        private int codigoMercado;
        private String nome;
        private float valor;
        private String foto;
        private String descricao;
        private Categoria categoria;

        private Builder() {
        }

        public Produto build() {
            return new Produto(codigo, codigoMercado, nome, valor, foto, descricao, categoria);
        }

        public Builder(int codigo,
                int codigoMercado,
                String nome,
                float valor,
                String foto,
                String descricao,
                Categoria categoria) {

            this.codigo = codigo;
            this.codigoMercado = codigoMercado;
            this.nome = nome;
            this.valor = valor;
            this.foto = foto;
            this.descricao = descricao;
            this.categoria = categoria;
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

        public Builder setValor(float valor) {
            this.valor = valor;
            return this;
        }

        public Builder setFoto(String foto) {
            this.foto = foto;
            return this;
        }

        public Builder setDescricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Builder setCategoria(Categoria categoria) {
            this.categoria = categoria;
            return this;
        }

        @Override
        public String toString() {
            return "Builder{"
                    + "codigo=" + codigo
                    + ", codigoMercado=" + codigoMercado
                    + ", nome=" + nome
                    + ", valor=" + valor
                    + ", foto=" + foto
                    + ", descricao=" + descricao
                    + ", categoria=" + categoria + '}';
        }

    }
}
