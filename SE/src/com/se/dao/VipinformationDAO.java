package com.se.dao;

import java.util.List;

import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.se.model.Vipinformation;

/**
 * A data access object (DAO) providing persistence and search support for
 * Vipinformation entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see com.se.dao.Vipinformation
 * @author MyEclipse Persistence Tools
 */
public class VipinformationDAO extends BaseHibernateDAO {
	private static final Logger log = LoggerFactory
			.getLogger(VipinformationDAO.class);
	// property constants
	public static final String PHONE = "phone";
	public static final String VIP_NAME = "vipName";
	public static final String SEX = "sex";
	public static final String VIP_ID = "vipId";

	public void save(Vipinformation transientInstance) {
		log.debug("saving Vipinformation instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Vipinformation persistentInstance) {
		log.debug("deleting Vipinformation instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Vipinformation findById(java.lang.String id) {
		log.debug("getting Vipinformation instance with id: " + id);
		try {
			Vipinformation instance = (Vipinformation) getSession().get(
					"com.se.model.Vipinformation", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Vipinformation instance) {
		log.debug("finding Vipinformation instance by example");
		try {
			List results = getSession()
					.createCriteria("com.se.model.Vipinformation")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Vipinformation instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Vipinformation as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByPhone(Object phone) {
		return findByProperty(PHONE, phone);
	}

	public List findByVipName(Object vipName) {
		return findByProperty(VIP_NAME, vipName);
	}

	public List findBySex(Object sex) {
		return findByProperty(SEX, sex);
	}

	public List findByVipId(Object vipId) {
		return findByProperty(VIP_ID, vipId);
	}

	public List findAll() {
		log.debug("finding all Vipinformation instances");
		try {
			String queryString = "from Vipinformation";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Vipinformation merge(Vipinformation detachedInstance) {
		log.debug("merging Vipinformation instance");
		try {
			Vipinformation result = (Vipinformation) getSession().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Vipinformation instance) {
		log.debug("attaching dirty Vipinformation instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Vipinformation instance) {
		log.debug("attaching clean Vipinformation instance");
		try {
			getSession().buildLockRequest(LockOptions.NONE).lock(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}