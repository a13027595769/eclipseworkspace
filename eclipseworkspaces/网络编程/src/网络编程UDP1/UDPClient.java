package ������UDP1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) {
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
			InetAddress is = InetAddress.getByName("192.168.1.102");
			// �����ݰ�
			DatagramPacket dp = new DatagramPacket(bs, bs.length, is, 10001);
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
}
