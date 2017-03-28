package br.com.nextapps.aplication.mercado.produto.data;

import br.com.nextapps.aplication.mercado.endereco.data.Mercado;
import java.io.Serializable;

public class MercadoTemProduto  implements Serializable {

    private final int codigoMercado;
    private final Mercado mercado;
    private final Produto produto;
    private final int quantidade;
    private final float valor;

    public MercadoTemProduto() {
        this.codigoMercado = 0;
        this.mercado = null;
        this.produto = null;
        this.quantidade = 0;
        this.valor = 0;
    }

    public MercadoTemProduto(int codigoMercado,
            Mercado mercado,
            Produto produto,
            int quantidade,
            float valor) {

        this.codigoMercado = codigoMercado;
        this.mercado = mercado;
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + this.codigoMercado;
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
        final MercadoTemProduto other = (MercadoTemProduto) obj;
        if (this.codigoMercado != other.codigoMercado) {
            return false;
        }
        return true;
    }

    public int getCodigoMercado() {
        return codigoMercado;
    }

    public Mercado getMercado() {
        return mercado;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "MercadoTemProduto{"
                + "codigoMercado=" + codigoMercado
                + ", mercado=" + mercado
                + ", produto=" + produto
                + ", quantidade=" + quantidade
                + ", valor=" + valor + '}';
    }

    public Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigoMercado;
        private Mercado mercado;
        private Produto produto;
        private int quantidade;
        private float valor;

        private Builder() {
        }

        public Builder setCodigoMercado(int codigoMercado) {
            this.codigoMercado = codigoMercado;
            return this;
        }

        public Builder setMercado(Mercado mercado) {
            this.mercado = mercado;
            return this;
        }

        public Builder setProduto(Produto produto) {
            this.produto = produto;
            return this;
        }

        public Builder setQuantidade(int quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public Builder setValor(float valor) {
            this.valor = valor;
            return this;
        }

        public MercadoTemProduto build() {
            return new MercadoTemProduto(codigoMercado, mercado, produto, quantidade, valor);
        }

        public Builder(int codigoMercado,
                Mercado mercado,
                Produto produto,
                int quantidade,
                float valor) {

            this.codigoMercado = codigoMercado;
            this.mercado = mercado;
            this.produto = produto;
            this.quantidade = quantidade;
            this.valor = valor;
        }

        @Override
        public String toString() {
            return "Builder{"
                    + "codigoMercado=" + codigoMercado
                    + ", mercado=" + mercado
                    + ", produto=" + produto
                    + ", quantidade=" + quantidade
                    + ", valor=" + valor + '}';
        }
    }
}
