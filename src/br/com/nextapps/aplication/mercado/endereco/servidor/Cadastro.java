package br.com.nextapps.aplication.mercado.endereco.servidor;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.StaticHandler;

public class Cadastro extends AbstractVerticle {

    private static final String CADASTRO_MERCADO = "/cadastro.mercado";

    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new Cadastro());
    }

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);

        router.route().handler(BodyHandler.create());
        router.route("/*").handler(StaticHandler.create().setCachingEnabled(false));
        router.post(CADASTRO_MERCADO).handler(routerContext -> {
            try {
                // aqui vou usar o routerContext para manipular as requisicoes que vem da web
            } catch (Exception e) {
                e.printStackTrace();
                
                routerContext.response().setStatusCode(400).end();
            }
        });
        init(vertx.createHttpServer(), router);
        
    }

    private void init(HttpServer server, Router router) {
        System.out.println("INICIALIZANDO O SERVIDOR DE CADASTRO DE SUPERMERCADO...");
        //Criando o servidor
        server.requestHandler(router::accept).listen(8085, asyncResult -> {
            if (asyncResult.succeeded()) {
                System.out.println("SUCESSO");
            } else {
                System.out.println("FALHA");
            }
        });
    }

}
