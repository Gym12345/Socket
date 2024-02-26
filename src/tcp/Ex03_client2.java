package tcp;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex03_client2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket= new Socket("192.168.42.92",12346);
		
		System.out.println("client2 running");
		
		OutputStream out=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(out);//보조 스트림
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter String:");
		String data = input.next();
		
		
		dos.writeUTF(data);
		
		
		
		socket.close(); out.close();dos.close();
		input.close();
		
	}
}
