package ������TCP;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClient {
	public static void main(String[] args) {
		Socket s = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		//�����׽��ֶ���
		try {
		s  = new Socket("192.168.1.102",10001);
		
		//��������
		
		OutputStream out = s.getOutputStream();
		//��ôӿ���̨�����������
		br = new BufferedReader(new InputStreamReader(System.in));
		 bw = new BufferedWriter(new OutputStreamWriter(out));
		 String line = null;
		 while((line = br.readLine())!=null) {
			 if("exit".equals(line)) {
				 break;
			 }
			 bw.write(line);
			 bw.newLine();
			 bw.flush();
		 }
		 
		 
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
				try {
					if(bw != null) {
					bw.close();
					}
					if(s != null) {
						s.close();
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
}
