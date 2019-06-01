package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args){

		/**
		 * �ַ����������ܶ����ľ����ַ�����
		 * �ַ��������ĳ��ࣺReader   ���ࣺFileReader  BufferedReader
		 * �ַ�������ĳ��ࣺWriter  ����:FileWriter   BufferedWriter	
		 * 
		 */
		/**
		 * �ֽ����������ܶ����ľ����ַ�����
		 * �ֽ��������ĳ��ࣺInputStream   ���ࣺFileInputStream
		 * �ֽ�������ĳ��ࣺOutputStream  ����:FileOutputStream
		 */
		
		
		File file = new File("a.txt");
		//boolean isSuccess = file.createNewFile();
		FileWriter fw = null;
		try {
			fw =  new FileWriter(file);
			fw.write("helloworld");
			//�ַ������ص㣺��ջ�������������д�뵽�ļ���
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
