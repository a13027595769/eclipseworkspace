package file;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileDemo3 {
	public static void main(String[] args) {
		/**
		 * 
		 */
		File file = new File("C:\\Users\\���\\Desktop\\js��ϰ�õ�");

		File file1 = new File("js��ϰ�õ�");
		//��ȡ�ļ�����·�����ַ���
		String str = file.getAbsolutePath();
		System.out.println(str);
		String str1 = file.getPath();
		System.out.println(str1);
		
		//��ȡ�ļ�����·�����ַ���
		String str2 = file1.getAbsolutePath();
		System.out.println(str2);
		//��ȡ�ľ������·��
		String str3 = file1.getPath();
		System.out.println(str3);
//		�������·�����ļ�����Ŀ¼�����֣�����׺����
		String str4 = file.getName();
		System.out.println(str4);
		//�����ļ��ĳ��ȣ������ֽ��������
		long length = file.length();
		System.out.println(length);
		//���һ�α��޸ĵ�ʱ��
		long modified = file.lastModified();
		
		Date date = new Date(modified);
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//�ַ������յ�
		String date1 = sdf.format(date);
		System.out.println(date1);
		
		//�ַ���ת��Ϊ����
		String str10 = "1999-02-12 11:11:11";
		try {//ע��һ��Ҫ��ָ���ĸ�ʽƥ��
			Date date2 = sdf.parse(str10);
			System.out.println(date2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
