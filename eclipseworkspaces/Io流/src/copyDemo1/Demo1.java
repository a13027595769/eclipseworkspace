package copyDemo1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo1 {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		copy3();
		long end = System.currentTimeMillis();
		System.out.println("耗时"+(end-start)+"毫秒");
		/**
		 * 总结：
		 * 高效缓冲区再加上字节数组复制最快
		 * 不是高效缓冲区，但是有字节数组第二
		 * 高效缓冲区单个字符提取第三
		 * 不是高效缓冲区，单个字符提取最慢 
		 * 
		 * 
		 */
	}
	
	public static void copy() {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("E:/1.chm");
			
			out = new FileOutputStream("E:/新建文件夹/1.chm");
			/**
			 * !!!字符能做到的，字节肯定能做到。字节能做到的，字符不一定能做到
			 * 字节可以拷贝文件，电影，拷贝的时候只要文件名不错就基本上没啥问题
			 */
			
			
			int len = -1;
			while((len=in.read()) != -1) {
				out.write(len);
			}
			out.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
					if(in != null) {
						in.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public static void copy1() {
		InputStream in = null;
		OutputStream out = null;
		
		try {
			in = new FileInputStream("E:/1.chm");
			out = new FileOutputStream("E:/新建文件夹/1.chm");
			
			/**
			 * !!!字符能做到的，字节肯定能做到。字节能做到的，字符不一定能做到
			 * 字节可以拷贝文件，电影，拷贝的时候只要文件名不错就基本上没啥问题
			 */
			int len = -1;
			
			byte[] chs = new byte[1024];
			while((len=in.read(chs)) != -1) {
				out.write(chs, 0, len);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
					if(in != null) {
						in.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public static void copy2() {
		InputStream in = null;
		OutputStream out = null;
		BufferedOutputStream bo = null;
		BufferedInputStream bp = null;
		try {
			in = new FileInputStream("E:/1.chm");
			out = new FileOutputStream("E:/新建文件夹/1.chm");
			bp = new BufferedInputStream(in);
			bo = new BufferedOutputStream(out);
			/**
			 * !!!字符能做到的，字节肯定能做到。字节能做到的，字符不一定能做到
			 * 字节可以拷贝文件，电影，拷贝的时候只要文件名不错就基本上没啥问题
			 */
			int len = -1;
			
			byte[] chs = new byte[1024];
			while((len=bp.read(chs)) != -1) {
				bo.write(chs, 0, len);
			}
			bo.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
					if(in != null) {
						in.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	public static void copy3() {
		InputStream in = null;
		OutputStream out = null;
		BufferedOutputStream bo = null;
		BufferedInputStream bp = null;
		try {
			in = new FileInputStream("E:/1.chm");
			out = new FileOutputStream("E:/新建文件夹/1.chm");
			bp = new BufferedInputStream(in);
			bo = new BufferedOutputStream(out);
			/**
			 * !!!字符能做到的，字节肯定能做到。字节能做到的，字符不一定能做到
			 * 字节可以拷贝文件，电影，拷贝的时候只要文件名不错就基本上没啥问题
			 */
			int len = -1;
			
		
			while((len=bp.read()) != -1) {
				bo.write(len);
			}
			bo.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(out != null) {
				try {
					out.close();
					if(in != null) {
						in.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
