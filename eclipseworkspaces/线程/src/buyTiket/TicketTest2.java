package buyTiket;

public class TicketTest2 {
	
	public static void main(String[] args) {
		SaleTicket2 st1 = new SaleTicket2("窗口1");
		SaleTicket2 st2 = new SaleTicket2("窗口2");
		SaleTicket2 st3 = new SaleTicket2("窗口3");
		SaleTicket2 st4 = new SaleTicket2("窗口4");
		/**
		 * 针对线程的安全性问题：我们需要使用同步(就是要加锁，共享资源只能一个人访问)锁。
		 * synchronized(锁对象){
		 * 	//操作共享资源的代码
		 * }
		 * 
		 * 同步代码加在什么地方？
		 * 1.代码被多个线程访问
		 * 2.代码中有共享的数据
		 * 3共享数据被多条语句操作
		 */
		st1.start();
		st2.start();
		st3.start();
		st4.start();
	}

}
