package map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	public static void main(String[] args) {
		
		/**
		 * Map���ص㣺
		 * ���ݳɶԳ���
		 * ���ݵļ���Ψһ��
		 * һ����ֻ�ܶ�Ӧһ��ֵ
		 * ֵ�����ظ�
		 * ������һ��Ϊ�գ�ֵ���Զ���ǿ�
		 * ������
		 * put()
		 * putAll()
		 * remove()
		 * clear()
		 * 
		 * get()
		 *  Set<k>   keySet
		 *  
		 *  �жϹ��ܣ�
		 *  containsKey()
		 *  containsValue()
		 *  isEmpty()
		 *  
		 *  
		 *  ������ʽ��
		 *  Set<Entry<String,Person>> entry = map.entrySet();
		 *  for(Entry<String,Person> sp:entry){
		 *  	String key = sp.getKey();
		 *  	Person value = sp.getValue();
		 *  System.out.println("����"+key+"   ֵ:"+value);
		 *  
		 *  }
		 *  HashMap:
		 *  
		 *  HashMap��map��ʵ����
		 *   ������nullֵ��null��
		 *   Hashmap�е�Ԫ��û��˳��
		 *   hashmap�����̰߳�ȫ��
		 *   Map<String,String> map = new HashMap<String,String>();
		 *   map = Collections.synchronizedMap(map);
		 *   �����ͱ�����̰߳�ȫ��
		 *   
		 *   Treemap��
		 *   ���Խ�����Ȼ����
		 *   ���Դ���comparetor�������򣬿�����дcompareto��������
		 *   
		 *   key����Ϊnull�������ظ�
		 *   
		 *   
		 *   HashTable��
		 *   ���������κ�nullֵ��null��
		 *   
		 *   HashTable�е�Ԫ��û��˳��
		 *   ���̰߳�ȫ��
		 *   
		 *   LinkedHashMap:
		 *   
		 *   ��˳��
		 *   ������nullֵ��null��
		 *   �����̰߳�ȫ��
		 *   
		 *  
		 *  
		 */
		Map<String,String> map = new HashMap<String,String>();
		map.put("������","ʱǨ");
		map.put("����","����");
		//����Ψһ�ģ������������ڸ��ǵ����
		map.put("����","�����");
		
		
	}
}
