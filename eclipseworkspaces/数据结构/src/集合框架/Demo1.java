package ���Ͽ��;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo1 {
	
	protected Object[] elementDate;
	
	protected int elementCount;
	
	static final int a = 10;
	/*
	public Vector(int a) {
		this.elementDate = new Object(a);
	}
	public Vector() {
		this(10); //Vactor��Ĭ������Ϊ10
	}
	�����д洢�Ķ����Ƕ�������ã������Ƕ�����
	
	ջ(Stack):���ݽṹ�е�һ�֣��洢�ص㣺����ȳ�
	
	�ٷ����飺ʹ��ջ����ʹ��ArrayDeque
	
	*/
	public static void main(String[] args) {
		
		/**
		 * ���õļ����ࣺ
		 * set(��):�����еĶ��󲻰��ض��ķ�ʽ���򣬲�����Ԫ���ظ�
		 * list(�б�):�����еĶ���������λ����������Ԫ���ظ�
		 * Map(ӳ��):������ÿһ��Ԫ�ض�����һ��key��value���󣬲�����key�����ظ���ֵ��������ظ�
		 * 
		 * 
		 */
		/**
		 * 
		 * 
		 */
		Deque<Integer> stack = new ArrayDeque<Integer>();
		stack.add(1);
		stack.add(1);
		stack.add(1);
		System.out.println(stack);
	}
	/**
	 * 
	 * 
	 * ArrayList����java���Ͽ�ܳ���֮������ȡ��vector���
	 * ���ߵײ�ԭ���ǻ���������㷨��һģһ��
	 * vector���з�����ʹ����synchronized���η�
	 * ArrayList���з�����û��ʹ��synchronized���η�
	 * ��ʹ�Ժ��ڶ��̻߳����£�����Ҳ��ʹ��vector��
	 * ArrayList list = Collections.synchronizedList(new ArrayList(...))
	 * ArrayLIst����ֵ�������һ����û�в�ѯ�������ǲ��᷵��null�����ǻ᷵��һ���յļ���
	 * 
	 * 
	 */
	/**
	 * 
	 * foreach���Բ�������  �ײ���Ȼʹ��forѭ��+��������ȡ����Ԫ��
	 * foreach���Բ���Iterable��ʵ�����ײ�ʹ�õ�Iterator(������)
	 * ����ǰ��
	 * List list = new ArrayList();
	 * list.add("a");
	 * list.add("b");
	 * list.add("c");
	 * list.add("d");
	 * for(Object ele:list){
	 * 	System.out.println(ele);
	 * }
	 * �����:
	 * List list = new ArrayList();
	 * list.add("a");
	 * list.add("b");
	 * list.add("c");
	 * list.add("d");
	 * Object ele;
	 * for(Iterator iterator = list.iterator();iterator.hasNext();;)
	 * ele = iterator.next();
	 * System.out.println(ele);
	 */
	/**
	 * ����Ҫ�ߵ������ϱ�ɾ��ָ����Ԫ��ʱ��ֻ��ʹ�õ�������
	 * ����ֻ��ʹ�õ�������remove����
	 * ��������ʱ���߳�A�ᵥ������һ���߳�B  �������Ԫ�ظ�������ȥ��A������Bɾ����Bÿ�ζ���ȥ���Ԫ���Ƿ������ͬ
	 * ���ǵĻ��ͻᱨ��
	 * list�е�removeֻ�ܴӼ�����ɾ��������ɾ���������е�Ԫ�أ�
	 * ������ʹ��Iterator�е�remove
	 * �÷�����������߳���	ͬʱ�Ƴ���ɾ����Ԫ�أ���֤�����̵߳�ͬ��
	 * 
	 * Iterator it = list.iterator();
	 * while(it.hasNext){
	 * Object ele = it.next();
	 * if("B".equals(ele)){
	 * 	//list.remove(ele)���󣬲���ʹ�ü��϶����remove����		
	 * it.remove()
	 * }
	 * } 
	 * 
	 */
}
