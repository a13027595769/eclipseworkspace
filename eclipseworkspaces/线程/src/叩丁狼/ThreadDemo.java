package ߵ����;
class MusicThread extends java.lang.Thread{
	
	@Override
	public void run() {
		for(int i=0;i<50;i++) {
			System.out.println("���ڲ�������"+i);
		}
	}
	
}
//��ʽһ���̳�Thread��
public class ThreadDemo {
	public static void main(String[] args) {
		
		for(int i=0;i<50;i++) {
			System.out.println("���ڴ���Ϸ"+i);
			if(i==10) {
				
				MusicThread t = new MusicThread();
				t.start();
			}
		}
	}
}
