package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		/**
		 * map���ص㣺 1.���ݳɶԳ��� 2.���ݵļ���Ψһ�ģ��������ͬ�Ļᱻ���ǵ� 3.һ����ֻ����һ��ֵ 4.ֵ�����ظ�
		 * 5.��������һ��Ϊ�գ�ֵ���Զ���ǿգ���һ��null���Զ�Ӧ��������null���޷���ȷ��Ӧ��
		 */
		Map<String, String> map = new HashMap<String, String>();
		map.put("������", "ʱǨ");
		map.put("����", "����");
		map.put("��ʱ��", "�ν�");
		map.put("������", "�ν�");
		map.put(null, "����");
		map.put("����", null);
		map.put("�з", null);
		// ֻ����һ��null�������򣬻ᱻ����
//		map.put(null, "��1��");
		System.out.println(map);

		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("������", "³����");
		map1.put("������", "��־");
		// һ��map��ӵ���һ��map��
		map.putAll(map1);
		System.out.println(map);
//		���map
		map1.clear();
		System.out.println(map1);
		// ɾ��һ����ֵ��
		map.remove("������");
		// ͨ����Ӧ�ļ�����ȡֵ
		System.out.println(map);
		// ͨ��get����ȡ��ֵ��  ���û����Ӧ�ļ��ͷ���null
		String a = map.get("������");
		System.out.println(a);
			
		Set<String> set = map.keySet();
		//��������������еļ�
		System.out.println(set);
		for(String key:set) {
			//���ݵ�ǰ��key�����value
			String value  = map.get(key);
			System.out.println(value);
		}
		
		Map<String,Person> map2 = new HashMap<String,Person>();
		
		map2.put("3", new Person(1,"����",1));
		map2.put("2", new Person(1,"������",2));
		System.out.println(map2);
		//�Ƿ����ĳ��ֵ
		boolean iscon = map.containsKey("������");
		System.out.println(iscon);
		boolean isval = map.containsValue("³����");
		System.out.println(isval);
		
		boolean isval1 = map2.containsValue(new Person(1,"����",1));
		System.out.println(isval1);
		
		Set<Entry<String, String>> entry  = map.entrySet();
		for(Entry<String, String> et : entry)
		{		//forѭ�����Լ�������Ǹ�����Ԫ��
			String key1 = et.getKey();
			String value1 = et.getValue();
			System.out.println("����  "+key1+"     ֵ:"+value1);
		}
		
	}
}
