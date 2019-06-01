package com.mypack.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mypack.entity.User;

public class UserDaoImpl extends BaseDao implements UserDaoIF {

	@Override
	public User queryUserByUsername(User user)  {

		String sql="select * from user where username=?";//? ռλ��
		Connection conn=getConn();
		//sql��䱻Ԥ����
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		User u=null;
		try {
			pstmt = conn.prepareStatement(sql);
			//ִ�в�ѯ֮ǰһ��Ҫ��sql����в�������ֵ  
			//��һ��������ʾ?λ�� ��1��ʼ   �ڶ���������Ҫ���õ�ֵ
			pstmt.setString(1, user.getUsername());
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				String username=rs.getString(1);
				String password=rs.getString(2);
				u=new User(username, password);   
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
		
			close(rs, pstmt, conn);
		}
		return u;
	}

	@Override
	public boolean addUser(User user) {

		boolean flag=false;
		String sql="insert into user values(?,?,?)";//? ռλ��
		
		
		Connection conn=getConn();
		//sql��䱻Ԥ����
		PreparedStatement pstmt=null;
		try {
			pstmt = conn.prepareStatement(sql); 
			
			
			pstmt.setString(1, user.getUsername());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getTel());
			
			// ResultSet executeQuery()  ִ�в�ѯ  int executeUpdate() ִ����ɾ��
			int row=pstmt.executeUpdate();
			if(row>0){
				System.out.println("�����"+row+"��");
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			//��ɾ��û�н��������
			close(pstmt, conn);
		}
		return flag;
	}

}
