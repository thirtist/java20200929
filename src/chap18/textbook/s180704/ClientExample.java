package chap18.textbook.s180704;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			socket = new Socket();
			System.out.println("[연결요청]");
			socket.connect(new InetSocketAddress("localhost", 5001));  //소켓을 활용해서 접속
			System.out.println("[연결성공]");

			byte[] bytes = null;
			String message = null;

			OutputStream os = socket.getOutputStream();  //클라이언트는 서버로 데이터를 out하고
			message = "Hello Server";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[데이터보내기성공]");
			
			InputStream is = socket.getInputStream();    //클라이언트는 서버로부터 데이터를 받음
			bytes = new byte[100];
			int readByteCount = is.read(bytes);
			message = new String(bytes,0,readByteCount, "UTF-8");
			System.out.println("[데이터받기성공]"+message);
			
			os.close();
			is.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
