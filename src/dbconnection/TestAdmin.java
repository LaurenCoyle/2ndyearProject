/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;
import javax.persistence.*;
import java.util.*;
/**
 *
 * @author Evan
 */
public class TestAdmin {
    public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("UserLoginPU");
    EntityManager em = emf.createEntityManager();    
    
    em.getTransaction().begin();
    
    Hotel h1 = new Hotel();
    h1.setId(1);
    h1.sethName("Random Hotel");
    h1.sethAddress("O'Connel Street");
    h1.setNumberOfRooms(50);
    em.persist(h1);
    
    Administrator a1 = new Administrator();
    a1.setId(1);
    a1.setaName("Evan");
    a1.setaEmail("Evan@gmail.com");
    a1.setaPassword("Year2Proj");
    a1.setaPhoneNum(67498498);
    a1.setH(h1);
    em.persist(a1);
    
    Administrator a2 = new Administrator();
    a2.setId(2);
    a2.setaName("Lauren");
    a2.setaEmail("Lauren@gmail.com");
    a1.setaPassword("Year2Proj");
    a2.setaPhoneNum(45498498);
    a2.setH(h1);
    em.persist(a2); 
    
    Administrator a3 = new Administrator();
    a3.setId(3);
    a3.setaName("Andrew");
    a3.setaEmail("Andrew@gmail.com");
    a1.setaPassword("Year2Proj");
    a3.setaPhoneNum(54498498);
    a3.setH(h1);
    em.persist(a3);
    em.getTransaction().commit();
}
}
