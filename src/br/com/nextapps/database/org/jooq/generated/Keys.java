/*
 * This file is generated by jOOQ.
*/
package org.jooq.generated;


import javax.annotation.Generated;

import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.UniqueKey;
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
import org.jooq.generated.tables.records.CategoriaRecord;
import org.jooq.generated.tables.records.CidadeRecord;
import org.jooq.generated.tables.records.EnderecoRecord;
import org.jooq.generated.tables.records.EstadoRecord;
import org.jooq.generated.tables.records.LoginRecord;
import org.jooq.generated.tables.records.ProdutoPromocaoRecord;
import org.jooq.generated.tables.records.ProdutoRecord;
import org.jooq.generated.tables.records.PromocaoRecord;
import org.jooq.generated.tables.records.SupermercadoRecord;
import org.jooq.generated.tables.records.SupermercadoTemProdutoRecord;
import org.jooq.generated.tables.records.TokenRecord;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>folheto_digital_db</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<CategoriaRecord, Integer> IDENTITY_CATEGORIA = Identities0.IDENTITY_CATEGORIA;
    public static final Identity<CidadeRecord, Integer> IDENTITY_CIDADE = Identities0.IDENTITY_CIDADE;
    public static final Identity<EnderecoRecord, Integer> IDENTITY_ENDERECO = Identities0.IDENTITY_ENDERECO;
    public static final Identity<EstadoRecord, Integer> IDENTITY_ESTADO = Identities0.IDENTITY_ESTADO;
    public static final Identity<LoginRecord, Integer> IDENTITY_LOGIN = Identities0.IDENTITY_LOGIN;
    public static final Identity<ProdutoRecord, Integer> IDENTITY_PRODUTO = Identities0.IDENTITY_PRODUTO;
    public static final Identity<ProdutoPromocaoRecord, Integer> IDENTITY_PRODUTO_PROMOCAO = Identities0.IDENTITY_PRODUTO_PROMOCAO;
    public static final Identity<PromocaoRecord, Integer> IDENTITY_PROMOCAO = Identities0.IDENTITY_PROMOCAO;
    public static final Identity<SupermercadoRecord, Integer> IDENTITY_SUPERMERCADO = Identities0.IDENTITY_SUPERMERCADO;
    public static final Identity<TokenRecord, Integer> IDENTITY_TOKEN = Identities0.IDENTITY_TOKEN;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<CategoriaRecord> KEY_CATEGORIA_PRIMARY = UniqueKeys0.KEY_CATEGORIA_PRIMARY;
    public static final UniqueKey<CidadeRecord> KEY_CIDADE_PRIMARY = UniqueKeys0.KEY_CIDADE_PRIMARY;
    public static final UniqueKey<EnderecoRecord> KEY_ENDERECO_PRIMARY = UniqueKeys0.KEY_ENDERECO_PRIMARY;
    public static final UniqueKey<EstadoRecord> KEY_ESTADO_PRIMARY = UniqueKeys0.KEY_ESTADO_PRIMARY;
    public static final UniqueKey<LoginRecord> KEY_LOGIN_PRIMARY = UniqueKeys0.KEY_LOGIN_PRIMARY;
    public static final UniqueKey<ProdutoRecord> KEY_PRODUTO_PRIMARY = UniqueKeys0.KEY_PRODUTO_PRIMARY;
    public static final UniqueKey<ProdutoPromocaoRecord> KEY_PRODUTO_PROMOCAO_PRIMARY = UniqueKeys0.KEY_PRODUTO_PROMOCAO_PRIMARY;
    public static final UniqueKey<PromocaoRecord> KEY_PROMOCAO_PRIMARY = UniqueKeys0.KEY_PROMOCAO_PRIMARY;
    public static final UniqueKey<SupermercadoRecord> KEY_SUPERMERCADO_PRIMARY = UniqueKeys0.KEY_SUPERMERCADO_PRIMARY;
    public static final UniqueKey<SupermercadoTemProdutoRecord> KEY_SUPERMERCADO_TEM_PRODUTO_PRIMARY = UniqueKeys0.KEY_SUPERMERCADO_TEM_PRODUTO_PRIMARY;
    public static final UniqueKey<TokenRecord> KEY_TOKEN_PRIMARY = UniqueKeys0.KEY_TOKEN_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------

    public static final ForeignKey<CidadeRecord, EstadoRecord> FK_CIDADE_ESTADO1 = ForeignKeys0.FK_CIDADE_ESTADO1;
    public static final ForeignKey<EnderecoRecord, CidadeRecord> FK_ENDERECO_CIDADE1 = ForeignKeys0.FK_ENDERECO_CIDADE1;
    public static final ForeignKey<EnderecoRecord, SupermercadoRecord> FK_ENDERECO_SUPERMERCADO1 = ForeignKeys0.FK_ENDERECO_SUPERMERCADO1;
    public static final ForeignKey<ProdutoRecord, CategoriaRecord> FK_PRODUTO_CATEGORIA1 = ForeignKeys0.FK_PRODUTO_CATEGORIA1;
    public static final ForeignKey<ProdutoPromocaoRecord, ProdutoRecord> FK_PRODUTO_PROMOCAO_PRODUTO1 = ForeignKeys0.FK_PRODUTO_PROMOCAO_PRODUTO1;
    public static final ForeignKey<ProdutoPromocaoRecord, PromocaoRecord> FK_PRODUTO_PROMOCAO_PROMOCAO1 = ForeignKeys0.FK_PRODUTO_PROMOCAO_PROMOCAO1;
    public static final ForeignKey<PromocaoRecord, SupermercadoRecord> FK_PROMOCAO_SUPERMERCADO1 = ForeignKeys0.FK_PROMOCAO_SUPERMERCADO1;
    public static final ForeignKey<SupermercadoTemProdutoRecord, ProdutoRecord> FK_PRODUTO_HAS_SUPERMERCADO_PRODUTO1 = ForeignKeys0.FK_PRODUTO_HAS_SUPERMERCADO_PRODUTO1;
    public static final ForeignKey<SupermercadoTemProdutoRecord, SupermercadoRecord> FK_PRODUTO_HAS_SUPERMERCADO_SUPERMERCADO1 = ForeignKeys0.FK_PRODUTO_HAS_SUPERMERCADO_SUPERMERCADO1;
    public static final ForeignKey<TokenRecord, LoginRecord> ID_LOGIN = ForeignKeys0.ID_LOGIN;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<CategoriaRecord, Integer> IDENTITY_CATEGORIA = createIdentity(Categoria.CATEGORIA, Categoria.CATEGORIA.CAT_CODIGO);
        public static Identity<CidadeRecord, Integer> IDENTITY_CIDADE = createIdentity(Cidade.CIDADE, Cidade.CIDADE.CID_CODIGO);
        public static Identity<EnderecoRecord, Integer> IDENTITY_ENDERECO = createIdentity(Endereco.ENDERECO, Endereco.ENDERECO.END_CODIGO);
        public static Identity<EstadoRecord, Integer> IDENTITY_ESTADO = createIdentity(Estado.ESTADO, Estado.ESTADO.EST_CODIGO);
        public static Identity<LoginRecord, Integer> IDENTITY_LOGIN = createIdentity(Login.LOGIN, Login.LOGIN.ID);
        public static Identity<ProdutoRecord, Integer> IDENTITY_PRODUTO = createIdentity(Produto.PRODUTO, Produto.PRODUTO.PROD_CODIGO);
        public static Identity<ProdutoPromocaoRecord, Integer> IDENTITY_PRODUTO_PROMOCAO = createIdentity(ProdutoPromocao.PRODUTO_PROMOCAO, ProdutoPromocao.PRODUTO_PROMOCAO.PPROMO_CODIGO);
        public static Identity<PromocaoRecord, Integer> IDENTITY_PROMOCAO = createIdentity(Promocao.PROMOCAO, Promocao.PROMOCAO.PROM_CODIGO);
        public static Identity<SupermercadoRecord, Integer> IDENTITY_SUPERMERCADO = createIdentity(Supermercado.SUPERMERCADO, Supermercado.SUPERMERCADO.CODIGO);
        public static Identity<TokenRecord, Integer> IDENTITY_TOKEN = createIdentity(Token.TOKEN, Token.TOKEN.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<CategoriaRecord> KEY_CATEGORIA_PRIMARY = createUniqueKey(Categoria.CATEGORIA, "KEY_categoria_PRIMARY", Categoria.CATEGORIA.CAT_CODIGO);
        public static final UniqueKey<CidadeRecord> KEY_CIDADE_PRIMARY = createUniqueKey(Cidade.CIDADE, "KEY_cidade_PRIMARY", Cidade.CIDADE.CID_CODIGO, Cidade.CIDADE.ESTADO_EST_CODIGO);
        public static final UniqueKey<EnderecoRecord> KEY_ENDERECO_PRIMARY = createUniqueKey(Endereco.ENDERECO, "KEY_endereco_PRIMARY", Endereco.ENDERECO.END_CODIGO, Endereco.ENDERECO.CIDADE_CID_CODIGO, Endereco.ENDERECO.CIDADE_ESTADO_EST_CODIGO, Endereco.ENDERECO.SUPERMERCADO_CODIGO);
        public static final UniqueKey<EstadoRecord> KEY_ESTADO_PRIMARY = createUniqueKey(Estado.ESTADO, "KEY_estado_PRIMARY", Estado.ESTADO.EST_CODIGO);
        public static final UniqueKey<LoginRecord> KEY_LOGIN_PRIMARY = createUniqueKey(Login.LOGIN, "KEY_login_PRIMARY", Login.LOGIN.ID);
        public static final UniqueKey<ProdutoRecord> KEY_PRODUTO_PRIMARY = createUniqueKey(Produto.PRODUTO, "KEY_produto_PRIMARY", Produto.PRODUTO.PROD_CODIGO, Produto.PRODUTO.CATEGORIA_CAT_CODIGO);
        public static final UniqueKey<ProdutoPromocaoRecord> KEY_PRODUTO_PROMOCAO_PRIMARY = createUniqueKey(ProdutoPromocao.PRODUTO_PROMOCAO, "KEY_produto_promocao_PRIMARY", ProdutoPromocao.PRODUTO_PROMOCAO.PPROMO_CODIGO, ProdutoPromocao.PRODUTO_PROMOCAO.PRODUTO_PROD_CODIGO, ProdutoPromocao.PRODUTO_PROMOCAO.PRODUTO_CATEGORIA_CAT_CODIGO, ProdutoPromocao.PRODUTO_PROMOCAO.PROMOCAO_PROM_CODIGO);
        public static final UniqueKey<PromocaoRecord> KEY_PROMOCAO_PRIMARY = createUniqueKey(Promocao.PROMOCAO, "KEY_promocao_PRIMARY", Promocao.PROMOCAO.PROM_CODIGO, Promocao.PROMOCAO.SUPERMERCADO_CODIGO);
        public static final UniqueKey<SupermercadoRecord> KEY_SUPERMERCADO_PRIMARY = createUniqueKey(Supermercado.SUPERMERCADO, "KEY_supermercado_PRIMARY", Supermercado.SUPERMERCADO.CODIGO);
        public static final UniqueKey<SupermercadoTemProdutoRecord> KEY_SUPERMERCADO_TEM_PRODUTO_PRIMARY = createUniqueKey(SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO, "KEY_supermercado_tem_produto_PRIMARY", SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO.PRODUTO_PROD_CODIGO, SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO.SUPERMERCADO_CODIGO);
        public static final UniqueKey<TokenRecord> KEY_TOKEN_PRIMARY = createUniqueKey(Token.TOKEN, "KEY_token_PRIMARY", Token.TOKEN.ID);
    }

    private static class ForeignKeys0 extends AbstractKeys {
        public static final ForeignKey<CidadeRecord, EstadoRecord> FK_CIDADE_ESTADO1 = createForeignKey(org.jooq.generated.Keys.KEY_ESTADO_PRIMARY, Cidade.CIDADE, "fk_cidade_estado1", Cidade.CIDADE.ESTADO_EST_CODIGO);
        public static final ForeignKey<EnderecoRecord, CidadeRecord> FK_ENDERECO_CIDADE1 = createForeignKey(org.jooq.generated.Keys.KEY_CIDADE_PRIMARY, Endereco.ENDERECO, "fk_endereco_cidade1", Endereco.ENDERECO.CIDADE_CID_CODIGO, Endereco.ENDERECO.CIDADE_ESTADO_EST_CODIGO);
        public static final ForeignKey<EnderecoRecord, SupermercadoRecord> FK_ENDERECO_SUPERMERCADO1 = createForeignKey(org.jooq.generated.Keys.KEY_SUPERMERCADO_PRIMARY, Endereco.ENDERECO, "fk_endereco_supermercado1", Endereco.ENDERECO.SUPERMERCADO_CODIGO);
        public static final ForeignKey<ProdutoRecord, CategoriaRecord> FK_PRODUTO_CATEGORIA1 = createForeignKey(org.jooq.generated.Keys.KEY_CATEGORIA_PRIMARY, Produto.PRODUTO, "fk_produto_categoria1", Produto.PRODUTO.CATEGORIA_CAT_CODIGO);
        public static final ForeignKey<ProdutoPromocaoRecord, ProdutoRecord> FK_PRODUTO_PROMOCAO_PRODUTO1 = createForeignKey(org.jooq.generated.Keys.KEY_PRODUTO_PRIMARY, ProdutoPromocao.PRODUTO_PROMOCAO, "fk_produto_promocao_produto1", ProdutoPromocao.PRODUTO_PROMOCAO.PRODUTO_PROD_CODIGO, ProdutoPromocao.PRODUTO_PROMOCAO.PRODUTO_CATEGORIA_CAT_CODIGO);
        public static final ForeignKey<ProdutoPromocaoRecord, PromocaoRecord> FK_PRODUTO_PROMOCAO_PROMOCAO1 = createForeignKey(org.jooq.generated.Keys.KEY_PROMOCAO_PRIMARY, ProdutoPromocao.PRODUTO_PROMOCAO, "fk_produto_promocao_promocao1", ProdutoPromocao.PRODUTO_PROMOCAO.PROMOCAO_PROM_CODIGO);
        public static final ForeignKey<PromocaoRecord, SupermercadoRecord> FK_PROMOCAO_SUPERMERCADO1 = createForeignKey(org.jooq.generated.Keys.KEY_SUPERMERCADO_PRIMARY, Promocao.PROMOCAO, "fk_promocao_supermercado1", Promocao.PROMOCAO.SUPERMERCADO_CODIGO);
        public static final ForeignKey<SupermercadoTemProdutoRecord, ProdutoRecord> FK_PRODUTO_HAS_SUPERMERCADO_PRODUTO1 = createForeignKey(org.jooq.generated.Keys.KEY_PRODUTO_PRIMARY, SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO, "fk_produto_has_supermercado_produto1", SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO.PRODUTO_PROD_CODIGO);
        public static final ForeignKey<SupermercadoTemProdutoRecord, SupermercadoRecord> FK_PRODUTO_HAS_SUPERMERCADO_SUPERMERCADO1 = createForeignKey(org.jooq.generated.Keys.KEY_SUPERMERCADO_PRIMARY, SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO, "fk_produto_has_supermercado_supermercado1", SupermercadoTemProduto.SUPERMERCADO_TEM_PRODUTO.SUPERMERCADO_CODIGO);
        public static final ForeignKey<TokenRecord, LoginRecord> ID_LOGIN = createForeignKey(org.jooq.generated.Keys.KEY_LOGIN_PRIMARY, Token.TOKEN, "id_login", Token.TOKEN.ID_LOGIN);
    }
}