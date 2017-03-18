/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package интерфейс.польователя;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Column;
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
@Table(name = "devandfun", catalog = "userdata", schema = "")
@NamedQueries({
    @NamedQuery(name = "Devandfun.findAll", query = "SELECT d FROM Devandfun d")
    , @NamedQuery(name = "Devandfun.findByIp", query = "SELECT d FROM Devandfun d WHERE d.devandfunPK.ip = :ip")
    , @NamedQuery(name = "Devandfun.findByFunct", query = "SELECT d FROM Devandfun d WHERE d.devandfunPK.funct = :funct")
    , @NamedQuery(name = "Devandfun.findByDevname", query = "SELECT d FROM Devandfun d WHERE d.devname = :devname")})
public class Devandfun implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DevandfunPK devandfunPK;
    @Column(name = "devname")
    private String devname;

    public Devandfun() {
    }

    public Devandfun(DevandfunPK devandfunPK) {
        this.devandfunPK = devandfunPK;
    }

    public Devandfun(String ip, String funct) {
        this.devandfunPK = new DevandfunPK(ip, funct);
    }

    public DevandfunPK getDevandfunPK() {
        return devandfunPK;
    }

    public void setDevandfunPK(DevandfunPK devandfunPK) {
        this.devandfunPK = devandfunPK;
    }

    public String getDevname() {
        return devname;
    }

    public void setDevname(String devname) {
        String oldDevname = this.devname;
        this.devname = devname;
        changeSupport.firePropertyChange("devname", oldDevname, devname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (devandfunPK != null ? devandfunPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Devandfun)) {
            return false;
        }
        Devandfun other = (Devandfun) object;
        if ((this.devandfunPK == null && other.devandfunPK != null) || (this.devandfunPK != null && !this.devandfunPK.equals(other.devandfunPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441.\u043f\u043e\u043b\u044c\u043e\u0432\u0430\u0442\u0435\u043b\u044f.Devandfun[ devandfunPK=" + devandfunPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
