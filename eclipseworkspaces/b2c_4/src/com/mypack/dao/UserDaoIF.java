package com.mypack.dao;

import com.mypack.entity.User;

public interface UserDaoIF {
	
	public User queryUserByUsername(User user);//��ѯ���� ��¼
	public boolean addUser(User user) ;//��ӵ��� ע��

}
