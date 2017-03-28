package br.com.nextapps.aplication.login.data;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author francisco(jamal)
 */
public class DataToken implements Serializable {

    private final int id;
    private final String token;
    
    public DataToken(int id, String token) {
        this.id = id;
        this.token = token;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.token);
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
        final DataToken other = (DataToken) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.token, other.token);
    }

    public int getId() {
        return id;
    }

    public String getToken() {
        return token;
    }
    

}
