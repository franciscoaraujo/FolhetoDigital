/*
 * This file is generated by jOOQ.
*/
package org.jooq.generated.tables;


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
import org.jooq.generated.tables.records.EnderecoRecord;
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
public class Endereco extends TableImpl<EnderecoRecord> {

    private static final long serialVersionUID = -1499101789;

    /**
     * The reference instance of <code>folheto_digital_db.endereco</code>
     */
    public static final Endereco ENDERECO = new Endereco();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EnderecoRecord> getRecordType() {
        return EnderecoRecord.class;
    }

    /**
     * The column <code>folheto_digital_db.endereco.end_codigo</code>.
     */
    public final TableField<EnderecoRecord, Integer> END_CODIGO = createField("end_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.endereco.end_logradouro</code>.
     */
    public final TableField<EnderecoRecord, String> END_LOGRADOURO = createField("end_logradouro", org.jooq.impl.SQLDataType.VARCHAR.length(40), this, "");

    /**
     * The column <code>folheto_digital_db.endereco.end_nome_rua</code>.
     */
    public final TableField<EnderecoRecord, String> END_NOME_RUA = createField("end_nome_rua", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>folheto_digital_db.endereco.end_numero</code>.
     */
    public final TableField<EnderecoRecord, String> END_NUMERO = createField("end_numero", org.jooq.impl.SQLDataType.VARCHAR.length(10), this, "");

    /**
     * The column <code>folheto_digital_db.endereco.cidade_cid_codigo</code>.
     */
    public final TableField<EnderecoRecord, Integer> CIDADE_CID_CODIGO = createField("cidade_cid_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.endereco.cidade_estado_est_codigo</code>.
     */
    public final TableField<EnderecoRecord, Integer> CIDADE_ESTADO_EST_CODIGO = createField("cidade_estado_est_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.endereco.supermercado_codigo</code>.
     */
    public final TableField<EnderecoRecord, Integer> SUPERMERCADO_CODIGO = createField("supermercado_codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>folheto_digital_db.endereco</code> table reference
     */
    public Endereco() {
        this("endereco", null);
    }

    /**
     * Create an aliased <code>folheto_digital_db.endereco</code> table reference
     */
    public Endereco(String alias) {
        this(alias, ENDERECO);
    }

    private Endereco(String alias, Table<EnderecoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Endereco(String alias, Table<EnderecoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<EnderecoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENDERECO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<EnderecoRecord> getPrimaryKey() {
        return Keys.KEY_ENDERECO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EnderecoRecord>> getKeys() {
        return Arrays.<UniqueKey<EnderecoRecord>>asList(Keys.KEY_ENDERECO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<EnderecoRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<EnderecoRecord, ?>>asList(Keys.FK_ENDERECO_CIDADE1, Keys.FK_ENDERECO_SUPERMERCADO1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Endereco as(String alias) {
        return new Endereco(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Endereco rename(String name) {
        return new Endereco(name, null);
    }
}