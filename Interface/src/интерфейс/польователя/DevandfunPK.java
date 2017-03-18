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
public class DevandfunPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ip")
    private String ip;
    @Basic(optional = false)
    @Column(name = "funct")
    private String funct;

    public DevandfunPK() {
    }

    public DevandfunPK(String ip, String funct) {
        this.ip = ip;
        this.funct = funct;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getFunct() {
        return funct;
    }

    public void setFunct(String funct) {
        this.funct = funct;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ip != null ? ip.hashCode() : 0);
        hash += (funct != null ? funct.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DevandfunPK)) {
            return false;
        }
        DevandfunPK other = (DevandfunPK) object;
        if ((this.ip == null && other.ip != null) || (this.ip != null && !this.ip.equals(other.ip))) {
            return false;
        }
        if ((this.funct == null && other.funct != null) || (this.funct != null && !this.funct.equals(other.funct))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u0438\u043d\u0442\u0435\u0440\u0444\u0435\u0439\u0441.\u043f\u043e\u043b\u044c\u043e\u0432\u0430\u0442\u0435\u043b\u044f.DevandfunPK[ ip=" + ip + ", funct=" + funct + " ]";
    }
    
}
