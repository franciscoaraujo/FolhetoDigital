package br.com.nextapps.aplication.login;

import br.com.nextapps.aplication.login.dao.DAOLogin;
import br.com.nextapps.aplication.login.data.DataLogin;

import java.sql.SQLException;

/**
 * @author francisco(jamal)
 */
public class ManagerLogin {

    private final DataLogin dataLogin;

    public ManagerLogin(DataLogin dataLogin) {
        this.dataLogin = dataLogin;
    }

    public boolean doLogin() throws SQLException {
        DAOLogin dAOLogin = new DAOLogin();
        dAOLogin.connection();
        DataLogin loginUser = dAOLogin.loginUser(dataLogin.getUserName(), dataLogin.getPasswd());
        return loginUser.getUserName() != null && loginUser.getUserName() != null;
    }
    
}
