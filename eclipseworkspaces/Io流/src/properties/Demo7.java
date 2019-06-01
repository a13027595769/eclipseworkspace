package properties;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Demo7 {
	public static void main(String[] args) {
		
		/**
		 * java.lang.Object
  			�̳��� java.util.Dictionary<K,V>
      			�̳��� java.util.Hashtable<Object,Object>
          			�̳��� java.util.Properties
		���Լ���
		 * �������ָ��������ΪAPI�о�û��ָ�����������ֻ�����ַ������ַ�������ָ���ķ���
		 */
		Properties pro = new Properties();
		/**
		 * �Ͱ�Properties����map��ʹ�þ�����
		 */
		pro.setProperty("name", "zhangsan");
		pro.setProperty("age", "18");
		pro.setProperty("gender", "male");
		FileWriter fr = null;
		
	
		try {
			fr = new FileWriter("properties2.txt");
			//���ַ������ݶ���pro������
			pro.store(fr, null);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
