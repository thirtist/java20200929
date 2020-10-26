package chap15.textbook.s150403;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws Exception {
		Properties properties = new Properties();
		String path = PropertiesExample.class.getResource("database.properties").getPath();
		
		path = URLDecoder.decode(path, "uft=8"); //경로에 한글이 있으면 처리해야하므로 .decode() 메소드를 사용
		
		// 파일을 읽어서 map에 설정 파일(.properties)의 정보를 저장
		properties.load(new FileReader(path)); // new FileReader() -> 파일을 읽어오는 객체를 만듦
											   // .load 읽어오는 메소드
		
		System.out.println(properties.size());
//		String urlValue = properies.get("url"); //.get은 오브젝트로 리턴함해서 못씀
// 		Object urlValue = properies.get("url"); // 오브젝트로 리턴받으면 강제형변환해야해서 String으로 리턴받는 전용 .getProperty라는 메소드가 있음
 		String urlValue = properties.getProperty("url"); //얘는 String으로 리턴하니 안전(오브젝트로 리턴받은 후 강제형변환 안해도 되니)
 		String driver = properties.getProperty("driver");
 		String uername = properties.getProperty("username");
 		String password = properties.getProperty("password");
 		System.out.println(urlValue);
 		System.out.println(driver);
 		System.out.println(uername);
 		System.out.println(password);
	}
}
