package chap10.lecture.autoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1_My {

	public static void main(String[] args) {

//		try {
//			FileInputStream fis = new FileInputStream("file.txt");
//		} catch (FileNotFoundException e) { 		// 1. 일단 파일 못 찾았을 때의 예외를 catch
//			e.printStackTrace(); //예외 내용을 자세하게 나오게 하는 메소드(API찾아보니 Throwable클래스에서 상속받은 메소드)
//		} finally {
//			fis.close(); 							// 2. 외부파일을 읽는 클래스라서 무조건 닫아야 하니 일단 finally에서 작성시도해봄
//													// try문에서 작성 될 수도 있고 예외발생 때문에 안될 수도 있으니 에러가남=바깥에서 변수를 만들기로결정
//		}

		FileInputStream fis = null; // 3. 바깥에서 일단 변수생성

		try {
			fis = new FileInputStream("file.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) { 						// 6. 앞에서 예외발생으로 null값으로 계속 남아있으면 close할 수 없기 때문에 if문으로 조건을만듦 = 구버전완성
				try { 								// 5. 그래서 try catch로 감쌌지만 일단 파일이 초기화안돼서 안됨 = null로 초기화
					fis.close();					// 4. I/O exception발생할 수 있다는 에러남

				} catch (IOException e) {
					e.printStackTrace();
				} 									
			}

		}
		
		//신버전
		
		try (FileInputStream fis2 = new FileInputStream("file.txt")) {  // ***1.try 해당내용을 {}에 작성하지 않고 ()를 새로 만들어서 안에 객체생성***
																		// ***그러면 자동으로 close됨***(AutoClose)
		} catch (IOException e) {										// 2.I/O Exception만 catch해주면 됨
			e.printStackTrace();
		}
		
		try (FileInputStream fis4 = new FileInputStream("file.txt")) {
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
