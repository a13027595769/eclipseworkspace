package file;

import java.io.File;

public class FileDemo {

	
	public static void main(String[] args) {
		File file = new File("C:\\Users\\侯江涛\\Desktop\\java异常例子");
//		输出的就是路径
		System.out.println(file);
		
		File file1 = new File("C:/","Users\\侯江涛\\Desktop\\java异常例子");
		System.out.println(file1);
		
		
	}
}
