package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address =InetAddress.getLocalHost();
		System.out.println("��������ƣ�"+address.getHostName());
		System.out.println("IP��ַ��"+address.getHostAddress());
		byte[] bytes=address.getAddress();
		System.out.println("�ֽ�������ʽ��IP��"+Arrays.toString(bytes));
		
		InetAddress address1=InetAddress.getByName("��ٻ");
		System.out.println("��������ƣ�"+address1.getHostName());
		System.out.println("IP��ַ��"+address1.getHostAddress());
	}

}
