package �ȴ��ͻ���;

public class Test {
	public static void main(String[] args) {
		Fruit fruit = new Fruit();
		//������Ϊfalse
		fruit.setExsit(false);
		fruit.setName("ƻ��");
		ProductFruit pf  = new ProductFruit(fruit);
		Thread t1 = new Thread(pf);
		BuyFruit bf = new BuyFruit(fruit);
		Thread t2 = new Thread(bf);
		t1.start();
		t2.start();
		
		
		
	}
}
