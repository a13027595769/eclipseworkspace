package �߳����ȼ�;

public class PriorityTest {
	public static void main(String[] args) {
		
		Priority pt = new Priority();
		Priority pt1 = new Priority();
		Priority pt2 = new Priority();
//		�߳����ȼ�setPriority()  Ĭ����5 �����10 ��С��1  �����˵�õ��Ļ���࣬Ҳ�����ر�׼ȷ
		/*
		System.out.println(pt.getPriority());
		System.out.println(pt1.getPriority());
		System.out.println(pt2.getPriority());
		*/
		
		pt.setPriority(1);
		pt1.setPriority(5);
		pt2.setPriority(10);
		pt.start();
		pt1.start();
		pt2.start();
	}
}
