package buyTiket;

public class TicketTest3 {
	
	public static void main(String[] args) {
		SaleTicket3 st1 = new SaleTicket3("����1");
		SaleTicket3 st2 = new SaleTicket3("����2");
		SaleTicket3 st3 = new SaleTicket3("����3");
		SaleTicket3 st4 = new SaleTicket3("����4");
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
