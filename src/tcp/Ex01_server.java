package tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Ex01_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server= new ServerSocket(12345); // port number (0~2^16) 
		System.out.println("waiting connection");
		
		Socket socket=server.accept();
		System.out.println("client is connected");
		
		InputStream is =socket.getInputStream();
		int readData=is.read();
		System.out.println("incoming data:"+readData);
		
		is.close();
		socket.close();
		server.close();
		
		
	}
}
