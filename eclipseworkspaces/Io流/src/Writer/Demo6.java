package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo6 {
	public static void main(String[] args){


		FileWriter fw = null;
		try {
			
			/**
			 * ����Ϊ�˼��ݼ��±�����\r\n  \rҪ��ǰ��
			 */
			//�����Ҫflushһ�£��������Ĳ���ʮ���Ļ��Ͳ������ˣ����Ի�����һ����������
			//��ʵ�����Ҳ�ǿ��Եģ���Ϊ�����close�ڵ��õ�ʱ����Զ�����flush�������ǽ������һ�¡�
			
			
			fw =  new FileWriter("Text.txt"); 
			char[] cs = {'a','b','c','d'};
			fw.write(cs);
			//����һ�����ַ����飬�ڶ����������������������ǳ���
			fw.write(cs, 1, 2);
			fw.flush();
			//ת���ַ��ˣ�ascll����
			fw.write(100);
			fw.write("100");
			fw.write("helloworld", 2, 2);
			
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
