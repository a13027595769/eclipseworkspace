package properties;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

public class Demo2 {
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
		pro.setProperty("����","����");
		pro.setProperty("������","ʱǨ");
		pro.setProperty("������","�ν�");
		PrintWriter pw = null;
		try {
		 pw = new PrintWriter(new FileWriter("properties.txt"),true);
		 Set<Object> keys = pro.keySet();
		 for(Object obj:keys) {
			 String key = (String) obj; 
			 String value = pro.getProperty(key);
			 pw.println(key+"======"+value);
		 }
		 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(pw!=null) {
				pw.close();
			}
		}
		
	}
}
