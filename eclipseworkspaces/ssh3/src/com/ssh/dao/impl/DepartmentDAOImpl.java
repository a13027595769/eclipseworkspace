package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssh.dao.IDepartmentDAO;
import com.ssh.dao.IEmployeeDAO;
import com.ssh.domain.Department;
import com.ssh.domain.Employee;

public class DepartmentDAOImpl implements IDepartmentDAO{
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Department e) {
		Session session = sessionFactory.getCurrentSession();
		session.save(e);
	}

	public void update(Department e) {
		Session session = sessionFactory.getCurrentSession();
		session.update(e);
		
	}

	public void delete(Department e) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(e);
		
	}

	public Department get(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return (Department) session.get(Department.class, id);
	}

	public List<Department> listAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Department.class).list();
	}

	



}
