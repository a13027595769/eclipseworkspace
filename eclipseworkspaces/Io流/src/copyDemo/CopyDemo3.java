package copyDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Flushable;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CopyDemo3 {
	public static void main(String[] args) {
		copy();
		System.out.println("done");
	}
	public static void copy() {
		Reader reader = null;
		
		Writer writer = null;
		
		
		BufferedReader br = null;
		
		BufferedWriter bw = null;
		try {
			//�����ļ���ȡ����
			reader = new FileReader("src/reader/Demo1.java");
			//�����ļ�д�����
			writer = new FileWriter("Copy1.java");
			
			br = new BufferedReader(reader);
			
			bw = new BufferedWriter(writer);
			
			String line = null;
			while((line = br.readLine()) != null)
				{
					bw.write(line);
					bw.newLine();
				}
			bw.flush();
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(writer != null)
				{
					writer.close();
					if(reader != null) {
						reader.close();
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
