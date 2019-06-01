package reflect;

import java.lang.reflect.Method;

class Stu{
	public void doWork() {
		System.out.println("Stu.doWork()");
	}
	public static void  doWork(String name) {
		System.out.println("Stu.doWork()"+name);
	}
	private String doWork(String name,int age) {
		System.out.println("Stu.doWork()"+name+age);
		return name+" "+age;
	}
}


public class Demo4 {
	public static void main(String[] args) throws Exception {
		//getAll();
		getone();
	}

	private static void getone() throws Exception {
		Class<Stu> clz = Stu.class;
		Method m  = clz.getDeclaredMethod("doWork",String.class);
		m.invoke(null,"hh");
		/*
		m = clz.getDeclaredMethod("doWork",String.class,int.class);
		m.setAccessible(true);
		m.invoke(clz.newInstance(),"����",19);
		*/
	}

	private static void getAll() {
		
		Class clz = Stu.class;
		//��ȡ����ͼ̳й���������public�ķ���
		Method[] method = clz.getMethods();
		System.out.println(method.length);
		for (Method method2 : method) {
			System.out.println(method2);
		}
		//����declared�Ϳ��Ի�ȡ�������еķ����ˣ��������̳кͷ���Ȩ���޹�
		 method = clz.getDeclaredMethods();
		System.out.println(method.length);
		for (Method method2 : method) {
			System.out.println(method2);
		}
		
		
	}
}
