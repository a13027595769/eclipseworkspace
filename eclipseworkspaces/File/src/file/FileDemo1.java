package file;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
	public static void main(String[] args) throws IOException  {
		File file = new File("C:\\Users\\���\\Desktop\\java�쳣����\\java");
//		����һ���ļ�
		boolean issuccess  = file.createNewFile();
//		System.out.println(issuccess);
		//����һ��Ŀ¼
//		boolean is  =file.mkdir();
//		System.out.println(is);
		//�����༶Ŀ¼
//		boolean is1  =file.mkdirs();
		//ɾ���ļ������ٻ���վ������Ѫ�Ľ�ѵ
		//ɾ��Ŀ¼�Ļ������������ǿյģ�����ɾ��������ɾ����
		boolean is2  = file.delete();
		System.out.println(is2);
		/**
		 * 
		 */
//		file.exists();�Ƿ����
//		file.isFile();�Ƿ����ļ�
//		file.isAbsolute()�Ƿ��Ǿ���·��
//		file.isDirectory();�Ƿ���Ŀ¼
//		file.canWrite();�Ƿ��д
//		file.canRead();�Ƿ�ɶ�
//		file.isHidden();�Ƿ�����
//		��ָ���̷��Ļ����������·��������ڹ�����˵��
		File file1 = new File("a.txt");
		file1.createNewFile();
		
		
		
		File[] s   = file.listRoots();
		System.out.println(s);
	}
}
