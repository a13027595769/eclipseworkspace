package buyTiket;

public class SaleTicket2 extends Thread{
	private String name;
	
	
	
	
	public SaleTicket2(String name) {
		super(name);
	
	}

	private static int tickets = 100;
	private static Object obj = new Object();
	private static A a = new A();
	@Override
	public void run() {
	
		
		while(true) {
			/**
			 * synchronizedͬ����������������������������(�̵߳�ʵ�ַ�ʽ�Ǽ̳���Thread)
			 * ��������������̹߳����
			 */
			int i=0;
			if(i%2==0) {
				synchronized (a) {
					if(tickets>0) {
						try {
							Thread.sleep(0);
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
			else {
			synchronized (a) {
				if(tickets>0) {
					try {
						Thread.sleep(0);
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
			i++;
			
		}
	}
}
class B{
	
	
}
