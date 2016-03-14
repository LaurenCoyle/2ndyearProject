/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import java.util.*;
import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.CascadeType.ALL;
@Entity
@Table(name = "Administrator")
/**
 *
 * @author Evan
 */
public class Administrator implements Serializable{


    @Id
    @Column(name = "Admin_ID")
    private int id;
    @Column(name = "Admin_Name")
    private String aName;
    @Column(name = "Admin_Email")
    private String aEmail;
    @Column(name = "Admin_Password")
    private String aPassword;
    @Column(name = "Admin_PhoneNum")
    private double aPhoneNum;
    @JoinColumn(name = "Hotel_ID")
    private Hotel h;

    public Administrator() {
    }

    
    public int getId() {
        return id;
    }

    public String getaName() {
        return aName;
    }

    public String getaEmail() {
        return aEmail;
    }
    public String getaPassword() {
        return aPassword;
    }
       
    public double getaPhoneNum() {
        return aPhoneNum;
    }

    public Hotel getH() {
        return h;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public void setaEmail(String aEmail) {
        this.aEmail = aEmail;
    }
    public void setaPassword(String aPassword) {
        this.aPassword = aPassword;
    }
    public void setaPhoneNum(double aPhoneNum) {
        this.aPhoneNum = aPhoneNum;
    }

    public void setH(Hotel h) {
        this.h = h;
    }
    
}
