package ���л���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo1 {
	public static void main(String[] args) {
		//writeObject();
		readObject();
		/**
		 * �����л��Ĺ�����Ҫ�ֶ�ָ��Ҫ���л���serialVersionUID,������������ı����Ȼ���Է����л�������ᱨ��
		 */
	}
	public static void writeObject() {
		/**
		 * �����Ҫ���л�ĳ������������������ʵ��һ���ӿ�Serializable
		 */
		ObjectOutputStream oos = null;
		try {
			//�������л���������
			 oos = new ObjectOutputStream(new FileOutputStream("person.txt"));
			 Person p = new Person();
			 p.setName("����");
			 p.setAge(20);
			 //�������л�����д�뷽��
			 
			 oos.writeObject(p);
			 //���ﲻ��Ҫ��ˢ��
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void readObject() {
		/**
		 * �����Ҫ���л�ĳ������������������ʵ��һ���ӿ�Serializable
		 */
		ObjectInputStream oos = null;
		try {
			//�������л���������
			 oos = new ObjectInputStream(new FileInputStream("person.txt"));
			 
			 //�ӷ����л�����������ȡ����
			 Object obj = oos.readObject();
			 Person p = (Person)obj;
			 System.out.println(p);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		finally {
			if(oos!=null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
