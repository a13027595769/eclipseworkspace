package ������UDP3;

public class ChatRoom {
	public static void main(String[] args) {
		UDPClient uc = new UDPClient("192.168.1.102",10001);
		UDPServer us = new UDPServer(10000);
		
		Thread t1 = new Thread(uc);
		Thread t2 = new Thread(us);
		t1.start();
		t2.start();
		
	}
}
