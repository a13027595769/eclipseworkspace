package �ַ����������;

import java.io.UnsupportedEncodingException;

public class Demo1 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "�й�";
		//ʹ��Ĭ�ϱ���
		byte[] gbk = str.getBytes("GBK");
		//ʹ��utf-8������
		byte[] Utf = str.getBytes("UTF-8");
//		��ӡ����ֵ
		printByte(gbk);
		System.out.println(new String(gbk));
		//�������һ�£�������
//		��ӡ��utf-8�����Ӧ���ַ���
		printByte(Utf);
		System.out.println(new String(Utf,"UTF-8"));
	}
	public static void printByte(byte[] bs) {
		for(byte b: bs) {
			System.out.print(b);
		}
	}
}
