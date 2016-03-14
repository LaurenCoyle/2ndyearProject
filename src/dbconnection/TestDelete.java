/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Lauren
 */
public class TestDelete {
    private static EntityManagerFactory emf;
    private static EntityManager em;

    public static void main(String[] args) {

        emf = Persistence.createEntityManagerFactory("LoginDBConnectionPU");
        em = emf.createEntityManager();

        em.getTransaction().begin();

        int deletedCount = em.createQuery("DELETE FROM Member m WHERE m.id = 1").executeUpdate();
        System.out.println(deletedCount + " User removed");

        readData();

        Member m1 = new Member(2, "new@newmember.ie", "new");
        em.persist(m1);

        em.getTransaction().commit();
        readData();
        em.close();
        emf.close();

    }

    public static void readData() {
        System.out.println("==========================================");
        TypedQuery<Member> query
                = em.createQuery("SELECT m FROM Member m order by m.id", Member.class);
        List<Member> results = query.getResultList();
        for (Member e : results) {
            System.out.println(e);
        }
}
}