package file;

import java.io.File;

public class FileDemo {

	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\���\\Desktop\\java�쳣����");
//		����ľ���·��
		System.out.println(file);
		
		File file1 = new File("C:/","Users\\���\\Desktop\\java�쳣����");
		System.out.println(file1);
		
		
	}
}