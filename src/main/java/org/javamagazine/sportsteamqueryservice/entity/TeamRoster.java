/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.javamagazine.sportsteamqueryservice.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author juneau
 */
@Entity
@Table(name = "TEAM_ROSTER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TeamRoster.findAll", query = "SELECT t FROM TeamRoster t"),
    @NamedQuery(name = "TeamRoster.findById", query = "SELECT t FROM TeamRoster t WHERE t.id = :id"),
    @NamedQuery(name = "TeamRoster.findByFirstName", query = "SELECT t FROM TeamRoster t WHERE t.firstName = :firstName"),
    @NamedQuery(name = "TeamRoster.findByLastName", query = "SELECT t FROM TeamRoster t WHERE t.lastName = :lastName"),
    @NamedQuery(name = "TeamRoster.findByPosition", query = "SELECT t FROM TeamRoster t WHERE t.position = :position"),
    @NamedQuery(name = "TeamRoster.findByRegistrationDate", query = "SELECT t FROM TeamRoster t WHERE t.registrationDate = :registrationDate")})
public class TeamRoster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "POSITION")
    private String position;
    @Column(name = "REGISTRATION_DATE")
    @Temporal(TemporalType.DATE)
    private Date registrationDate;

    public TeamRoster() {
    }

    public TeamRoster(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TeamRoster)) {
            return false;
        }
        TeamRoster other = (TeamRoster) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.javamagazine.sportsteamqueryservice.entity.TeamRoster[ id=" + id + " ]";
    }
    
}
