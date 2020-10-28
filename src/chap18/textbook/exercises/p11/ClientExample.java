package chap18.textbook.exercises.p11;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("172.30.1.51", 5001);
		OutputStream os = socket.getOutputStream();

		String filePath = "bts.jpg";
		File file = new File(filePath);

		String fileName = file.getName();
		// 작성위치
		byte[] bytes = new byte[100];
//		bytes = fileName.getBytes(); 원래교과서는이거
		fileName.getBytes(0, fileName.length(), bytes, 0);//이거 생성자 
						//시작지점,끝지점,복사할목적지(배열),복사할배열인덱스번호
						//선생님이 하신거
		os.write(bytes);
		// 작성완료

		System.out.println("[파일보내기시작]" + fileName);
		// 작성위치
		FileInputStream fis = new FileInputStream(file);
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}
		// 작성완료

		os.flush();
		System.out.println("[파일보내기완료]");

		fis.close();
		os.close();
		socket.close();
	}
}
