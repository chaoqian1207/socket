package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����TCPЭ���socketͨ��
 * @author lenovo
 *
 */
public class server {
	public static void  main(String[] args){
		try {
			ServerSocket serverSocket=new ServerSocket(8888);
			Socket socket=null;
			int count=0;
			System.out.println("****�����������������ȴ��ͻ��˵�����****");
			
			while(true){
				socket=serverSocket.accept();
				ServerThread serverThread=new ServerThread(socket);
				serverThread.start();
				
				count++;
				System.out.println("�ͻ��˵���Ŀ�ǣ�"+count);
				InetAddress address=socket.getInetAddress();
				System.out.println("�ͻ��˵�IP��ַΪ��"+address.getHostAddress());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
