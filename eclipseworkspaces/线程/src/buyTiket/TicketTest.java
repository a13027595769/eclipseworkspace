package buyTiket;

public class TicketTest {
	
	public static void main(String[] args) {
		SaleTicket st1 = new SaleTicket("����1");
		SaleTicket st2 = new SaleTicket("����2");
		SaleTicket st3 = new SaleTicket("����3");
		SaleTicket st4 = new SaleTicket("����4");
		/**
		 * ����̵߳İ�ȫ�����⣺������Ҫʹ��ͬ��(����Ҫ������������Դֻ��һ���˷���)����
		 * synchronized(������){
		 * 	//����������Դ�Ĵ���
		 * }
		 * 
		 * ͬ���������ʲô�ط���
		 * 1.���뱻����̷߳���
		 * 2.�������й��������
		 * 3�������ݱ�����������
		 */
		st1.start();
		st2.start();
		st3.start();
		st4.start();
	}

}
