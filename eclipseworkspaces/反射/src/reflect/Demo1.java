package reflect;

import java.util.Date;

public class Demo1 {
	public static void main(String[] args) throws Exception {
		//����1����ȡjava.util.Date����ֽ������
		//��ʽһ��ʹ��class����
		Class<java.util.Date> clz = java.util.Date.class;
		//��ʽ2��ͨ�������getClass���������������object�еģ����еĶ��󶼿�����
		Date date = new Date();
		Class<?> clz1 = date.getClass();
		//��ʽ3��ͨ��class���еľ�̬����forName(String className)
		Class<?>clz3 = Class.forName("java.util.Date");
		System.out.println(clz);
		System.out.println(clz1);
		System.out.println(clz3);
		
		
		
	}
}
