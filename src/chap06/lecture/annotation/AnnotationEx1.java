package chap06.lecture.annotation;

public class AnnotationEx1 {
	// <- 사람이 보라고 만든 주석들....
	
	// annotation <- 사람이 보라고 만든게 아니고 (컴파일러, 다른프로그램, jvm등)이 보라고 달아놓은 것
	
	@Override  // <-이거
	@MyAnnotation("abc")
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation(value="abc", number=5, names= {"c","d"})  // value="abc"대신 abc만 넣어줘도 가능
											//여러개 쓸때는 반드시 value=라고 작성해줘야함
	public static void mymethod() {
		
	}
	
}
