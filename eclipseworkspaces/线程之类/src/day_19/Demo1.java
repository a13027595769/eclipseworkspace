package day_19;

import java.io.File;

public class Demo1 {
	public static void main(String[] args) {
		File dir = new File("C:\\Users\\���\\Desktop\\123");
		//���Ŀ¼�µ������ļ�
		File[] fs = dir.listFiles();
		//��Ҫ���滻����ɾ��������
		String deleteText = "��С����ʦ";
		for (File file : fs) {
			//����ļ������ְ��������ַ����е�����
			if(file.getName().contains(deleteText)) {
				//������Ķ��������滻�ˣ�
				String newFile = file.getName().replaceAll(deleteText, "hh");
				file.renameTo(new File(dir,newFile));
			}
		}
	}
}
