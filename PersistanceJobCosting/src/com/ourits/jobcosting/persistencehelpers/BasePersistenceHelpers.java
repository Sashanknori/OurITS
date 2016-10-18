package com.ourits.jobcosting.persistencehelpers;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

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

	public List<ProjectIdentifier> retrieveProjectIdentifiers(final Integer maxsize) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<ProjectIdentifier> projectIdentifiers = null;
		try {
			Query query = entityManager.createNamedQuery("ProjectIdentifier.findAll");
			projectIdentifiers = query.getResultList();

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return (maxsize != null) ? projectIdentifiers.subList(0, maxsize) : projectIdentifiers;
	}

}
