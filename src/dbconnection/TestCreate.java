/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Lauren
 */
public class TestCreate {
     public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("LoginDBConnectionPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Member m1 = new Member(6, "NewUser@email.com", "Password");
        em.persist(m1);

        em.getTransaction().commit();
    }
}
