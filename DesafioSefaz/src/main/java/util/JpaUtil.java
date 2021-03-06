package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	
	public static EntityManager getEntityManager() {
		
		if(entityManager == null) {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("desafio");
			entityManager = entityManagerFactory.createEntityManager();
		}
		return entityManager;
		
	}
}