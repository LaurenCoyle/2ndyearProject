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
@Table(name = "Hotel")
/**
 *
 * @author Evan
 */
public class Hotel implements Serializable {
    @Id
    @Column(name = "Hotel_ID")
    private int id;
    @Column(name = "Hotel_Name")
    private String hName;
    @Column(name = "Hotel_Address")
    private String hAddress;
    @Column(name = "NumberOfRooms")
    private int NumberOfRooms;
    @OneToMany(cascade = ALL, mappedBy = "h")    
    private List<Administrator> hList = new ArrayList<>();

    public Hotel() {
    }

    public int getId() {
        return id;
    }

    public String gethName() {
        return hName;
    }

    public String gethAddress() {
        return hAddress;
    }

    public int getNumberOfRooms() {
        return NumberOfRooms;
    }

    public List<Administrator> getaList() {
        return hList;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public void sethAddress(String hAddress) {
        this.hAddress = hAddress;
    }

    public void setNumberOfRooms(int NumberOfRooms) {
        this.NumberOfRooms = NumberOfRooms;
    }

    public void sethList(List<Administrator> hList) {
        this.hList = hList;
    }
}
