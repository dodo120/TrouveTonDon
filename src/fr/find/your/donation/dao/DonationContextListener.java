package fr.find.your.donation.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class DonationContextListener implements ServletContextListener {
	
	private static EntityManager em;

    /**
     * Initialise l'entity manager factory à l'aide de la classe Persistence.
     *
     * @param sce ServletContextEvent
     * @return instance de la classe EntityManagerFactory
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        final EntityManagerFactory emf = Persistence.createEntityManagerFactory("GestionSeries");
        em = emf.createEntityManager();
    }

    /**
     * Ferme la connexion à l'entity manager factory.
     *
     * @param sce ServletContextEvent
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        if (em != null) {
            em.getEntityManagerFactory().close();
        }
    }

    /**
     * Getter pour récupérer l'entity manager.
     *
     * @return instance de la classe EntityManager
     */
    public static EntityManager getEntityManager() {
        return em;
    }

}
