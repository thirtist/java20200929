package chap10.lecture.autoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutoCloseEx1 {
	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("file.txt");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}


		// new version
		// try-with-resources
		try (FileInputStream fis2 = new FileInputStream("file.txt")) {

		} catch (IOException e) {
			e.printStackTrace();
		}
		// 이렇게 줄어들었음 - 자동으로 닫아줌

	}
}
