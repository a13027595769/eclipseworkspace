package countThread;

public class Demo2 {
	public static void main(String[] args) {
		CountThread ct = new CountThread("����1");
		CountThread ct1 = new CountThread("����2");
		/*
		ct.setName("�߳�1");
		ct1.setName("�߳�2");
		*/
		//�����߳�
		/**
		 *  ct.run()!!!������ô���õģ�����ֻ�ǵ�����run����
		 */
		ct.start();
		ct1.start();
	}
}
