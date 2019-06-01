package ���л���;

import java.io.Serializable;

public class Person implements Serializable{
	/**
	 * ��	��һ��ָ�������л��汾��ID�������෢���˱仯������Ӱ�쵽�����л�
	 */
	private static final long serialVersionUID = 9054167076142082527L;

	private String name;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
