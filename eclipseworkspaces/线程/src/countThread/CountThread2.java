package countThread;

public class CountThread2 implements Runnable{
	
	
	

	/**
	 * �̵߳�ִ����
	 * 
	 * ������ִ���߳������ַ�����һ�ַ����ǽ�������ΪThread�����࣬������Ӧ����дThread���е�run����
	 * ���������Է��䲢�������������ʵ��
	 */
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			//����̵߳�����
			System.out.println(Thread.currentThread().getName()+"hello"+i);
		}
	}

}
