/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package интерфейс.польователя;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Админ
 */
@Entity
@Table(name = "vvod", catalog = "userdata", schema = "")
@NamedQueries({
    @NamedQuery(name = "Vvod.findAll", query = "SELECT v FROM Vvod v")
    , @NamedQuery(name = "Vvod.findByLogin", query = "SELECT v FROM Vvod v WHERE v.vvodPK.login = :login")
    , @NamedQuery(name = "Vvod.findByPassword", query = "SELECT v FROM Vvod v WHERE v.vvodPK.password = :password")})
public class Vvod implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VvodPK vvodPK;

    public Vvod() {
    }

    public Vvod(VvodPK vvodPK) {
        this.vvodPK = vvodPK;
    }

    public Vvod(String login, String password) {
        this.vvodPK = new VvodPK(login, password);
    }

    public VvodPK getVvodPK() {
        return vvodPK;
    }

    public void setVvodPK(VvodPK vvodPK) {
        this.vvodPK = vvodPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vvodPK != null ? vvodPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vvod)) {
            return false;
        }
        Vvod other = (Vvod) object;
        if ((this.vvodPK == null && other.vvodPK != null) || (this.vvodPK != null && !this.vvodPK.equals(other.vvodPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441.\u043f\u043e\u043b\u044c\u043e\u0432\u0430\u0442\u0435\u043b\u044f.Vvod[ vvodPK=" + vvodPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
