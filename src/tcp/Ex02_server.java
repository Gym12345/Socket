package tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Ex02_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(12346);
		System.out.println("waiting connection");
		
		Socket socket =server.accept();
		System.out.println("client is connected");
		InputStream in=socket.getInputStream();
		DataInputStream dis=new DataInputStream(in);
		String readData=dis.readUTF();
		System.out.println("incoming data:"+readData);
		System.out.println("from"+socket.getInetAddress());

		System.out.println("enter String for sending to client:");
		Scanner input=new Scanner(System.in);
		String sendDataToClient=input.next();
		OutputStream out=socket.getOutputStream();
		DataOutputStream dos=new DataOutputStream(out);//보조 스트림
		dos.writeUTF(sendDataToClient);
		
		dos.close();out.close();socket.close();dis.close();in.close();
		
	}
	
}
