package moniJuit4;

public class EmployeDao {
	@MyBefore
	public void init() throws Exception {
		System.out.println("��ʼ��");
	}
	@MyAfter
	public void destory() throws Exception {
		System.out.println("����");

	}
	@MyTest
	public void testSave() throws Exception {
		System.out.println("���Ա���");

	}
	@MyTest
	public void teseDelete() throws Exception {
		System.out.println("����ɾ��");

	}
}
