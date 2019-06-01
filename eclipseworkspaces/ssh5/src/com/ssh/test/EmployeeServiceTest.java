package com.ssh.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.domain.Department;
import com.ssh.domain.Employee;
import com.ssh.query.EmployeeQueryObject;
import com.ssh.query.PageResult;
import com.ssh.service.IDepartmentService;
import com.ssh.service.IEmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeeServiceTest {

	@Autowired
	private IEmployeeService service;
	@Autowired
	private IDepartmentService dservice;
	
	@Test
	public void t() {
		EmployeeQueryObject qo = new EmployeeQueryObject();
		qo.setKeyword("test");
		qo.setDeptId(3L);
		List<Employee> query1 = service.query1(qo);
	for (Employee employee : query1) {
		
		System.out.println(employee);
	}
	}
	@Test
	public void testSave() {
		for (int i = 0; i < 23; i++) {
			Employee e = new Employee();
			e.setName("test_" + i);
			e.setAge(10 + 1);
			service.save(e);
		}
	}



	@Test
	public void testUpdate() {
		Employee e = new Employee();
		e.setName("niubi");
		e.setId(4L);
		service.update(e);
	}

	@Test
	public void testDelete() {
		Employee e = new Employee();
		e.setId(4L);
	}

	@Test
	public void testGet() {
		System.out.println(service.get(12L));
		// System.out.println(service.getUserByUsername("lisi"));
	}

	@Test
	public void testListAll() {
		List<Employee> em = service.listAll();
		for (Employee e : em) {
			System.out.println(e);
		}
	}

}
