package com.sachin.datasupport.base.hibernatesupport;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DaoSupportImpl {

	@Autowired
	private SessionFactory sessionFactory;
	
	public int getCircleCount()
	{
		String hql = "SELECT COUNT(*) FROM Circle";
		org.hibernate.query.Query query = getSessionFactory().openSession().createQuery(hql);
		return ((Long) query.uniqueResult()).intValue();
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
