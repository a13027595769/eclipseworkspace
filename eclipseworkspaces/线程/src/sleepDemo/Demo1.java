package sleepDemo;

public class Demo1 {
	public static void main(String[] args) {
		SleepDemo sd = new SleepDemo();
		Thread th = new Thread(sd);
		th.start();
		/**
		 * �̵߳������Ǻܱ�Ҫ�ģ���������˵�ʱ��Ϊ�˼��ٷ�������ѹ��������Ҫ����
		 * �����������ͬ���������ִ�У����߲����ó�������
		 */
	}
}
