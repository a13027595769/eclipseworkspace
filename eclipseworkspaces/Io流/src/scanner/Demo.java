package scanner;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		//����ѧ���ļ���
		TreeSet<Student> ts = new TreeSet<Student>();
		
		//����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ��������");
		int count = sc.nextInt();
		for(int i=0;i<count;i++) {
			sc = new Scanner(System.in);
			System.out.println("������ѧ��������");
			//ѧ��������
			String name = sc.nextLine();
			//ѧ��������
			System.out.println("������ѧ��������");
			Integer age = sc.nextInt();
			System.out.println("������ѧ����ID");
			Integer id = sc.nextInt();
			Student s = new Student();
			s.setId(id);
			s.setAge(age);
			s.setName(name);
			ts.add(s);
		}
		
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("f.txt"));
			for(Student s:ts) {
			bw.write(s.getName()+"---------"+s.getAge()+"---------"+s.getId());
				bw.newLine();
			}
			bw.flush();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			if(bw != null)
			{
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println("ojbk");
	}
}
