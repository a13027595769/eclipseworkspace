package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args){

		/**
		 * 字符流：我们能读懂的就是字符流，
		 * 字符输入流的超类：Reader   子类：FileReader  BufferedReader
		 * 字符输出流的超类：Writer  子类:FileWriter   BufferedWriter	
		 * 
		 */
		/**
		 * 字节流：我们能读懂的就是字符流，
		 * 字节输入流的超类：InputStream   子类：FileInputStream
		 * 字节输出流的超类：OutputStream  子类:FileOutputStream
		 */
		
		
		File file = new File("a.txt");
		//boolean isSuccess = file.createNewFile();
		FileWriter fw = null;
		try {
			fw =  new FileWriter(file);
			fw.write("helloworld");
			//字符流的特点：清空缓冲区，把内容写入到文件中
			fw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
