/*
 * This file is generated by jOOQ.
*/
package org.jooq.generated.tables.records;


import java.math.BigDecimal;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.generated.tables.Produto;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProdutoRecord extends UpdatableRecordImpl<ProdutoRecord> implements Record7<Integer, String, BigDecimal, String, String, Integer, Integer> {

    private static final long serialVersionUID = -1140476977;

    /**
     * Setter for <code>folheto_digital_db.produto.prod_codigo</code>.
     */
    public void setProdCodigo(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>folheto_digital_db.produto.prod_codigo</code>.
     */
    public Integer getProdCodigo() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>folheto_digital_db.produto.prod_nome</code>.
     */
    public void setProdNome(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>folheto_digital_db.produto.prod_nome</code>.
     */
    public String getProdNome() {
        return (String) get(1);
    }

    /**
     * Setter for <code>folheto_digital_db.produto.prod_valor</code>.
     */
    public void setProdValor(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>folheto_digital_db.produto.prod_valor</code>.
     */
    public BigDecimal getProdValor() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>folheto_digital_db.produto.prod_foto</code>.
     */
    public void setProdFoto(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>folheto_digital_db.produto.prod_foto</code>.
     */
    public String getProdFoto() {
        return (String) get(3);
    }

    /**
     * Setter for <code>folheto_digital_db.produto.prod_descicao</code>.
     */
    public void setProdDescicao(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>folheto_digital_db.produto.prod_descicao</code>.
     */
    public String getProdDescicao() {
        return (String) get(4);
    }

    /**
     * Setter for <code>folheto_digital_db.produto.categoria_cat_codigo</code>.
     */
    public void setCategoriaCatCodigo(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>folheto_digital_db.produto.categoria_cat_codigo</code>.
     */
    public Integer getCategoriaCatCodigo() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>folheto_digital_db.produto.codigo_mercado</code>.
     */
    public void setCodigoMercado(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>folheto_digital_db.produto.codigo_mercado</code>.
     */
    public Integer getCodigoMercado() {
        return (Integer) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, BigDecimal, String, String, Integer, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, BigDecimal, String, String, Integer, Integer> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Produto.PRODUTO.PROD_CODIGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Produto.PRODUTO.PROD_NOME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Produto.PRODUTO.PROD_VALOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Produto.PRODUTO.PROD_FOTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Produto.PRODUTO.PROD_DESCICAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Produto.PRODUTO.CATEGORIA_CAT_CODIGO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Produto.PRODUTO.CODIGO_MERCADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getProdCodigo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getProdNome();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getProdValor();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getProdFoto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getProdDescicao();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCategoriaCatCodigo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getCodigoMercado();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value1(Integer value) {
        setProdCodigo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value2(String value) {
        setProdNome(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value3(BigDecimal value) {
        setProdValor(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value4(String value) {
        setProdFoto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value5(String value) {
        setProdDescicao(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value6(Integer value) {
        setCategoriaCatCodigo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord value7(Integer value) {
        setCodigoMercado(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ProdutoRecord values(Integer value1, String value2, BigDecimal value3, String value4, String value5, Integer value6, Integer value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ProdutoRecord
     */
    public ProdutoRecord() {
        super(Produto.PRODUTO);
    }

    /**
     * Create a detached, initialised ProdutoRecord
     */
    public ProdutoRecord(Integer prodCodigo, String prodNome, BigDecimal prodValor, String prodFoto, String prodDescicao, Integer categoriaCatCodigo, Integer codigoMercado) {
        super(Produto.PRODUTO);

        set(0, prodCodigo);
        set(1, prodNome);
        set(2, prodValor);
        set(3, prodFoto);
        set(4, prodDescicao);
        set(5, categoriaCatCodigo);
        set(6, codigoMercado);
    }
}
