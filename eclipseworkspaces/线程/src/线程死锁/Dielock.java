package �߳�����;

public class Dielock implements Runnable{

	private boolean flag;
	
	@Override
	public void run() {
		if(flag) {
			synchronized(Lock.lock1) {
				System.out.println("�߳�1�õ���һ����");
				synchronized (Lock.lock2) {
					System.out.println("�߳�1Ҫ�õڶ�����");
					
					
				}
			}
			
			
		}else {
			
			synchronized (Lock.lock2) {
				System.out.println("�߳�2�õ���2����");
				synchronized (Lock.lock1) {
					System.out.println("�߳�2Ҫ�õ�1����");
					
				}
			}
			
		}
	}
	/**
	 * �߳̿�����ʱ������������
	 * @param flag
	 */

	public Dielock(boolean flag) {
		super();
		this.flag = flag;
	}
	
}
