package tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex01_client {
	public static void main(String[] args) throws Exception  {
		
		Socket socket=new Socket("192.168.42.92",12345);
		System.out.println("client running");
		
		OutputStream os=socket.getOutputStream();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter number:");
		
		int data = input.nextInt();
		
		os.write(data);
		os.close();
		socket.close();
		
		
	}

}
