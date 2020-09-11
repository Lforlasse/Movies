/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import entities.Movie;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import utils.EMF_Creator;

/**
 *
 * @author Lasse Emil
 */
public class Main {

    public static void main(String[] args) {

        //EntityManagerFactory emf = EMF_Creator.createEntityManagerFactory();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(new Movie(2002, "Harry Potter and the Chamber of Secrets", new String[]{"Daniel Radcliffe", "Emma Watson", "Alan Rickman", "Rupert Grint"}));
            em.persist(new Movie(2001, "Harry Potter and the Philosopher's Stone", new String[]{"Daniel Radcliffe", "Emma Watson", "Alan Rickman", "Rupert Grint"}));
            em.persist(new Movie(2019, "Once Upon a Time... in Hollywood", new String[]{"Leonardo DiCaprio", "Brad Pitt", "Margot Robbie"}));
            em.getTransaction().commit();
        } finally {
            em.close();
        }

    }

}
