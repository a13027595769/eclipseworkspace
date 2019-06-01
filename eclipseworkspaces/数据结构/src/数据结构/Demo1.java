package ���ݽṹ;

import java.util.Arrays;

public class Demo1 {
	//�洢������Ա�����º���
	private static Integer[] players;
	//������Ա�ĸ���
	private static int size = 0;
	//1.��ʼ����Ϊ5�������б�׼���洢���ϵ�5�����º���
	private static void init(int a) {
		if(a<0) {
			throw new IllegalArgumentException("�ף���������Ϊ����");
		}
		players = new Integer[a];
		
	}
	//���������Ԫ��
	private static void add(Integer playerNum) {
		//����[�±�]  = Ԫ��ֵ
		if(size == players.length) {
			//������˾���Ҫ���ݣ������ǰ�Ԫ����������������ٷ���һ���µ����飬�ڰ�ԭ����������ñ���µ���������ˣ�ԭ���ĻᱻJVM�����յ���
		Integer[] temp = Arrays.copyOf(players, players.length * 2);
			players = temp;
		}
		
		players[size]  = playerNum;
		size++;
		
	}
	//����ָ����������Ԫ��
	private static Integer get(Integer index) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("����Խ��");
		}
		// TODO Auto-generated method stub
		return players[index];
	}
	//�������±�Ų�������
	private static int getIndexByPlayerNum(Integer num) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			
		if(players[i].equals(num)) {
			return i;
		}
		
		}
		return -1;
		
	}
	//��ָ�������ĵط���Ԫ���滻Ϊ�µ�Ԫ��
	private static void set(int index,Integer playerNumber) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("����Խ��");
		}
		players[index] = playerNumber;
		
	}
	//����Ԫ�ص�ֵ����ȡ�µ�ֵ
	private static void update(Integer old,Integer New) {
		//���ݴ���ֵ����ȡ������
		int index = getIndexByPlayerNum(old);
		if(index>=0) {
			//���ݻ�õ����������滻���µ�Ԫ��
			set(index,New);
		}
		//������˵����ͨ�����������������ʵ�ֵģ�һ���ǻ����������ͨ���������ı�Ԫ��
		
	}
	//�Ƿ�Ϊ��
	 public boolean isEmpty() {
		 return size==0;
	 }
	 //���
	private static void delete(int index) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("����Խ��");
		}
		for(int i=index;i<size-1;i++) {
			//index +1 �ƶ���indexλ��
			players[index] = players[index+1];
		}
		//�����һ��λ�õ�Ԫ�ظ��ƿ�
		players[size-1] = null;
		//�����ȼ�ȥһ
		size--;
	}
	
	//��򵥵ģ���ӡ
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
		StringBuilder sb = new StringBuilder(size*3+1);
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
		
		int index = getIndexByPlayerNum(44);
		System.out.println(index);
	}
	

	
}
