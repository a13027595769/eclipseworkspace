package file;

import java.io.File;

public class FileDemo6 {
	public static int level = 1;
	public static void main(String[] args) {
		File file = new File("C:\\Users\\���\\Desktop\\17�����š��ƶ�רҵJavaScript�����ҵ");
		printFile(file);
		
	}
	/**
	 * �����ļ����µ������ļ�
	 */
	public static void printFile(File file) {
		if(!file.isDirectory()) {
			return;
			//viod ��ʱ��ֱ�Ӽ�return�ͽ�����
		}
		if(!file.exists()) {
			return;
		}
		level++;
		//�����ļ����ڲ����ļ�
		File[] files  = file.listFiles();
		for(File file1:files) {
			for(int i=0;i<level;i++) { 
				System.out.print("\t");
				
				//!!!������print������println!!!!
			}
			String name = file1.getName();
			System.out.println(name);
			printFile(file1);
			/*
			if(file1.isDirectory()) {
				//�ݹ����
				printFile(file1);
			}
			*/
			
		}
		
		level--;
	}
}
