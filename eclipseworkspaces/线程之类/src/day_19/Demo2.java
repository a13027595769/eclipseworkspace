package day_19;

import java.io.File;
import java.io.FilenameFilter;

public class Demo2 {
	public static void main(String[] args) {
		//�ļ�������
		File dir = new File("C:\\Users\\���\\Desktop\\123");
//		String[] str = dir.list();
		File[] fs = dir.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				//�ڶ�������name����list()�����涼���б���ļ���ǰ�����·������������������൱����һ��·����
				//�������ļ���������.avi��β�ͷ���true ���򷵻�false  ����true�ͷ������б�false�Ͳ�����
				return new File(dir,name).isFile()&&name.endsWith(".avi");
			}
		});
		for (File file : fs) {
			System.out.println(file);
		}
	}
}
