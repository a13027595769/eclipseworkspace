package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
		
	
	public static void main(String[] args) {
		/**
		 * map��ʵ����HashMap
		 * 1.������nullֵ��һ��null��
		 * 2.HashMap�е�Ԫ��û��˳�򣨸���ӵ�˳���޹أ�
		 * 3.HashMap�����̰߳�ȫ��
		 */
		Map<String,String> map = new HashMap<String,String>();
		map.put("������", "ʱǨ");
		map.put("������", "�ν�");
		map.put("��ʱ��", "�ν�");
		map.put("����", "����");
		System.out.println(map);
		
	}
}
