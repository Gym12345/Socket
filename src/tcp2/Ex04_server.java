package tcp2;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex04_server {
	public static void main(String[] args) throws Exception{
		ServerSocket server=new ServerSocket(12345);
		System.out.println("접속대기");
		Socket socket=server.accept();
		System.out.println("연결됨");
		
		InputStream in=socket.getInputStream();
		ObjectInputStream ois = new ObjectInputStream(in);
		
		Ex04_DTO dto = (Ex04_DTO) ois.readObject();
		System.out.println("수신 name:"+dto.getName());
		System.out.println("수신 addr:"+dto.getAddr());
		
		
		ois.close();in.close();socket.close();server.close();
		
	}

}
