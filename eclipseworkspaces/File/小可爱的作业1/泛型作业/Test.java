package sss;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		StudentManagement sm = new StudentManagement();
		Student s1 = new Student(1, "����");
		Student s2 = new Student(2, "����");
		Student s3 = new Student(3, "����");
		sm.addStu(s1);
		sm.addStu(s2);
		sm.addStu(s3);
		while(true){
		System.out.println("��ѡ����\n1.���ѧ��\n2.��ѯѧ��\n3.��ѯ����ѧ��"
			+ "\n4.ɾ��ѧ��\n5.�޸�ѧ��\n����0�˳�");
		int i=input.nextInt();
		switch(i){
		case 1:
			System.out.println("������ѧ��������");
			String name=input.next();
			Student b = new Student(sm.list.size()+1, name);
			sm.addStu(b);
			continue;
		case 2:
			System.out.println("�������ѯѧ���ñ��");
			int id=input.nextInt();
			sm.queryOneStu(id-1);
			continue;
		case 3:
			sm.queryALLStu();
			continue;
		case 4:
			System.out.print("������ɾ��ѧ���ñ�ţ�");
			int id1=input.nextInt();
			sm.deleteStu(id1-1);
			continue;
		case 5:
			System.out.print("�������޸�ѧ���ñ�ţ�");
			int id2=input.nextInt();
			System.out.print("�������޸�ѧ����������");
			String name1=input.next();
			sm.updateStu(id2-1,name1);
			continue;
		case 0:
			break;
		}
		}
//		sm.queryOneStu(1);
//		// ɾ������
//		sm.deleteStu(1);
//		// ��ѯ����ѧ��
//		sm.queryALLStu();
//		// �޸ĵ���
//		sm.updateStu(1, "����");
//		sm.queryALLStu();
		// ��ѯ����ѧ��

	}

}
