package data;

public class Demo1 {
	//�洢������Ա�����º���
	private static Integer[] players;
	//������Ա�ĸ���
	private static int size = 0;
	//1.��ʼ����Ϊ5�������б�׼���洢���ϵ�5�����º���
	private static void init(int a) {
		players = new Integer[5];
		
	}
	//���������Ԫ��
	private static void add(Integer playerNum) {
		//����[�±�]  = Ԫ��ֵ
		players[size]  = playerNum;
		size++;
		
	}
	//����ָ����������Ԫ��
	private static Integer get(Integer index) {
		// TODO Auto-generated method stub
		return players[index];
	}
	//����Ԫ�ز���ָ��������
	private static Integer getIndexByPlayerNum(Integer num) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			
		if(players[i].equals(num)) {
			return i;
		}
		
		}
		return -1;
		
	}
	private static void set(int i, Integer j) {
		for(int index = 0;index<size;index++) {
					if(i == index) {
						players[index]=j; 
					}
			
		}
		
	}
	private static void print() {
		if(players == null) {
			System.out.println("null");
			return;
		}
		if(size==0) {
			System.out.println("[]");
			return;
		}
		
		//[11,22,33,44,55]
											//ԭ����5�����֣��ĸ������ټ�������������
		StringBuilder sb = new StringBuilder(size*2+1);
		sb.append("[");
		for(int index = 0;index <size;index++) {
			sb.append(players[index]);
			if(index != size-1) {
				sb.append(",");
			}
			else {
				sb.append("]");
			}
		}
		System.out.println(sb);
		
		
	}
	
	
	public static void main(String[] args) {
		//��ʼ������Ϊ5�������б�
		init(5);
		add(11);
		print();
		
		add(22);
		print();
		add(33);
		add(44);
		add(55);
		print();
		//Integer num = get(2);
		//System.out.println(num);
		
		//Integer index = getIndexByPlayerNum(33);
	//	System.out.println(index);
		
		//Integer index = getIndexByPlayerNum(33);
		//System.out.println(index);
		
		
		set(2,333);
		print();
	}
	private static void divede(int num,int num1) {
		System.out.println("begin");
		if(num1==0) {
			throw new ArithmeticException("����������Ϊ0");
		}
	}
	
	

	
}
