//package br.com.nextapps.aplication.login.dao;
//
//import br.com.nextapps.aplication.login.data.DataLogin;
//import java.sql.SQLException;
//
///**
// *
// * @author francisco(jamal)
// */
//public class AppTest {
//
//    public static void main(String[] args) throws SQLException {
//
//        DAOLogin dAOLogin = new DAOLogin();
//        String usuario = "francisco@grupocriar";
//        String senha = "123456";
//
//        //cadastroUsuario(dAOLogin, usuario, senha);
//        fazLogin(dAOLogin, usuario, senha);
//
//    }
//
//    public static void fazLogin(DAOLogin dAOLogin,
//            String usuario,
//            String senha) throws SQLException {
//
//    }
//
//    private static boolean verificaUsuario(DAOLogin login, String usuario, String senha)
//            throws SQLException {
//        login.connection();
//        DataLogin user = login.loginUser(usuario, senha);
//        return user.getPasswd() != null && user.getUserName() != null;
//    }
//
//    public static void cadastroUsuario(DAOLogin dAOLogin, String nomeUsuario, String senha) throws SQLException {
//        dAOLogin.connection();
//        dAOLogin.cadUser(nomeUsuario, senha);
//    }
//
//}
