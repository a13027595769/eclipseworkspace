package Writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo5 {
	public static void main(String[] args){


		FileWriter fw = null;
		try {
			//ֱ����FieWriter������Ӿ����ˣ������ô����ļ���
			//������������׷�ӣ����ǵĻ����Ǹ����� 
			/**
			 * ����Ϊ�˼��ݼ��±�����\r\n  \rҪ��ǰ��
			 */
			fw =  new FileWriter("b.txt",true); 
			for(int i = 0; i < 100 ; i++) {
				fw.write("hello"+i+"\r\n");
				//��һ����ʱ�����һ��
				if(i%10==0) {
					//�ַ������ص㣺��ջ�������������д�뵽�ļ���
					fw.flush();
					
				}
				
			}
			//�����Ҫflushһ�£��������Ĳ���ʮ���Ļ��Ͳ������ˣ����Ի�����һ����������
			//��ʵ�����Ҳ�ǿ��Եģ���Ϊ�����close�ڵ��õ�ʱ����Զ�����flush�������ǽ������һ�¡�
			
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
