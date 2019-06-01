package com.mypack.dao;

import java.util.List;

import com.mypack.entity.Address;
import com.mypack.entity.Item;
import com.mypack.entity.User;

public interface AddressDaoIF {
	
	
	public boolean addAddress(Address addr);	//��ӵ����ﳵ
	public List<Address> queryAllAddr(User user);//�û�ֻ�ܲ�ѯ���û����µĵ�ַ��Ϣ
	public boolean updateAddress(Address addr);
	public boolean deleteAddressById(int addressId);
	public Address queryAddressById(int addressId);

}
