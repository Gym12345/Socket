package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex02_client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket= new Socket("192.168.42.92",12346);
		
		System.out.println("client running");
		
		OutputStream out=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(out);//보조 스트림
		
		Scanner input= new Scanner(System.in);
		System.out.println("enter String:");
		String data = input.next();
		
		
		dos.writeUTF(data);
		
		
		InputStream in=socket.getInputStream();
		DataInputStream dis=new DataInputStream(in);
		String dataFromServer=dis.readUTF(dis);
		System.out.println("dataFromServer:"+dataFromServer);
		
		socket.close(); out.close();dos.close();
		
		
	}
}
