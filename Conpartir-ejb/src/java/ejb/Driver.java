/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Matteo
 */
@Entity
@Table(name = "DRIVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d"),
    @NamedQuery(name = "Driver.findByDriverId", query = "SELECT d FROM Driver d WHERE d.driverPK.driverId = :driverId"),
    @NamedQuery(name = "Driver.findByClientId", query = "SELECT d FROM Driver d WHERE d.driverPK.clientId = :clientId"),
    @NamedQuery(name = "Driver.findByCarName", query = "SELECT d FROM Driver d WHERE d.carName = :carName"),
    @NamedQuery(name = "Driver.findByCarYear", query = "SELECT d FROM Driver d WHERE d.carYear = :carYear")})
public class Driver implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DriverPK driverPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CAR_NAME")
    private String carName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CAR_YEAR")
    private int carYear;
    @JoinColumn(name = "CLIENT_ID", referencedColumnName = "CLIENT_ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Clients clients;

    public Driver() {
    }

    public Driver(DriverPK driverPK) {
        this.driverPK = driverPK;
    }

    public Driver(DriverPK driverPK, String carName, int carYear) {
        this.driverPK = driverPK;
        this.carName = carName;
        this.carYear = carYear;
    }

    public Driver(int driverId, int clientId) {
        this.driverPK = new DriverPK(driverId, clientId);
    }

    public DriverPK getDriverPK() {
        return driverPK;
    }

    public void setDriverPK(DriverPK driverPK) {
        this.driverPK = driverPK;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (driverPK != null ? driverPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.driverPK == null && other.driverPK != null) || (this.driverPK != null && !this.driverPK.equals(other.driverPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Driver[ driverPK=" + driverPK + " ]";
    }
    
}
