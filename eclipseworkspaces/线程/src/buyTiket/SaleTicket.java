package buyTiket;

public class SaleTicket extends Thread{
	private String name;
	
	
	
	
	public SaleTicket(String name) {
		super(name);
	
	}

	private static int tickets = 100;
	private static Object obj = new Object();
	private static B a = new B();
	@Override
	public void run() {
	
		
		while(true) {
			/**
			 * synchronizedͬ����������������������������(�̵߳�ʵ�ַ�ʽ�Ǽ̳���Thread)
			 * ��������������̹߳����
			 */
			
			
			synchronized (a) {
				if(tickets>0) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					System.out.println(this.getName()+"������"+tickets--+"��Ʊ");
				}else {
					System.out.println("Ʊ�Ѿ�����");
					break;
				}
			}
			
			
			
		}
	}
}
class A{
	
	
}
