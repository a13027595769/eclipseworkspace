package buyTiket;

public class TicketTest2 {
	
	public static void main(String[] args) {
		SaleTicket2 st1 = new SaleTicket2("����1");
		SaleTicket2 st2 = new SaleTicket2("����2");
		SaleTicket2 st3 = new SaleTicket2("����3");
		SaleTicket2 st4 = new SaleTicket2("����4");
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
