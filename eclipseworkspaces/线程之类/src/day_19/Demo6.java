package day_19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Demo6 {
	public static void main(String[] args) {
		File f = new File("file/stream.txt");
		File f1 = new File("file/stream1.txt");
		
		try(
				//java7�¹���
				InputStream in = new FileInputStream(f);
				OutputStream out = new FileOutputStream(f1);
				)
		
		
		{
			
			byte[] buffer = new byte[1024];
			int len = -1;
			while((len = in.read(buffer)) != -1) {
				out.write(buffer, 0, len);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
