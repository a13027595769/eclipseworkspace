package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Item;
import com.mypack.entity.User;

public interface CartDaoIF {
	
	
	public boolean addCart(Item item);	//��ӵ����ﳵ
	public List<Item> queryAllCart(User user);//��ѯ���ﳵ��Ϣ �û�ֻ�ܲ�ѯ���û����µ���Ʒ��Ϣ
	public boolean updateCart(Item item);
	public boolean deleteCartById(int goodsId);

}
