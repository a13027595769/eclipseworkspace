package ������UDP3;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPServer implements Runnable {

		private int port;
	
		public UDPServer(int port) {
			super();
			this.port = port;
		}

		public int getPort() {
			return port;
		}

		public void setPort(int port) {
			this.port = port;
		}

		@Override
		public void run() {

			DatagramSocket ds = null;
			
			try {
				//����UDP�������˵Ķ��󣬱����ƶ��˿�8000��ǰ�Ķ���ռ���ˣ�������10000�Ժ� ��
				ds = new DatagramSocket(port);
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
