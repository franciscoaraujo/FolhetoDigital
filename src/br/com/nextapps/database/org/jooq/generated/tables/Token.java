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
import org.jooq.generated.tables.records.TokenRecord;
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
public class Token extends TableImpl<TokenRecord> {

    private static final long serialVersionUID = 701981301;

    /**
     * The reference instance of <code>folheto_digital_db.token</code>
     */
    public static final Token TOKEN = new Token();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TokenRecord> getRecordType() {
        return TokenRecord.class;
    }

    /**
     * The column <code>folheto_digital_db.token.id</code>.
     */
    public final TableField<TokenRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>folheto_digital_db.token.token</code>.
     */
    public final TableField<TokenRecord, String> TOKEN_ = createField("token", org.jooq.impl.SQLDataType.VARCHAR.length(8), this, "");

    /**
     * The column <code>folheto_digital_db.token.id_login</code>.
     */
    public final TableField<TokenRecord, Integer> ID_LOGIN = createField("id_login", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>folheto_digital_db.token</code> table reference
     */
    public Token() {
        this("token", null);
    }

    /**
     * Create an aliased <code>folheto_digital_db.token</code> table reference
     */
    public Token(String alias) {
        this(alias, TOKEN);
    }

    private Token(String alias, Table<TokenRecord> aliased) {
        this(alias, aliased, null);
    }

    private Token(String alias, Table<TokenRecord> aliased, Field<?>[] parameters) {
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
    public Identity<TokenRecord, Integer> getIdentity() {
        return Keys.IDENTITY_TOKEN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TokenRecord> getPrimaryKey() {
        return Keys.KEY_TOKEN_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TokenRecord>> getKeys() {
        return Arrays.<UniqueKey<TokenRecord>>asList(Keys.KEY_TOKEN_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<TokenRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<TokenRecord, ?>>asList(Keys.ID_LOGIN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Token as(String alias) {
        return new Token(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Token rename(String name) {
        return new Token(name, null);
    }
}