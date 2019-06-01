package ߵ����;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class RunnableDemo2 implements java.lang.Runnable {
	private int num = 50;
	
	private final Lock lock = new ReentrantLock();
	
	public void run() {
		for(int i=0;i<50;i++) {
			eat();
		}
	}
	private void eat() {
		lock.lock();
		try {
			if(num>0) {
				System.out.println(Thread.currentThread().getName()+"���˱��Ϊ"+
			num+"��ƻ��");
				Thread.sleep(10);
				num--;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			lock.unlock();
		}
	}
}




public class LockDemo {
	public static void main(String[] args) {
		RunnableDemo2 r = new RunnableDemo2();
		Thread t1 = new Thread(r,"СA");
		Thread t2 = new Thread(r,"СB");
		Thread t3 = new Thread(r,"СC");
		t1.start();
		t2.start();
		t3.start();
		
	}
}
