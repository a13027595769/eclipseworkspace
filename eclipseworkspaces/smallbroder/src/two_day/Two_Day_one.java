package two_day;

public class Two_Day_one {
	 
	 
	 public static void main(String[] args){
		 TestPerson p =new TestPerson ("����",18,'��');
			System.out.println(p.name);
			System.out.println(p.age);
			System.out.println(p.gender);
		}
		

}		
 class TestPerson{
	 String name;
		
		int age;
		
		char gender;
		/*
		 *��������
		 *�﷨:
		 * public ����  (�������� ������,....){
		 *
		 *}
		 *Ŀ��:�������� 
		 *���У�public Ҳ���� private,���Ǳ�����  
		 *�ص㣺
		 *1,������������һ��
		 *2,����û�з���ֵ,û��void
		 *3���������п���;
		 * */
		public TestPerson (String name,int age , char gender){
			this.name=name;		
			this.age=age;
			this.gender=gender;
			System.out.println("����������");
		}
		
		
		public void introduce(){
			System.out.println("����"+name+"    ���䣺"+age+"    �Ա�"+gender);
		
	}
}	

