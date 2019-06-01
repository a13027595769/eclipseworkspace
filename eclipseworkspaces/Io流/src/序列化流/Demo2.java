package ���л���;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Demo2 {
	public static void main(String[] args) {
	//	writeObject1();
		readObject1();
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
			 oos = new ObjectOutputStream(new FileOutputStream("person1.txt"));
			 Person p = new Person();
			 p.setName("����");
			 p.setAge(20);
			 //�������л�����д�뷽��
			 Person p1 = new Person();
			 p1.setName("����");
			 p1.setAge(18);
		
			 Person p2 = new Person();
			 p2.setName("����");
			 p2.setAge(25);
			 oos.writeObject(p);
			 oos.writeObject(p1);
			 oos.writeObject(p2);
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
	public static void writeObject1() {
		/**
		 * �����Ҫ���л�ĳ������������������ʵ��һ���ӿ�Serializable
		 */
		ObjectOutputStream oos = null;
		try {
			//�������л���������
			 oos = new ObjectOutputStream(new FileOutputStream("person1.txt"));
			 ArrayList<Person> al = new ArrayList<Person>();
			 Person p = new Person();
			 p.setName("����");
			 p.setAge(20);
			 //�������л�����д�뷽��
			 Person p1 = new Person();
			 p1.setName("����");
			 p1.setAge(18);
		
			 Person p2 = new Person();
			 p2.setName("����");
			 p2.setAge(25);
			 al.add(p);
			 al.add(p1);
			 al.add(p2);
			 //���ﲻ��Ҫ��ˢ��
			 /**
			  * ����д��ľ��Ǽ���
			  */
			 oos.writeObject(al);
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
			 oos = new ObjectInputStream(new FileInputStream("person1.txt"));
			 
			 //�ӷ����л�����������ȡ����
			 Object obj = oos.readObject();
			 Object obj1 = oos.readObject();
			 Object obj2 = oos.readObject();
			 Person p = (Person)obj;
			 System.out.println(p);
			 System.out.println(obj1);
			 System.out.println(obj2);
			 
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
	public static void readObject1() {
		/**
		 * �����Ҫ���л�ĳ������������������ʵ��һ���ӿ�Serializable
		 */
		ObjectInputStream oos = null;
		try {
			//�������л���������
			 oos = new ObjectInputStream(new FileInputStream("person1.txt"));
			 Object obj = oos.readObject();
			 ArrayList<Person> al = (ArrayList<Person>)obj;
			 for(Person p : al) {
				 System.out.println(p);
			 }
			 /**
			 * 
			 ������ô�ɣ������÷ŵ�һ����������ȥ
			 Object obj = null;
			 while((obj = oos.readObject()) != null)
			 {
				 System.out.println(obj);
			 }
			 */
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
