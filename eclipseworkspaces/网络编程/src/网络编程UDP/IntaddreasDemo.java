package ������UDP;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IntaddreasDemo {
	public static void main(String[] args) {
		
		
		try {
			InetAddress is = InetAddress.getLocalHost();
			System.out.println(is);
			//���ص�ID�ַ���
			String ip = is.getHostAddress();
			System.out.println(ip);
			//���������
			
			String name = is.getHostName();
			System.out.println(name);
			
			InetAddress i1 = InetAddress.getByName("MSI");
			System.out.println(i1);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
