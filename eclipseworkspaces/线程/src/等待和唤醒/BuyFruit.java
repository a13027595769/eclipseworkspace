package �ȴ��ͻ���;

public class BuyFruit implements Runnable{
	private Fruit fruit;

	public BuyFruit(Fruit fruit) {
		super();
		this.fruit = fruit;
	}

	@Override
	public void run() {

			while(true) {
				
				synchronized(fruit) {
					if(!fruit.isExsit()) {
						try {
							fruit.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						
					}
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(fruit.getName()+"�������ˣ�");
					fruit.setExsit(false);
					fruit.notify();
					
				}
			}
		
	}
	
	
}
