package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
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
		
		

		FileWriter fw = null;
		try {
			//ֱ����FieWriter������Ӿ����ˣ������ô����ļ���
			
			fw =  new FileWriter("a.txt");
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
