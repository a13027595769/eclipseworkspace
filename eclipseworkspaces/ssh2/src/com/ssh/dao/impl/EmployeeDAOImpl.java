package com.ssh.dao.impl;

import com.ssh.dao.IEmployeeDAO;
import com.ssh.domain.Employee;

public class EmployeeDAOImpl extends  GenericDAOImpl<Employee> implements IEmployeeDAO{
/*	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(Employee e) {
		Session session = sessionFactory.getCurrentSession();
		session.save(e);
	}

	public void update(Employee e) {
		Session session = sessionFactory.getCurrentSession();
		session.update(e);
		
	}

	public void delete(Employee e) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(e);
		
	}

	public Employee get(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return (Employee) session.get(Employee.class, id);
	}

	public List<Employee> listAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(Employee.class).list();
	}
*/


}
