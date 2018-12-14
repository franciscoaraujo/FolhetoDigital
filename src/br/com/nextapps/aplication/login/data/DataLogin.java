package br.com.nextapps.aplication.login.data;

import java.io.Serializable;

import br.com.nextapps.aplication.login.data.DataLogin;
import br.com.nextapps.aplication.login.data.DataToken;

/**
 * @author francisco(jamal)
 */
public class DataLogin implements Serializable {

    private final int id;
    private final String userName;
    private final String passwd;
    private final DataToken dataToken;
    
    public DataLogin() {
        this.id = -1;
        this.userName = null;
        this.passwd = null;
        this.dataToken = null;
    }

    public DataLogin(int id, String userName, String passwd, DataToken dataToken) {
        this.id = id;
        this.userName = userName;
        this.passwd = passwd;
        this.dataToken = dataToken;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final DataLogin other = (DataLogin) obj;
        return this.id == other.id;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPasswd() {
        return passwd;
    }

    public DataToken getDataToken() {
        return dataToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    static public class Builder {

        private int id;
        private String userName;
        private String passwd;
        DataToken dataToken;

        private Builder() {
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder setPasswd(String passwd) {
            this.passwd = passwd;
            return this;
        }

        public Builder setDataToken(DataToken dataToken) {
            this.dataToken = dataToken;
            return this;
        }

        public DataLogin build() {
            return new DataLogin(id, userName, passwd, dataToken);
        }

        @Override
        public String toString() {
            return "Builder{" + "id=" + id
                    + ", userName=" + userName
                    + ", passwd=" + passwd
                    + ", dataToken=" + dataToken + '}';
        }

    }
}
