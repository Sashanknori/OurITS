package com.ourits.jobcosting.persistencehelpers;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ourits.jobcosting.entities.ProjectIdentifier;
import com.ourits.jobcosting.entities.ProjectIdentifierPK;
import com.ourits.jobcosting.entities.SubProjectIdentifier;
import com.ourits.jobcosting.entities.SubProjectIdentifierPK;
import com.ourits.jobcosting.entities.TaskDentifier;
import com.ourits.jobcosting.entities.TaskDentifierPK;

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
	
	public void updateProjectIdentifier(ProjectIdentifier projectIdentifier) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		projectIdentifier.setLastModifiedDate(timestamp);
		try {
			entityManager.merge(projectIdentifier);
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

	public ProjectIdentifier retrieveProjectIdentifierDetails(ProjectIdentifierPK id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProjectIdentifier projectIdentifierRetrieved = null;
		entityManager.getTransaction().begin();
		System.out.println(id);
		try {
			projectIdentifierRetrieved = entityManager.find(ProjectIdentifier.class, id);

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return projectIdentifierRetrieved;

	}

	public void deleteProjectIdentifier(ProjectIdentifier projectIdentifier) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		try {
			ProjectIdentifier entity = entityManager.find(ProjectIdentifier.class, projectIdentifier.getId());
			entityManager.remove(entity);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

	public void createSubProjectIdentifier(SubProjectIdentifier subProjectIdentifier) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		subProjectIdentifier.setCreationTime(timestamp);
		subProjectIdentifier.setLastModifiedDate(timestamp);
		try {
			entityManager.persist(subProjectIdentifier);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

	public List<SubProjectIdentifier> retrieveSubProjectIdentifiers(final Integer maxsize) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<SubProjectIdentifier> subProjectIdentifiers = null;
		try {
			Query query = entityManager.createNamedQuery("SubProjectIdentifier.findAll");
			subProjectIdentifiers = query.getResultList();

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return (maxsize != null) ? subProjectIdentifiers.subList(0, maxsize) : subProjectIdentifiers;
	}

	public SubProjectIdentifier retrieveSubProjectIdentifierDetails(SubProjectIdentifierPK id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		SubProjectIdentifier subProjectIdentifierRetrieved = null;
		entityManager.getTransaction().begin();
		System.out.println(id);
		try {
			subProjectIdentifierRetrieved = entityManager.find(SubProjectIdentifier.class, id);

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return subProjectIdentifierRetrieved;

	}

	public void updateSubProjectIdentifier(SubProjectIdentifier subProjectIdentifierRetrievedForUpdate) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		subProjectIdentifierRetrievedForUpdate.setLastModifiedDate(timestamp);
		try {
			entityManager.merge(subProjectIdentifierRetrievedForUpdate);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	
		
	}

	public void deleteSubProjectIdentifier(SubProjectIdentifier subProjectIdentifier) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		try {
			SubProjectIdentifier entity = entityManager.find(SubProjectIdentifier.class, subProjectIdentifier.getId());
			entityManager.remove(entity);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

	public void createTaskIdentifier(TaskDentifier taskIdentifier) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		taskIdentifier.setCreationTime(timestamp);
		taskIdentifier.setLastModifiedDate(timestamp);
		try {
			entityManager.persist(taskIdentifier);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	}

	public List<TaskDentifier> retrieveAllTaskDetails(Integer maxsize) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		List<TaskDentifier> taskIdentifiers = null;
		try {
			Query query = entityManager.createNamedQuery("TaskDentifier.findAll");
			taskIdentifiers = query.getResultList();

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return (maxsize != null) ? taskIdentifiers.subList(0, maxsize) : taskIdentifiers;
	}

	public TaskDentifier retrieveTaskDetails(TaskDentifierPK taskDentifierPK) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		TaskDentifier taskIdentifierRetrieved = null;
		entityManager.getTransaction().begin();
		System.out.println(taskDentifierPK);
		try {
			taskIdentifierRetrieved = entityManager.find(TaskDentifier.class, taskDentifierPK);

		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}
		return taskIdentifierRetrieved;

	}

	public void updateTaskDetails(TaskDentifier taskDetailsForUpdate) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		final Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		taskDetailsForUpdate.setLastModifiedDate(timestamp);
		try {
			entityManager.merge(taskDetailsForUpdate);
			entityManager.getTransaction().commit();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

		finally {
			entityManager.close();
			entityManagerFactory.close();
		}

	
		
	}
	

	public void deleteTaskIdentifier(TaskDentifier taskDetailsForUpdate) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PersistanceJobCosting");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		try {
			TaskDentifier entity = entityManager.find(TaskDentifier.class, taskDetailsForUpdate.getId());
			entityManager.remove(entity);
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
