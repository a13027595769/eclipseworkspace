package com.zz;

import java.util.Scanner;

public class Interface {
	Scanner input =new Scanner(System.in);
	ListPersonManagementImpl arr=new ListPersonManagementImpl();
	public void ptint(){
	while(true){
		System.out.println("��ѡ����\n1.��ӵ�����Ա\n2. ���ݱ�Ų�ѯ����\n3.��ѯ��������Ϣ"
			+ "\n4.����id��ɾ��ĳ����Ա��Ϣ\n5.����id���޸�name\n����0�˳�");
		int i=input.nextInt();
		switch(i){
		case 1:
			Person pur=new Student();
			arr.addPerson(pur);
			continue;
		case 2:
			System.out.println("�������ѯѧ���ñ��");
			int id=input.nextInt();
			arr.queryOnePerson(id);
			continue;
		case 3:
			arr.queryAllPersons();
			continue;
		case 4:
			System.out.print("������ɾ��ѧ���ñ�ţ�");
			int id1=input.nextInt();
			arr.deleteOnePerson(id1);
			continue;
		case 5:
			System.out.print("�������޸�ѧ���ñ�ţ�");
			int id2=input.nextInt();
			System.out.print("�������޸�ѧ����������");
			String name1=input.next();
			arr.updateOnePerson(id2,name1);
			continue;
		case 0:
			break;
		}
		}
}
}