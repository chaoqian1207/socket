package UDPsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class UDPClient {

	public static void main(String[] args) throws IOException {
		//����������ĵ�ַ���˿ںţ�����
		InetAddress address=InetAddress.getByName("localhost");
		int port=8800;
		byte[] data="�û�����admin�����룺123".getBytes();
		DatagramPacket packet=new DatagramPacket(data,data.length,address,port);
		DatagramSocket socket=new DatagramSocket();
		socket.send(packet);
		
		byte[] data2=new byte[1024];
		DatagramPacket packet2=new DatagramPacket(data2,data2.length);
		socket.receive(packet2);//�˷����ڽ��յ����ݱ�֮ǰ��һֱ��������
		String reply=new String(data2,0,packet2.getLength());
		System.out.println("���ǿͻ���,������˵��"+reply);
		socket.close();

	}

}
