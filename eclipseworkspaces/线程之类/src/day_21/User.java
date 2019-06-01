package day_21;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	//����transient֮��Ͳ��ñ����л���
	transient private String password;
	private int age;
	public User(String name, String id, int age) {
		this.username = name;
		this.password = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", age=" + age + "]";
	}
	
}
