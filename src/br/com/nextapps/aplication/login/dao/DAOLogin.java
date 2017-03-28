package br.com.nextapps.aplication.login.dao;

import br.com.nextapps.aplication.login.data.DataLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;
import java.util.Random;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import static org.jooq.generated.tables.Login.LOGIN;
import static org.jooq.generated.tables.Token.TOKEN;
import org.jooq.impl.DSL;

/**
 * @author francisco(jamal)
 */
public class DAOLogin {

    private DSLContext create;

    public void connection() throws SQLException {
        String userName = "root";
        String passwd = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/folheto_digital_db";
        Connection conn = DriverManager.getConnection(url, userName, passwd);
        create = DSL.using(conn, SQLDialect.MYSQL);
    }

    public DataLogin loginUser(String userName, String passwd) {
        Result<Record> result = create.select()
                .from(LOGIN)
                .where(LOGIN.USERNAME.equal(userName))
                .and(LOGIN.PASSWD.equal(geradorMD5(passwd)))
                .fetch();
        DataLogin.Builder builderLogin = DataLogin.builder();
        result.forEach((record) -> {
            builderLogin.setUserName(record.get("username").toString())
                    .setPasswd(record.get("passwd").toString());
        });
        if (builderLogin.build() == null) {
            DataLogin dataLogin = new DataLogin();
            return dataLogin;
        }
        return builderLogin.build();
    }
    
    public int cadUser(String user, String passwd) {
        int execute = create.insertInto(LOGIN)
                .set(LOGIN.USERNAME, user)
                .set(LOGIN.PASSWD, geradorMD5(passwd))
                .execute();
        return execute;
    }

    private int getIdUsuario(String usuario, String passwd) {
        Result<Record> result = create.select()
                .from(LOGIN)
                .where(LOGIN.USERNAME.equal(usuario))
                .and(LOGIN.PASSWD.equal(geradorMD5(passwd)))
                .fetch();
        DataLogin.Builder builderLogin = DataLogin.builder();
        result.forEach((record) -> {
            builderLogin
                    .setUserName(record.get("username").toString())
                    .setPasswd(record.get("passwd").toString())
                    .setId(Integer.parseInt(record.get("id").toString()));
        });
        return builderLogin.build().getId();
    }

    public void cadastraToken(String keyToken, String usuario, String passwd) {
        create.insertInto(TOKEN)
                .set(TOKEN.ID_LOGIN, getIdUsuario(usuario, passwd))
                .set(TOKEN.TOKEN_, keyToken).execute();
    }

    public String geraToken() {
        Random gerador = new Random();
        StringBuilder strToken = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            strToken.append(gerador.nextInt(8));
        }
        return strToken.toString();
    }

    private String geradorMD5(String md5) {
        try {
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            byte[] array = md.digest(md5.getBytes());
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < array.length; ++i) {
                sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1, 3));
            }
            return sb.toString();
        } catch (java.security.NoSuchAlgorithmException e) {
        }
        return null;
    }

}
