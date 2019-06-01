package �ȴ��ͻ���;

public class ProductFruit implements Runnable{
	/**
	*����������ˮ�������ˮ��û�б�������ô�Ͳ��������ڵȴ�״̬�����ˮ�������������ߵ�ʱ�������߻�֪ͨ������
	*���������ߣ����Ѿ����ˣ���������������ͬ�����ˮ���Ѿ��������������ߣ�����֮����֪ͨ�����߼ǵ�����
	*���ˮ����һ�������ǹ����ģ���synchronize������У�
	*��
	 */
	private Fruit fruit;

	public ProductFruit(Fruit fruit) {
		super();
		this.fruit = fruit;
	}

	@Override
	public void run() {

		
			while(true) {
				
				synchronized(fruit) {
					if(fruit.isExsit()) {
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
					System.out.println(fruit.getName()+"��ˮ����");
					fruit.setExsit(true);
					fruit.notify();
					
				}
			}
	}
}
