package join;

public class JoinDemo {
	public static void main(String[] args) {
		
		JoinThread pt = new JoinThread();
		JoinThread pt1 = new JoinThread();
		JoinThread pt2 = new JoinThread();
//		�߳����ȼ�setPriority()  Ĭ����5 �����10 ��С��1  �����˵�õ��Ļ���࣬Ҳ�����ر�׼ȷ
		/*
		System.out.println(pt.getPriority());
		System.out.println(pt1.getPriority());
		System.out.println(pt2.getPriority());
		*/
		/*
		pt.setPriority(1);
		pt1.setPriority(5);
		pt2.setPriority(10);
		*/
		pt2.start();
			try {
				//join�̻߳������õ�CPU��ִ���̣߳�Ȼ���������߳�����ִ��
				pt2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pt.start();
		pt1.start();
		
	
	}
}
