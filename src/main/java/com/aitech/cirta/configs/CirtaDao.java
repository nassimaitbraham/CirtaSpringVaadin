package com.aitech.cirta.configs;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * 
 * 
 * 
 * @author Nassim AIT BRAHAM - AITECH
 *
 */

public class CirtaDao {
	
	// L'EntityManager va etre automatiquement injecte� a partir de
	// entityManagerFactory
	// configurer dans la class DatabaseConfig
	@PersistenceContext
	protected EntityManager entityManager;

}
