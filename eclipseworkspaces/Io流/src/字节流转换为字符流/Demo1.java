package �ֽ���ת��Ϊ�ַ���;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Demo1 {
	public static void main(String[] args) {
		//System���е�����  in����ֵ�� static  InputStreamҲ������������
		
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		BufferedWriter bw = null;
		String line = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("b.txt"));
			//��Ϊnull�Ϳ���һֱ����
			while((line = br.readLine())!=null) {
				//����exit���˳�
				if("exit".equals(line)) {
					break;
				}
				//����һ������
				bw.write(line);
				//����֮��һ��
				bw.newLine();
				//һ��Ҫ�������
				bw.flush();
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
}
}