package reflect;

public class Demo2 {
	public static void main(String[] args) {
		Class i = int.class;
		
		Class<Boolean> b = boolean.class;
		//int��Integer�ǲ�ͬ����������
		System.out.println(Integer.class == int.class);
//		doWork(10);
		System.out.println(Integer.TYPE == int.class);
		
		
		int[] arr1 = {1,2,3};
		Class cl = arr1.getClass();
		Class cl1  = int[].class;
		//���еľ�����ͬ��ά������ͬ��Ԫ�����͵����鹲��ͬһ���ֽ�����󣬺�Ԫ��û�й�ϵ
		System.out.println(cl.getClass() == cl1.getClass());
	}
	 public static void doWork(int a) {
		 System.out.println("hh");
	 }
	 public static void doWork(Integer a) {
		 System.out.println("hhhhhh");
	 }
}
