package yieldDemo;

public class YieldDemo {
	public static void main(String[] args) {
		
		YieldThread pt = new YieldThread();
		YieldThread pt1 = new YieldThread();
		YieldThread pt2 = new YieldThread();
		/**
		 * �ȴ��߳̾������̴߳����н׶λص������׶Σ�Ŀ���ǰ�CPU����Դ�ø������߳�
		 * ����ǫ�ã�Ȼ��������Դ���ǻ�����Դ��
		 */
		pt2.start();
		pt.start();
		pt1.start();
		
	
	}
}
