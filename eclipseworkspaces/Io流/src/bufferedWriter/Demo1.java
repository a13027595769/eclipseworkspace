package bufferedWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) {
		wirter();
		
		
	}
	/**
	 * ��Ч������
	 */
	public static void wirter()
	{
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter("d.txt");
			//������Ч�������Ķ���
			bw = new BufferedWriter(fw);
			//�������
			for(int i=0 ; i<10; i ++) {
			bw.write("java̫��ѧ�ˣ�̫����");
//			���У��൱��\r\n
			bw.newLine();
			}
			//��ջ�����
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(bw!=null) {
				try {
					//�رջ��������������Զ��ر�FIlewriter
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
