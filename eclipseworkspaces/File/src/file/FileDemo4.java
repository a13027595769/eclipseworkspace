package file;

import java.io.File;

public class FileDemo4 {
	public static void main(String[] args) {
		//�г�ϵͳ�ĸ����̷�
		File[] files = File.listRoots();
		for(File f:files) {
			System.out.println(f);
		}
		//���ָ��Ŀ¼�µ����ļ�ֻ�����ļ������һ��в㼶��ϵ
		File file = new File("C:\\Users\\���\\Desktop\\js��ϰ�õ�");
		File[] files1 = file.listFiles();
		for(File s : files1)
		{
			System.out.println(s);
		}
		//����������ļ������֣��͵����Ĵ�ӡ����
		String[] fils2 = file.list();
		for(String s1 : fils2) {
			System.out.println(s1);
		}
	}
}
