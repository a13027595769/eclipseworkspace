package ���Ͽ��;

import java.util.ArrayList;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		//����integer���͵ķ���
		List<Integer> list1 = new ArrayList<>();
		
		list1.add(123);
		
		List list2 = null;
		list2 = list1;//��ʱ���ͱ�����
		list2.add("ABC");
		List<String> list3 = null;
		list3 = list2;
		//�ȼ��� String num = 123;
		String num = list3.get(0);
		System.out.println(num);
		
		
		
	}
}
