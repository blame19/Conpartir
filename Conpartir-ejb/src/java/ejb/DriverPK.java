/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Matteo
 */
@Embeddable
public class DriverPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "DRIVER_ID")
    private int driverId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CLIENT_ID")
    private int clientId;

    public DriverPK() {
    }

    public DriverPK(int driverId, int clientId) {
        this.driverId = driverId;
        this.clientId = clientId;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) driverId;
        hash += (int) clientId;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DriverPK)) {
            return false;
        }
        DriverPK other = (DriverPK) object;
        if (this.driverId != other.driverId) {
            return false;
        }
        if (this.clientId != other.clientId) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.DriverPK[ driverId=" + driverId + ", clientId=" + clientId + " ]";
    }
    
}
