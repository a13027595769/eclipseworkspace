package listDemo;

import java.util.Arrays;

public class MyArrayList {
	//�洢������������
	private Object[] elements = null;
	//�����д洢���ٸ�Ԫ��
	private int size = 0;
	private static final int DEFAULT = 10;
	
	public MyArrayList(int a) {
		if(a<0) {
			throw new IllegalArgumentException("��������Ϊ����");
		}
		elements = new Object[DEFAULT];
	}
	public MyArrayList() {
		this(10);
		//Ĭ�ϵ����в������Ǹ�����������ʼ����Ϊ10
	}
	public void add(Object ele) {
		if(size==elements.length) {
			Object[] temp = Arrays.copyOf(elements, elements.length * 2);
		}
		elements[size] = ele;
		size++;
	}
	
	//����ָ������λ�õ�����
	
	public Object get(int index) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("����Խ��");
		}
		return elements[index];
	}
	//�滻ָ������λ�õ�Ԫ��ֵ
	public void set(int index,Object newEle) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("����Խ��");
		}
		elements[index] = newEle;
	}
	//ɾ��ָ������λ�õ�Ԫ��
	public void remove(int index) {
		if(index<0||index>=size) {
			throw new IllegalArgumentException("����Խ��");
		}
		for(int i=index; i<size-1;i++) {
			elements[i] = elements[i+1];
			
		}
		//���һ��λ�õ�Ԫ���ÿ�
		elements[size - 1] = null;
//		ɾ��֮��Ԫ�صĳ��ȿ϶�Ҫ��ȥ1
		size--;
	}
	
	public String toString() {
		if(elements == null) {
			return "null";
		}
		if(size == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder(size * 2 +1);
		sb.append("[");
		for(int i = 0;i<size;i++) {
			sb.append(elements[i]);
			if(i != size-1) {
				sb.append(",");
			}
			else {
				sb.append("]");
			}
		}
		return sb.toString();
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public void clear() {
		//������Ļ��������¸�ֵ���൱����ա��ٰѳ��ȱ��0
		this.elements = new Object[DEFAULT];
		size=0;
	}
	
}
