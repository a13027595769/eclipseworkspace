package �쳣;

public class Test1 {

	public static void main(String[] args) {
		
		//Exception: �쳣����ɺ���������ж�ִ��
		
		int m=10,n=0;
		//java.lang.ArithmeticException �����쳣
		//System.out.println(m/n);
		System.out.println(1);
		
		String s=null;
		//java.lang.NullPointerException  ��ָ���쳣
		//int len=s.length();
		System.out.println(2);
		
		int[] arr={12,13,24};
		//java.lang.ArrayIndexOutOfBoundsException  �����±�Խ���쳣
		//int ele=arr[3];
		System.out.println(3);
		
		String str="aaaa";
		// java.lang.StringIndexOutOfBoundsException �ַ����±�Խ���쳣
		char ch=str.charAt(4);
		System.out.println(4);

	}

}
