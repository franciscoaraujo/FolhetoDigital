/*
 * This file is generated by jOOQ.
*/
package org.jooq.generated.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.generated.FolhetoDigitalDb;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.records.ProdutoRecord;
import org.jooq.impl.TableImpl;


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
public class Produto extends TableImpl<ProdutoRecord> {

    private static final long serialVersionUID = -871271278;

    /**
     * The reference instance of <code>folheto_digital_db.produto</code>
     */
    public static final Produto PRODUTO = new Produto();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ProdutoRecord> getRecordType() {
        return ProdutoRecord.class;
    }

    /**
     * The column <code>folheto_digital_db.produto.prod_codigo</code>.
     */
    public final TableField<ProdutoRecord, Integer> PROD_CODIGO = createField("prod_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.produto.prod_nome</code>.
     */
    public final TableField<ProdutoRecord, String> PROD_NOME = createField("prod_nome", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>folheto_digital_db.produto.prod_valor</code>.
     */
    public final TableField<ProdutoRecord, BigDecimal> PROD_VALOR = createField("prod_valor", org.jooq.impl.SQLDataType.DECIMAL.precision(10, 2), this, "");

    /**
     * The column <code>folheto_digital_db.produto.prod_foto</code>.
     */
    public final TableField<ProdutoRecord, String> PROD_FOTO = createField("prod_foto", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>folheto_digital_db.produto.prod_descicao</code>.
     */
    public final TableField<ProdutoRecord, String> PROD_DESCICAO = createField("prod_descicao", org.jooq.impl.SQLDataType.VARCHAR.length(200), this, "");

    /**
     * The column <code>folheto_digital_db.produto.categoria_cat_codigo</code>.
     */
    public final TableField<ProdutoRecord, Integer> CATEGORIA_CAT_CODIGO = createField("categoria_cat_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.produto.codigo_mercado</code>.
     */
    public final TableField<ProdutoRecord, Integer> CODIGO_MERCADO = createField("codigo_mercado", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>folheto_digital_db.produto</code> table reference
     */
    public Produto() {
        this("produto", null);
    }

    /**
     * Create an aliased <code>folheto_digital_db.produto</code> table reference
     */
    public Produto(String alias) {
        this(alias, PRODUTO);
    }

    private Produto(String alias, Table<ProdutoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Produto(String alias, Table<ProdutoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return FolhetoDigitalDb.FOLHETO_DIGITAL_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ProdutoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PRODUTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ProdutoRecord> getPrimaryKey() {
        return Keys.KEY_PRODUTO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ProdutoRecord>> getKeys() {
        return Arrays.<UniqueKey<ProdutoRecord>>asList(Keys.KEY_PRODUTO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<ProdutoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<ProdutoRecord, ?>>asList(Keys.FK_PRODUTO_CATEGORIA1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Produto as(String alias) {
        return new Produto(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Produto rename(String name) {
        return new Produto(name, null);
    }
}