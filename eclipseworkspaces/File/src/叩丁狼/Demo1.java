package ߵ����;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		//������Էָ���:
		String pathSeparator = 	File.pathSeparator;
		
		char patSeparatorChar = File.pathSeparatorChar;
		
		System.out.println(pathSeparator);
		System.out.println(patSeparatorChar);
		
		//���·���ָ���
		String seperator = File.separator;
		char seperatorChar = File.separatorChar;
		System.out.println(seperator);
		System.out.println(seperatorChar);
		/*
		 * 
				boolean isAbsolute() 
			          ���Դ˳���·�����Ƿ�Ϊ����·������ 
			 boolean isDirectory() 
			          ���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼�� 
			 boolean isFile() 
			          ���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ��� 
			 boolean isHidden() 
			          ���Դ˳���·����ָ�����ļ��Ƿ���һ�������ļ��� 
			 long lastModified() 
			          ���ش˳���·������ʾ���ļ����һ�α��޸ĵ�ʱ�䡣 
			 long length() 
			          �����ɴ˳���·������ʾ���ļ��ĳ��ȡ� 

		  */
		
		/*
		 * 
					 
			 boolean canExecute() 
			          ����Ӧ�ó����Ƿ����ִ�д˳���·������ʾ���ļ��� 
			 boolean canRead() 
			          ����Ӧ�ó����Ƿ���Զ�ȡ�˳���·������ʾ���ļ��� 
			 boolean canWrite() 
			          ����Ӧ�ó����Ƿ�����޸Ĵ˳���·������ʾ���ļ��� 
			 int compareTo(File pathname) 
			          ����ĸ˳��Ƚ���������·������ 
			 boolean createNewFile() 
			          ���ҽ��������ھ��д˳���·����ָ�����Ƶ��ļ�ʱ�����ɷֵش���һ���µĿ��ļ��� 
			static File createTempFile(String prefix, String suffix) 
			          ��Ĭ����ʱ�ļ�Ŀ¼�д���һ�����ļ���ʹ�ø���ǰ׺�ͺ�׺���������ơ� 
			static File createTempFile(String prefix, String suffix, File directory) 
			           ��ָ��Ŀ¼�д���һ���µĿ��ļ���ʹ�ø�����ǰ׺�ͺ�׺�ַ������������ơ� 
			 boolean delete() 
			          ɾ���˳���·������ʾ���ļ���Ŀ¼�� 
			 void deleteOnExit() 
			          ���������ֹʱ������ɾ���˳���·������ʾ���ļ���Ŀ¼�� 
			 boolean equals(Object obj) 
			          ���Դ˳���·��������������Ƿ���ȡ� 
			 boolean exists() 
			          ���Դ˳���·������ʾ���ļ���Ŀ¼�Ƿ���ڡ� 

		 */
		
	}
}
