package reflect;
class Person{
	public Person() {
		System.out.println("�޲���������");
	}
	public Person(String name) {
		
		System.out.println("һ������������");
	}
	private Person(String name,int age) {
		
		System.out.println("��������������");
	}
}
public class Demo3 {
	public static void main(String[] args) throws Exception {
//		��ͳ��ʽ
//		new Person();
		Class<Person> clz = Person.class;
		//��һ���������޲����������Ϳ���ֱ��ʹ������newinstance����
		clz.newInstance();
		java.lang.reflect.Constructor<Person> con = clz.getConstructor();
		Person p =  con.newInstance();
		System.out.println(p);
		con = clz.getConstructor(String.class);
		con.newInstance("hhh");
		con = clz.getDeclaredConstructor(String.class,int.class);
		con.setAccessible(true);
		con.newInstance("aa",17);
		
		
	}
}	
