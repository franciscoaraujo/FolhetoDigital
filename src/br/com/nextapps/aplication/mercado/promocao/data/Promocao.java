package br.com.nextapps.aplication.mercado.promocao.data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Promocao   implements Serializable{

    private final int codigo;
    private final int codigoProduto;
    private final float valor;
    private final Date dataInicio;
    private final Date dataFim;
    private final boolean ativo;
    private final List<ProdutoPromocao> promocoes;

    public Promocao() {
        this.codigo = 0;
        this.codigoProduto = 0;
        this.valor = 0;
        this.dataInicio = null;
        this.dataFim = null;
        this.ativo = false;
        this.promocoes = null;
    }

    public Promocao(int codigo,
            int codigoProduto,
            float valor,
            Date dataInicio,
            Date dataFim,
            boolean ativo,
            List<ProdutoPromocao> promocoes) {

        this.codigo = codigo;
        this.codigoProduto = codigoProduto;
        this.valor = valor;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.ativo = ativo;
        this.promocoes = promocoes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.codigo;
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
        final Promocao other = (Promocao) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getCodigoProduto() {
        return codigoProduto;
    }

    public float getValor() {
        return valor;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public List<ProdutoPromocao> getPromocoes() {
        return promocoes;
    }

    @Override
    public String toString() {
        return "Promocao{"
                + "codigo=" + codigo
                + ", codigoProduto=" + codigoProduto
                + ", valor=" + valor
                + ", dataInicio=" + dataInicio
                + ", dataFim=" + dataFim
                + ", ativo=" + ativo
                + ", promocoes=" + promocoes + '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int codigo;
        private int codigoProduto;
        private float valor;
        private Date dataInicio;
        private Date dataFim;
        private boolean ativo;
        private List<ProdutoPromocao> promocoes;

        private Builder() {
        }

        public Builder setCodigo(int codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder setCodigoProduto(int codigoProduto) {
            this.codigoProduto = codigoProduto;
            return this;
        }

        public Builder setValor(float valor) {
            this.valor = valor;
            return this;
        }

        public Builder setDataInicio(Date dataInicio) {
            this.dataInicio = dataInicio;
            return this;
        }

        public Builder setDataFim(Date dataFim) {
            this.dataFim = dataFim;
            return this;
        }

        public Builder setAtivo(boolean ativo) {
            this.ativo = ativo;
            return this;
        }

        public Builder setPromocoes(List<ProdutoPromocao> promocoes) {
            this.promocoes = promocoes;
            return this;
        }

        public Builder(int codigo,
                int codigoProduto,
                float valor,
                Date dataInicio,
                Date dataFim,
                boolean ativo,
                List<ProdutoPromocao> promocoes) {

            this.codigo = codigo;
            this.codigoProduto = codigoProduto;
            this.valor = valor;
            this.dataInicio = dataInicio;
            this.dataFim = dataFim;
            this.ativo = ativo;
            this.promocoes = promocoes;
        }

        @Override
        public String toString() {
            return "Builder{"
                    + "codigo=" + codigo
                    + ", codigoProduto=" + codigoProduto
                    + ", valor=" + valor
                    + ", dataInicio=" + dataInicio
                    + ", dataFim=" + dataFim
                    + ", ativo=" + ativo
                    + ", promocoes=" + promocoes + '}';
        }

    }
}
