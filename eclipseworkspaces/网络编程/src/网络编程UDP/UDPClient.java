package ������UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPClient {
	public static void main(String[] args) {
		DatagramSocket ds = null;
		try {
			// �����ͻ��˵��׽��ֶ���
			ds = new DatagramSocket();
			// ����һ�����͵�����
//			�ַ���.getBytes()���ַ���ת��Ϊ�ֽ�����
			byte[] bs = "���".getBytes();
			// ����Ҫ���͵�Ŀ�ĵ�IP��ַҲ�����Ǳ���������Ҳ������192.168.1.102(���˵���)
			InetAddress is = InetAddress.getByName("MSI");
			// �����ݰ�
			DatagramPacket dp = new DatagramPacket(bs, bs.length, is, 10005);
			// ��������
			ds.send(dp);

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
