package properties;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Set;

public class Demo4 {
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
		try {//����������������̨
		 pw = new PrintWriter("propertise1.txt");
		 pro.list(pw);
		 
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(pw!=null) {
				pw.close();
			}
		}
		
	}
}
