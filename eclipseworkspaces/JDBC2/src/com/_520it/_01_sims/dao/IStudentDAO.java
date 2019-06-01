package com._520it._01_sims.dao;

import java.util.List;

import com._520it._01_sims.domain.Student;

public interface IStudentDAO {
	/**
	 * �������
	 */
	void save(Student stu);
	/**
	 * ɾ������
	 */
	void delete(Long id);
	/**
	 * ���²���
	 */
	void update(Long id,Student newStu);
	/**
	 * ��ѯָ��ѧ����ID
	 */
	Student get(Long id);
	/**
	 * ��ѯ����������ѧ������
	 */
	List<Student> listAll();
	
}
