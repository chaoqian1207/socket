package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class test1 {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address =InetAddress.getLocalHost();
		System.out.println("计算机名称："+address.getHostName());
		System.out.println("IP地址："+address.getHostAddress());
		byte[] bytes=address.getAddress();
		System.out.println("字节数组形式的IP："+Arrays.toString(bytes));
		
		InetAddress address1=InetAddress.getByName("晁倩");
		System.out.println("计算机名称："+address1.getHostName());
		System.out.println("IP地址："+address1.getHostAddress());
	}

}
