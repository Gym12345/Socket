package tcp2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Ex05_client2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket=new Socket("127.0.0.1",12345);
		Scanner input =new Scanner(System.in);
		
		while(true) {
			System.out.println("enter data to send(cl2):");
			String data=input.nextLine();
			
			
			OutputStream out=socket.getOutputStream();
			DataOutputStream dos=new DataOutputStream(out);
			dos.writeUTF(data);
		}
		
	}
}
