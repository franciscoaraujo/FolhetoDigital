/*
 * This file is generated by jOOQ.
*/
package org.jooq.generated;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.generated.tables.Categoria;
import org.jooq.generated.tables.Cidade;
import org.jooq.generated.tables.Endereco;
import org.jooq.generated.tables.Estado;
import org.jooq.generated.tables.Login;
import org.jooq.generated.tables.Produto;
import org.jooq.generated.tables.ProdutoPromocao;
import org.jooq.generated.tables.Promocao;
import org.jooq.generated.tables.Supermercado;
import org.jooq.generated.tables.SupermercadoTemProduto;
import org.jooq.generated.tables.Token;
import org.jooq.impl.SchemaImpl;


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
public class FolhetoDigitalDb extends SchemaImpl {

    private static final long serialVersionUID = 1417568260;

    /**
     * The reference instance of <code>folheto_digital_db</code>
     */
    public static final FolhetoDigitalDb FOLHETO_DIGITAL_DB = new FolhetoDigitalDb();

    /**
     * The table <code>folheto_digital_db.categoria</code>.
     */
    public final Categoria CATEGORIA = org.jooq.generated.tables.Categoria.CATEGORIA;

    /**
     * The table <code>folheto_digital_db.cidade</code>.
     */
    public final Cidade CIDADE = org.jooq.generated.tables.Cidade.CIDADE;

    /**
     * The table <code>folheto_digital_db.endereco</code>.
     */
    public final Endereco ENDERECO = org.jooq.generated.tables.Endereco.ENDERECO;

    /**
     * The table <code>folheto_digital_db.estado</code>.
     */
    public final Estado ESTADO = org.jooq.generated.tables.Estado.ESTADO;

    /**
     * The table <code>folheto_digital_db.login</code>.
     */
    public final Login LOGIN = org.jooq.generated.tables.Login.LOGIN;

    /**
     * The table <code>folheto_digital_db.produto</code>.
     */
    public final Produto PRODUTO = org.jooq.generated.tables.Produto.PRODUTO;

    /**
     * The table <code>folheto_digital_db.produto_promocao</code>.
     */
    public final ProdutoPromocao PRODUTO_PROMOCAO = org.jooq.generated.tables.ProdutoPromocao.PRODUTO_PROMOCAO;

    /**
     * The table <code>folheto_digital_db.promocao</code>.
     */
    public final Promocao PROMOCAO = org.jooq.generated.tables.Promocao.PROMOCAO;

    /**
     * The table <code>folheto_digital_db.supermercado</code>.
     */
    public final Supermercado SUPERMERCADO = org.jooq.generated.tables.Supermercado.SUPERMERCADO;

    /**
     * The table <code>folheto_digital_db.supermercado_tem_produto</code>.
     */
    public final SupermercadoTemProduto SUPERMERCADO_TEM_PRODUTO = org.jooq.generated.tables.SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO;

    /**
     * The table <code>folheto_digital_db.token</code>.
     */
    public final Token TOKEN = org.jooq.generated.tables.Token.TOKEN;

    /**
     * No further instances allowed
     */
    private FolhetoDigitalDb() {
        super("folheto_digital_db", null);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        List result = new ArrayList();
        result.addAll(getTables0());
        return result;
    }

    private final List<Table<?>> getTables0() {
        return Arrays.<Table<?>>asList(
            Categoria.CATEGORIA,
            Cidade.CIDADE,
            Endereco.ENDERECO,
            Estado.ESTADO,
            Login.LOGIN,
            Produto.PRODUTO,
            ProdutoPromocao.PRODUTO_PROMOCAO,
            Promocao.PROMOCAO,
            Supermercado.SUPERMERCADO,
            SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO,
            Token.TOKEN);
    }
}
