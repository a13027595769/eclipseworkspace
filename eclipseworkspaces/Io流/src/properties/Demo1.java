package properties;

import java.util.Properties;

public class Demo1 {
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
		System.out.println(pro);
		String xingzhe = pro.getProperty("����");
		String gushangzao = pro.getProperty("������");
		String hubaoyi = pro.getProperty("������");
		System.out.println(xingzhe);
		System.out.println(gushangzao);
		System.out.println(hubaoyi);
		
	}
}
