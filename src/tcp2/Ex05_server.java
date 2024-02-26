package tcp2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

class Ex05_Thread extends Thread{
	public static int num=1;
	private Socket socket;
	public Ex05_Thread(Socket socket) {
		this.socket=socket;
		start();
	}
	
	@Override
	public void run() {
		num++;
		InputStream in;
		String readData=null;
		while(true) {
			try {
				in=socket.getInputStream();
				DataInputStream dis=new DataInputStream(in);
				readData=dis.readUTF();
				System.out.println("���� data:"+readData);
			} catch (Exception e) {
				e.printStackTrace();
				
			}
			
			/*
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
			//System.out.println("Ŭ���̾�Ʈ ����");

		}
	}
	
	
}



public class Ex05_server {
	public static void main(String[] args) throws Exception {
		ServerSocket server =new ServerSocket(12345);
		//accept �� �Ǿ����� �����ڵ� �γѾ�� �ȵǸ� �ȳѾ��  (��ϴ��Ѵ�) ,�׷��� Thread �����\
		System.out.println("server running");
		while(true) {
			Socket socket=server.accept();
			new Ex05_Thread(socket);
		}
		
	}
}
