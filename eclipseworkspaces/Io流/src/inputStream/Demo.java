package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Demo {
	
		public static void main(String[] args) {
			readerFile3();
			// System.out.println("done");
		}
		public static void readerFile() {
			//�����ֽ��������Ķ���
			InputStream in  =null;
			/**
			 * �ַ����ܰ쵽�ģ��ֽ���Ҳ�ܰ쵽��
			 * �ֽ����ܰ쵽�ģ��ַ�����һ���ܰ쵽
			 * �ֽ����ܶ�ȡͼƬ����Ƶ���ֶ����ƵĶ���
			 */
			try {
	/**
	 * �����ֽڶ�ȡ��Ч�ʺܵ�
	 */
			in = new FileInputStream("e.txt");
	
			
				int num = in.read();
				System.out.println(num);
				System.out.println((char)num);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(in!=null) {
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		public static void readerFile1() {
			//�����ֽ��������Ķ���
			InputStream in  =null;
			
			try {
	/**
	 * �����ֽڶ�ȡ��Ч�ʺܵ�
	 */
			in = new FileInputStream("e.txt");
			
			byte[] bs = new byte[1024];
			int len = in.read(bs);
			System.out.println(new String(bs,0,len));
			
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(in!=null) {
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		public static void readerFile3() {
			//�����ֽ��������Ķ���
			InputStream in  =null;
			
			try {
	/**
	 * �����ֽڶ�ȡ��Ч�ʺܵ�
	 */
			in = new FileInputStream("e.txt");
	
			byte[] bs = new byte[1024];
			//�����洩������Ϊ1�Ļ�������������Ϊ1�ĵط������ݵģ�����Ϊ0�ĵط�Ϊ0������ʲôҲû�У�
			//�����������������Ĺ������������ʱ���Ǵ��Ŀ�ʼ�������ʱ��Ҳ�ô��Ŀ�ʼ
			
			int len = in.read(bs, 1, 3);
			System.out.println(len);
			System.out.println(new String(bs,1,len));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				if(in!=null) {
					try {
						in.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
}
