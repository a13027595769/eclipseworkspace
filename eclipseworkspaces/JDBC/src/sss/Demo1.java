package sss;


import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class Demo1 {
	
@Test

	
	public void test1() throws Exception {
		//����ע������
		Class.forName("com.mysql.jdbc.Driver");
		//��ȡ���Ӷ���
		Connection con = DriverManager.getConnection("jdbc:mysql:///jdbcdemo", "root", "root");
//		��˯һС���£����򿴲���mysql�Ľ���
		Thread.sleep(5000);
	}
}
