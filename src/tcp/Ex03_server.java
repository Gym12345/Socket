package tcp;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex03_server {
	public static void main(String[] args) throws IOException {
		ServerSocket server=new ServerSocket(12346);
		System.out.println("waiting connection");
		
		Socket socket1 =server.accept();
		System.out.println("socket1 connected");
		Socket socket2 =server.accept();
		System.out.println("socket2 connected");

		InputStream in1=socket1.getInputStream();
		DataInputStream dis1=new DataInputStream(in1);
		String readData1=dis1.readUTF();
		System.out.println("incoming data:"+readData1);
		System.out.println("from"+socket1.getInetAddress());
		
		
		InputStream in2=socket2.getInputStream();
		DataInputStream dis2=new DataInputStream(in2);
		String readData2=dis2.readUTF();
		System.out.println("incoming data:"+readData2);
		System.out.println("from"+socket2.getInetAddress());
		
		
		socket1.close();socket2.close();dis1.close();in1.close();dis2.close();in2.close();
		server.close();
	}
	
}
