package �ػ��߳�;

public class DaemonDemo {
	public static void main(String[] args) {
		
		DaemonThread pt = new DaemonThread();
		DaemonThread pt1 = new DaemonThread();
//		�ػ��߳� 
//		���߳̽���ˣ��ػ��߳�Ҳ��������Ӧ�ĵط������ǲ�һ��ȫ��ִ����
		pt.setDaemon(true);
		pt1.setDaemon(true);
		
		pt.start();
		pt1.start();
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"����ִ��"+i);
			
		}
	
	}
}
