package edu.mum.cs544.repository;
// Generated Sep 23, 2016 11:52:01 AM by Hibernate Tools 5.1.0.Beta1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Order.
 * @see edu.mum.cs544.repository.Order
 * @author Hibernate Tools
 */
@Stateless
public class OrderHome {

	private static final Log log = LogFactory.getLog(OrderHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Order transientInstance) {
		log.debug("persisting Order instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Order persistentInstance) {
		log.debug("removing Order instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Order merge(Order detachedInstance) {
		log.debug("merging Order instance");
		try {
			Order result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Order findById(Integer id) {
		log.debug("getting Order instance with id: " + id);
		try {
			Order instance = entityManager.find(Order.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
