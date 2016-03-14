/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lauren
 */
public class Member {

   @MappedSuperclass
    @Table(name = "MEMBER")

public class Employee {
  
    @Id
    private int ID;
    private String email;
    private String password;

    public int getID() {
        return ID;
    }

    public String geteEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.ID = id;
    }

    public void setEmail(String name) {
        this.email = name;
    }

    public void setPassword(String Password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return super.toString(); 
    }

    
    } 
}

