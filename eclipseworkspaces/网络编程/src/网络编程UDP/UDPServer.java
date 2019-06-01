package ������UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			//����UDP�������˵Ķ��󣬱����ƶ��˿�8000��ǰ�Ķ���ռ���ˣ�������10000�Ժ� ��
			ds = new DatagramSocket(10005);
			//����������ݵ��ֽ�����
			byte[] bs = new byte[1024];
			//������յ����ݰ�
			DatagramPacket dp = new DatagramPacket(bs,bs.length);
			System.out.println("�������Ѿ�����");
			ds.receive(dp);
			//��÷��Ͷ˵�IP
			InetAddress ia = dp.getAddress();
			//��ȡ���ݰ��е�����
			byte[] bs1 = dp.getData(); 
			//��ý������ݵĳ���(ʵ�ʽ��յĳ���)
			int len = dp.getLength();
			//��װ���յ�����
			String data = new String(bs1,0,len);
			System.out.println(ia.getHostAddress()+"������"+data);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ds!=null) {
				ds.close();
			}
		}
		
		
	}
}
