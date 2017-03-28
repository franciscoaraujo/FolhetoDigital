package br.com.nextapps.aplication.mercado.promocao.data;

import br.com.nextapps.aplication.mercado.produto.data.Categoria;
import br.com.nextapps.aplication.mercado.produto.data.Produto;
import java.io.Serializable;

public class ProdutoPromocao  implements Serializable {

    private final int codigo;
    private final int codigoMercado;
    private final float valor;
    private final Produto produto;
    private final Categoria categoria;
    private final Promocao promocao;

    public ProdutoPromocao() {
        this.codigo = 0;
        this.codigoMercado = 0;
        this.valor = 0;
        this.produto = null;
        this.categoria = null;
        this.promocao = null;
    }

    public ProdutoPromocao(int codigo,
            int codigoMercado,
            float valor,
            Produto produto,
            Categoria categoria,
            Promocao promocao) {

        this.codigo = codigo;
        this.codigoMercado = codigoMercado;
        this.valor = valor;
        this.produto = produto;
        this.categoria = categoria;
        this.promocao = promocao;
    }

    public Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigo;
        private int codigoMercado;
        private float valor;
        private Produto produto;
        private Categoria categoria;
        private Promocao promocao;

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

        public Builder setValor(float valor) {
            this.valor = valor;
            return this;
        }

        public Builder setProduto(Produto produto) {
            this.produto = produto;
            return this;
        }

        public Builder setCategoria(Categoria categoria) {
            this.categoria = categoria;
            return this;
        }

        public Builder setPromocao(Promocao promocao) {
            this.promocao = promocao;
            return this;
        }

        public ProdutoPromocao build() {
            return new ProdutoPromocao(codigo, codigoMercado, valor, produto, categoria, promocao);
        }

        public Builder(int codigo,
                int codigoMercado,
                float valor,
                Produto produto,
                Categoria categoria,
                Promocao promocao) {

            this.codigo = codigo;
            this.codigoMercado = codigoMercado;
            this.valor = valor;
            this.produto = produto;
            this.categoria = categoria;
            this.promocao = promocao;
        }

        @Override
        public String toString() {
            return "Builder{"
                    + "codigo=" + codigo
                    + ", codigoMercado=" + codigoMercado
                    + ", valor=" + valor
                    + ", produto=" + produto
                    + ", categoria=" + categoria
                    + ", promocao=" + promocao + '}';
        }

    }

}
