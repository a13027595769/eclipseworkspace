package �쳣;

public class Test2 {

	public static void main(String[] args) {
		
		/*
		 * �쳣�� Exception   ����ԭ�������
		 * ���� Error		����  �ϵ�  �ڴ�����  jvm���� ��������
		 */
		//Exception: �쳣����ɺ���������ж�ִ��
		//��ͳ�ķ�ʽ�����쳣
		
		int m=10,n=0;
		//java.lang.ArithmeticException �����쳣
		if(n!=0){
			System.out.println(m/n);
		}else{
			System.out.println("��������Ϊ0");
		}
		
		System.out.println(1);
		
		String s=null;
		//java.lang.NullPointerException  ��ָ���쳣
		if(s!=null){
			int len=s.length();
		}else{
			System.out.println("���ֿ�ָ���쳣��");
		}
		
		System.out.println(2);
		
		int[] arr={12,13,24};
		//java.lang.ArrayIndexOutOfBoundsException  �����±�Խ���쳣
		int i=3;
		if(i<arr.length){
			int ele=arr[i];
		}else{
			System.out.println("�±곬�����ȡֵ��Χ��");
		}
		
		System.out.println(3);
		
		String str="aaaa";
		// java.lang.StringIndexOutOfBoundsException �ַ����±�Խ���쳣
		int j=4;
		if(j<str.length()){
			char ch=str.charAt(j);
		}else{
			System.out.println("�ַ����±�Խ���ˡ�������");
		}
		
		System.out.println(4);

	}

}
