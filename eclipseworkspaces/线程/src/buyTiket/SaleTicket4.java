package buyTiket;

public class SaleTicket4 implements Runnable{

//	private Object obj = new Object();
	private int tickets = 100;
	@Override
	public void run() {
	
		
		while(true) {
			
			int i=0;
			if(i%2==0) {
				//ͬ�������
				/**
				 * �Ǿ�̬�������ǵ�ǰ�Ķ�����������this
				 */
				synchronized (this) {
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
	 * �Ǿ�̬������synchronized���ǵ�ǰ��������
	 */
	public synchronized void saleTicked() {
		
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

