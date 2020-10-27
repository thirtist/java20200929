package chap18.lecture.inputstream;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx2 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/inputstream/InputStreamEx2.java";
		InputStream is = new FileInputStream(path);
		
//		is.read(); // 이건 1바이트만
		
		byte[] datas = new byte[10];  //배열로 몇 바이트씩 읽을지 만듦
		int readCnt = is.read(datas); //파라미터의 배열길이만큼 단위로 읽음 //똑같이 읽을게 더이상 없으면 -1을 리턴
		int loopCnt = 0;
		
		while((readCnt = is.read(datas)) !=-1) {
			loopCnt++;
		}
		
		System.out.println(loopCnt);
		
		is.close();
	}
}
