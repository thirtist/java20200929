package chap18.textbook.exercises.p11;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) throws Exception {
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(new InetSocketAddress("172.30.1.51", 5001));

		System.out.println("[서버시작]");

		while (true) {
			try {
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();

				byte[] bytes = new byte[1000];
				int readByteCount = -1;

				// 작성위치
				readByteCount = is.read(bytes, 0, 100);
				String fileName = new String(bytes, 0, readByteCount);
				// 작성완료

				fileName = fileName.trim();

				System.out.println("[파일 받기 시작]" + fileName);

				// 작성위치
				FileOutputStream fos = new FileOutputStream("C:/temp/" + fileName);
												//폴더가 없으면 예외발생, 경로 + 파일이름으로 생성됨
				while ((readByteCount = is.read(bytes)) != -1) {
					fos.write(bytes, 0, readByteCount);
				}
				// 작성완료

				System.out.println("[파일받기완료]");

				fos.close();
				is.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}

		}
		serverSocket.close();
		System.out.println("[서버종료]");
	}
}
