/*
 * This file is generated by jOOQ.
*/
package org.jooq.generated.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.generated.FolhetoDigitalDb;
import org.jooq.generated.Keys;
import org.jooq.generated.tables.records.SupermercadoRecord;
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
public class Supermercado extends TableImpl<SupermercadoRecord> {

    private static final long serialVersionUID = -866508615;

    /**
     * The reference instance of <code>folheto_digital_db.supermercado</code>
     */
    public static final Supermercado SUPERMERCADO = new Supermercado();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SupermercadoRecord> getRecordType() {
        return SupermercadoRecord.class;
    }

    /**
     * The column <code>folheto_digital_db.supermercado.codigo</code>.
     */
    public final TableField<SupermercadoRecord, Integer> CODIGO = createField("codigo", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.supermercado.nome</code>.
     */
    public final TableField<SupermercadoRecord, String> NOME = createField("nome", org.jooq.impl.SQLDataType.VARCHAR.length(100), this, "");

    /**
     * The column <code>folheto_digital_db.supermercado.cnpj</code>.
     */
    public final TableField<SupermercadoRecord, String> CNPJ = createField("cnpj", org.jooq.impl.SQLDataType.VARCHAR.length(21), this, "");

    /**
     * Create a <code>folheto_digital_db.supermercado</code> table reference
     */
    public Supermercado() {
        this("supermercado", null);
    }

    /**
     * Create an aliased <code>folheto_digital_db.supermercado</code> table reference
     */
    public Supermercado(String alias) {
        this(alias, SUPERMERCADO);
    }

    private Supermercado(String alias, Table<SupermercadoRecord> aliased) {
        this(alias, aliased, null);
    }

    private Supermercado(String alias, Table<SupermercadoRecord> aliased, Field<?>[] parameters) {
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
    public Identity<SupermercadoRecord, Integer> getIdentity() {
        return Keys.IDENTITY_SUPERMERCADO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<SupermercadoRecord> getPrimaryKey() {
        return Keys.KEY_SUPERMERCADO_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<SupermercadoRecord>> getKeys() {
        return Arrays.<UniqueKey<SupermercadoRecord>>asList(Keys.KEY_SUPERMERCADO_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Supermercado as(String alias) {
        return new Supermercado(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Supermercado rename(String name) {
        return new Supermercado(name, null);
    }
}
