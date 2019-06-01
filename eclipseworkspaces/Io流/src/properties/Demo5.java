package properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Demo5 {
	public static void main(String[] args) {
		
		/**
		 * java.lang.Object
  			�̳��� java.util.Dictionary<K,V>
      			�̳��� java.util.Hashtable<Object,Object>
          			�̳��� java.util.Properties
		���Լ���
		 * �������ָ��������ΪAPI�о�û��ָ��
		 */
		Properties pro = new Properties();
		FileReader fr = null;
		
	
		try {
			//ʵ����Ŀ��ʹ��properties���洢���ݣ�����TXT
			fr = new FileReader("src/prop.properties");
			//���ַ������ݶ���pro������
			pro.load(fr);
			String name = pro.getProperty("zhangshan");
			String age = pro.getProperty("lisi");
			String gender = pro.getProperty("wangwu");
			/**
			 * ������Ǽ�����Ķ�����������������Լ�д�Ķ���Ҳ�ᱻ��ȡ����
			 */
			System.out.println(name);
			System.out.println(age);
			System.out.println(gender);
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fr!=null) {
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
