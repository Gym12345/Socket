package chatting;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Ex06_client01 {
	public static void main(String[] args) throws Exception {
		Socket sock = new Socket("127.0.0.1",12345);
		
		OutputStream out = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(out);
		
		Scanner input = new Scanner(System.in);
		
		String msg = null;
		
		new Ex06_clientThread( sock );
		
		while(true) {
			System.out.print("전송 데이터 입력(01):");
			System.out.println(sock);
			//System.out.println("client1:"+sock.getLocalPort());
			msg = input.nextLine();
			dos.writeUTF(msg);
			System.out.println("");
			System.out.println("데이터 전송했음(01)");
			//데이터 전송 코드
		}
	}
}







