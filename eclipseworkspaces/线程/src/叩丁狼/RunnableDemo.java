package ߵ����;

class RunnableDemo1 implements java.lang.Runnable {
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("������"+i);
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		for(int i=0;i<50;i++) {
			System.out.println("����Ϸ"+i);
			if(i==10) {
			Runnable target = new RunnableDemo1();
			Thread t = new Thread(target);
			t.start();
		}
		}
	}
}
