/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package интерфейс.польователя;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Админ
 */
@Embeddable
public class VvodPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public VvodPK() {
    }

    public VvodPK(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (login != null ? login.hashCode() : 0);
        hash += (password != null ? password.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VvodPK)) {
            return false;
        }
        VvodPK other = (VvodPK) object;
        if ((this.login == null && other.login != null) || (this.login != null && !this.login.equals(other.login))) {
            return false;
        }
        if ((this.password == null && other.password != null) || (this.password != null && !this.password.equals(other.password))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441.\u043f\u043e\u043b\u044c\u043e\u0432\u0430\u0442\u0435\u043b\u044f.VvodPK[ login=" + login + ", password=" + password + " ]";
    }
    
}
