package com.zz;

public class Teacher extends Person{
	private int salary;//����
	private String major;//רҵ
	public Teacher() {
		
	}
	public Teacher(int id, String name,int age) {
		setId(id);
		setName(name);
		setAge(age);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void print(){
		System.out.println("��ʦ���Ϊ��"+getId()+"��ʦ����Ϊ��"+getName()+"������Ϊ��"+getAge());
	}
}
