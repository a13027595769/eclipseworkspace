package buyTiket;

public class SaleTicket3 extends Thread{
	private String name;
	
	
	
	
	public SaleTicket3(String name) {
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
				//ͬ�������
				/**
				 * ������ǵ�ǰ�����������
				 */
				synchronized (SaleTicket3.class) {
					if(tickets>0) {
						try {
							Thread.sleep(0);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
						System.out.println(Thread.currentThread().getName()+"������"+tickets--+"��Ʊ");
					}else {
						System.out.println("Ʊ�Ѿ�����");
						break;
					}
				}
			}
			else {
				saleTicked();
			
			}
			i++;
			
		}
	}
	/**
	 * ��̬������synchronized���ǵ�ǰ��������
	 */
	public synchronized static void saleTicked() {
		
			if(tickets>0) {
				try {
					Thread.sleep(0);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
				System.out.println(Thread.currentThread().getName()+"������"+tickets--+"��Ʊ");
			}else {
				System.out.println("Ʊ�Ѿ�����");
				
			}
		
		
		
		
	}
	
}

