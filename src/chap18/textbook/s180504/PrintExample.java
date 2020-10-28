package chap18.textbook.s180504;

import java.util.Date;

public class PrintExample {
	public static void main(String[] args) {
		System.out.printf("상품의 가격:%d원\n", 123);			//  printf f-는 포맷의 약자
		System.out.printf("상품의 가격:%6d원\n", 123);			// (String format, object)  (형식화된 문자열=포맷스트링, 매개값)
		System.out.printf("상품의 가격:%-6d원\n", 123);			//  %와 문자(컨버전이라고 부름)  %d 에서 d는 컨버전
		System.out.printf("상품의 가격:%06d원\n", 123);			// %d = 정수 (%6d = 6자리정수-왼쪽공백 / %-6d-오른쪽공백 / %06d-왼쪽공백에0채움)
//		System.out.printf("상품의 가격:%06d원\n", "이름",123);  // 순서대로 읽는데 형식이 안맞아서 에러
		System.out.printf("상품의 가격:%06d원\n",123, 234);     // object가 ...이라서 개수 여러개 넣어도됨(포맷에 써지지만 않음
		
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, Math.PI*10*10);  // %10.2f (소수점이상7자리,소수점이하2자리,왼쪽빈자리공백)
																				   // (.까지 모든개수=10개 .2 = 그중 소수점이하 자리수 + f)
																				   // (%-10.2f = 오른쪽 공백 / %010.2f 왼쪽빈자리공백을0으로채움)
		System.out.printf("%6d | %-10s | %10s\n", 1, "홍길동","도적");			   // %s = 문자열 (%6s = 6자리 문자열 왼쪽공백 / %-6s 오른쪽공백)
		
		Date now = new Date();
		System.out.printf("오늘은 %tY년 %tm월 %td일 입니다\n,", now, now, now);		// 날짜파라미터에서 %tY = 4자리 년 %ty = 2자리 년 %tm = 2자리월
		System.out.printf("오늘은 %1$tY년 %1$tm월 %1$td일 입니다\n,", now);			//  1$ = 첫번째 파라미터를 의미
		System.out.printf("오늘은 %1$tH시 %1$tM 분 %1$tS초 입니다\n,", now);		//  /t (탭) /n (줄바꿈) %% (%)
		
//		.printf( String 포맷 ( %+컨버전 ), 파라미터들 )   %d = 정수(d앞에 숫자로 자릿수,-로 좌우정렬,0으로 여백채움) %f = 실수 / 1$ 첫번째 파라미터를 지정
	}
}
