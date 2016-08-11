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
 * 基于TCP协议的socket通信
 * @author lenovo
 *
 */
public class server {
	public static void  main(String[] args){
		try {
			ServerSocket serverSocket=new ServerSocket(8888);
			Socket socket=null;
			int count=0;
			System.out.println("****服务器即将启动。等待客户端的连接****");
			
			while(true){
				socket=serverSocket.accept();
				ServerThread serverThread=new ServerThread(socket);
				serverThread.start();
				
				count++;
				System.out.println("客户端的数目是："+count);
				InetAddress address=socket.getInetAddress();
				System.out.println("客户端的IP地址为："+address.getHostAddress());
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
