package buyTiket;

public class TicketTest4 {
	
	public static void main(String[] args) {
		SaleTicket4 st1 = new SaleTicket4();
		Thread t1 = new Thread(st1,"����1");
		SaleTicket4 st2 = new SaleTicket4();
		Thread t2 = new Thread(st1,"����2");
		SaleTicket4 st3 = new SaleTicket4();
		Thread t3 = new Thread(st1,"����3");
		SaleTicket4 st4 = new SaleTicket4();
		Thread t4 = new Thread(st1,"����4");
		
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
