package com.ssh.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssh.dao.IGenericDAO;

public class GenericDAOImpl<T> implements IGenericDAO<T> {
	private Class<T> targetType;
	GenericDAOImpl(){
		ParameterizedType clz = (ParameterizedType) this.getClass().getGenericSuperclass();
		
		targetType = (Class<T>)clz.getActualTypeArguments()[0];
	}
	
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(T obj) {
		Session session = sessionFactory.getCurrentSession();
		session.save(obj);
	}

	public void update(T obj) {
		Session session = sessionFactory.getCurrentSession();
		session.update(obj);
	}

	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		T obj = (T)session.get(targetType, id);
		session.delete(obj);
	}

	public T get(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return (T) session.get(targetType, id);
	}

	public List<T> listAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(targetType).list();
	}

}
