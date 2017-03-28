package br.com.nextapps.aplication.login;

import br.com.nextapps.aplication.login.data.DataLogin;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.StaticHandler;
import java.sql.SQLException;

/**
 *
 * @author francisco(jamal)
 */
public class Login extends AbstractVerticle {

    private static final String ROUTER_LOGIN_USER = "/login";
    Router router;

    public static void main(String[] args) {
        System.setProperty("vertx.disableFileCaching", "true");
        Vertx microServiceVtx = Vertx.vertx();
        microServiceVtx.deployVerticle(new Login());
    }

    @Override
    public void start() {

        router = Router.router(vertx);
        router.route().handler(BodyHandler.create());
        router.route("/*").handler(StaticHandler.create().setCachingEnabled(false));
        router.post(ROUTER_LOGIN_USER).handler(routeCtx -> {
            try {
                System.out.println(routeCtx.request().params());
                DataLogin buildLogin = DataLogin.builder()
                        .setUserName(routeCtx.request().getParam("username"))
                        .setPasswd(routeCtx.request().getParam("passwd"))
                        .build();
                ManagerLogin managerLogin = new ManagerLogin(buildLogin);

                if (managerLogin.doLogin()) {
                    System.out.println("Usuario OK");
                    // routeCtx.response().setStatusCode(301).putHeader("Location", "http://www.google.com").end();
                } else {
                    System.out.println("Usuario ou senha errado");
                    //routeCtx.response().setStatusCode(303).putHeader("Location", "http://www.google.com").end();
                }
            } catch (SQLException e) {
                routeCtx.response().setStatusCode(400).end();
            }
        });
        init(vertx.createHttpServer(), router);
    }

    private void init(HttpServer server, Router router) {
        System.out.println("INICIALIZANDO O SERVIDOR DE LOGIN...");
        //
        server.requestHandler(router::accept).listen(80, asyncResult -> {
            if (asyncResult.succeeded()) {
                System.out.println("SUCESSO");
            } else {
                System.out.println("FALHA");
            }
        });
    }
}
