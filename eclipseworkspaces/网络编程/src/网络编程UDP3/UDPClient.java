package ������UDP3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient implements Runnable{
		private String ip;
		private int port;
	
	
	public UDPClient(String ip, int port) {
			super();
			this.ip = ip;
			this.port = port;
		}


	@Override
	public void run() {
		DatagramSocket ds = null;
		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			// �����ͻ��˵��׽��ֶ���
			ds = new DatagramSocket();
			// ����һ�����͵�����
//			�ַ���.getBytes()���ַ���ת��Ϊ�ֽ�����
			while(true) {
				
			String line = br.readLine();
			byte[] bs = line.getBytes();
			// ����Ҫ���͵�Ŀ�ĵ�IP��ַҲ�����Ǳ���������Ҳ������192.168.1.102(���˵���)
			InetAddress is = InetAddress.getByName(ip);
			// �����ݰ�
			DatagramPacket dp = new DatagramPacket(bs, bs.length, is, port);
			// ��������
			ds.send(dp);
			
			if("exit".equals(line)) {
				break;
			}
			
			} 
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (ds != null) {
				ds.close();
			}
		}
		
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}


	
}
