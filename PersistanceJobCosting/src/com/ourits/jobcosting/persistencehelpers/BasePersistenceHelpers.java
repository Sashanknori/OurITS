package com.ourits.jobcosting.persistencehelpers;

import java.sql.Timestamp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ourits.jobcosting.entities.ProjectIdentifier;

public class BasePersistenceHelpers {

	public void createProjectIdentifier(ProjectIdentifier projectIdentifier) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		projectIdentifier.setCreationTime(timestamp);
		projectIdentifier.setLastModifiedDate(timestamp);
		try {
			entityManager.persist(projectIdentifier);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

}
