package ������UDP1;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		
		try {
			//����UDP�������˵Ķ��󣬱����ƶ��˿�8000��ǰ�Ķ���ռ���ˣ�������10000�Ժ� ��
			ds = new DatagramSocket(10001);
			//����������ݵ��ֽ�����
			byte[] bs = new byte[1024];
			System.out.println("�������Ѿ�����");
			//������յ����ݰ�
			
			
			while(true) {
			DatagramPacket dp = new DatagramPacket(bs,bs.length);
			ds.receive(dp);
			//��÷��Ͷ˵�IP
			InetAddress ia = dp.getAddress();
			//��ȡ���ݰ��е�����
			byte[] bs1 = dp.getData(); 
			//��ý������ݵĳ���(ʵ�ʽ��յĳ���)
			int len = dp.getLength();
			//��װ���յ�����
			String data = new String(bs1,0,len);
			if("exit".equals(data)) {	
				break;
			}
			System.out.println(ia.getHostAddress()+"������"+data);
			
			}
			
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
