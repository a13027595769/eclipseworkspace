package countThread;

public class Demo3 {
	public static void main(String[] args) {
		/**
		 * �̵߳���������
		 * 1.�½����̱߳�new ����
		 * 2.׼���������߳̾���ִ�е��ʸ񣬼��̵߳�����start(),û��ִ�е�Ȩ��
		 * 3.���У��߱�ִ�е��ʸ�;߱�ִ�е�Ȩ��
		 * 4.������׼�������Ժ�����CPU�Ϳ�ʼ����   �����У����е�ʱ����Եȴ�������sleep��������wait��������
		 * 	û��ִ��Ȩ����ִ���ʸ�sleepִ��ʱ�䵽��ֻ�оͻ�ص�׼�������Ľ׶�  Ҳ���� notify()�����̰߳���������
		 * 5.��������֮�����run��������stop����֮��ͻ����٣��̵߳Ķ������������ͷ���Դ
		 */
		CountThread2 ct = new CountThread2();
		Thread t1 = new Thread(ct,"123");
		CountThread2 ct1 = new CountThread2();
		Thread t2 = new Thread(ct1,"456");
		t1.start();
		t2.start();
		
	}
}
