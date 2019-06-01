package com.zz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListPersonManagementImpl {
	List <Person> pList=new ArrayList();
	List <Person> tList=new ArrayList();
	Person stu=new Student();
	Person tea=new Teacher();
	Scanner input=new Scanner(System.in);
	public void addPerson(Person s1){
		System.out.println("��ѡ�������ʦ����ѧ��1.ѧ��2.��ʦ");
		int a=input.nextInt();
		if(a==1){
			System.out.println("������ѧ���ı�ţ�");
			int b=input.nextInt();
			System.out.println("������ѧ����������");
			String c=input.next();
			System.out.println("������ѧ�������䣺");
			int d=input.nextInt();
			Person ps=new Student(b,c,d);
			pList.add(ps);
		}else if(a==2){
			System.out.println("��������ʦ�ı�ţ�");
			int b=input.nextInt();
			System.out.println("��������ʦ��������");
			String c=input.next();
			System.out.println("��������ʦ�����䣺");
			int d=input.nextInt();
			Person ps2=new Teacher(b,c,d);
			tList.add(ps2);
		}else{
			System.out.println("��������ȷ������");
		}
	}
	public void queryOnePerson(int id){
		System.out.println("��ѡ���ѯѧ��������ʦ��1.ѧ��2.��ʦ");
		int a=input.nextInt();
		if(a==1){
			Student s=(Student) pList.get(1);
			if(s.getId()==a){
				pList.get(a);
			}
		}else if(a==2){
			Teacher y=(Teacher) tList.get(1);
			if(y.getId()==a){
				tList.get(a);
			}
		}else{
			System.out.println("��������ȷ������");
		}
	}
	public void queryAllPersons(){
		System.out.println("ѧ��\n");
		for(Person p:pList){
			p.print();
		}
		System.out.println("-------------------------");
		System.out.println("��ʦ\n");
		for(Person t:tList){
			t.print();
		}
	}
	public void deleteOnePerson(int id){
		System.out.println("��ѡ��ɾ��ѧ��������ʦ��1.ѧ��2.��ʦ");
		int a=input.nextInt();
		if(a==1){
			Student s=(Student) pList.get(1);
			if(s.getId()==a){
				pList.remove(a);
			}
		}else if(a==2){
			Teacher y=(Teacher) tList.get(1);
			if(y.getId()==a){
				tList.remove(a);
			}
		}else{
			System.out.println("��������ȷ������");
		}
	}
	public void updateOnePerson(int id,String newName){
		System.out.println("��ѡ�����ѧ��������ʦ��1.ѧ��2.��ʦ");
		int a=input.nextInt();
		if(a==1){
			Student s=(Student) pList.get(1);
			if(s.getId()==a){
				((Person) pList.get(id)).setName(newName);
			}
		}else if(a==2){
			Teacher y=(Teacher) tList.get(1);
			if(y.getId()==a){
				((Person) tList.get(id)).setName(newName);
			}
		}else{
			System.out.println("��������ȷ������");
		}
	}
}
