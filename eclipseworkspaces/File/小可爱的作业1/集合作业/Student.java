package com.zz;

public class Student extends Person{
	private int alimony;//�����
	private int tuition;//ѧ��
	public Student() {
		
	}
	public Student(int id, String name,int age) {
		setId(id);
		setName(name);
		setAge(age);
	}
	public int getAlimony() {
		return alimony;
	}
	public void setAlimony(int alimony) {
		this.alimony = alimony;
	}
	public int getTuition() {
		return tuition;
	}
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}
	public void print(){
		System.out.println("ѧ�����Ϊ��"+getId()+",ѧ������Ϊ��"+getName()+"������Ϊ��"+getAge());
	}
}
