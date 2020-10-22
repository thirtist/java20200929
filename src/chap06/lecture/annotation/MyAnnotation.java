package chap06.lecture.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD}) // @Target으로 클래스 내의 어디어디에 붙을 수 있는지 지정가능
@Retention(RetentionPolicy.RUNTIME) // @Retention으로 어노테이션이 언제 또는 언제까지존재할지 설정 할 수 있음//원래 어노테이션은 분석할때만 존재하고 실행할때는 사라짐
public @interface MyAnnotation {
	String value() default "123";  //받아야하는 타입과 값을 지정할 수 잇음
									// 어노테이션을 사용할때 꼭 써야함
									// 그런데 default값을 지정해서 안써도 되게 할 수 있음
	int number(); //이런걸 엘레멘트라고 부름
	String[] names() default {"a","b"}; //값을 여러개 갖게 하고 싶으면 배열로 만들기
}
