package tcp2;

import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex04_client {
	public static void main(String[] args) throws Exception {
		Socket socket=new Socket("127.0.0.1",12345);
		Scanner input=new Scanner(System.in);
		OutputStream out= socket.getOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(out);
		
		Ex04_DTO dto =new Ex04_DTO();
		System.out.println("enter name:");
		dto.setName(input.next());
		System.out.println("enter address:");
		dto.setAddr(input.next());
		
		oos.writeObject(dto);
		oos.close();out.close();socket.close();
		input.close();
	}

}
