/*
 * This file is generated by jOOQ.
*/
package org.jooq.generated.tables;


import java.sql.Timestamp;
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
import org.jooq.generated.tables.records.PromocaoRecord;
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
public class Promocao extends TableImpl<PromocaoRecord> {

    private static final long serialVersionUID = -167985573;

    /**
     * The reference instance of <code>folheto_digital_db.promocao</code>
     */
    public static final Promocao PROMOCAO = new Promocao();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PromocaoRecord> getRecordType() {
        return PromocaoRecord.class;
    }

    /**
     * The column <code>folheto_digital_db.promocao.prom_codigo</code>.
     */
    public final TableField<PromocaoRecord, Integer> PROM_CODIGO = createField("prom_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.promocao.prom_valor</code>.
     */
    public final TableField<PromocaoRecord, String> PROM_VALOR = createField("prom_valor", org.jooq.impl.SQLDataType.VARCHAR.length(45), this, "");

    /**
     * The column <code>folheto_digital_db.promocao.prom_data_inicio</code>.
     */
    public final TableField<PromocaoRecord, Timestamp> PROM_DATA_INICIO = createField("prom_data_inicio", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>folheto_digital_db.promocao.prom_data_fim</code>.
     */
    public final TableField<PromocaoRecord, Timestamp> PROM_DATA_FIM = createField("prom_data_fim", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>folheto_digital_db.promocao.prom_ativo</code>.
     */
    public final TableField<PromocaoRecord, Integer> PROM_ATIVO = createField("prom_ativo", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>folheto_digital_db.promocao.supermercado_codigo</code>.
     */
    public final TableField<PromocaoRecord, Integer> SUPERMERCADO_CODIGO = createField("supermercado_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.promocao.codigo_mercado</code>.
     */
    public final TableField<PromocaoRecord, Integer> CODIGO_MERCADO = createField("codigo_mercado", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>folheto_digital_db.promocao</code> table reference
     */
    public Promocao() {
        this("promocao", null);
    }

    /**
     * Create an aliased <code>folheto_digital_db.promocao</code> table reference
     */
    public Promocao(String alias) {
        this(alias, PROMOCAO);
    }

    private Promocao(String alias, Table<PromocaoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Promocao(String alias, Table<PromocaoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<PromocaoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_PROMOCAO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<PromocaoRecord> getPrimaryKey() {
        return Keys.KEY_PROMOCAO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<PromocaoRecord>> getKeys() {
        return Arrays.<UniqueKey<PromocaoRecord>>asList(Keys.KEY_PROMOCAO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<PromocaoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<PromocaoRecord, ?>>asList(Keys.FK_PROMOCAO_SUPERMERCADO1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Promocao as(String alias) {
        return new Promocao(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Promocao rename(String name) {
        return new Promocao(name, null);
    }
}
