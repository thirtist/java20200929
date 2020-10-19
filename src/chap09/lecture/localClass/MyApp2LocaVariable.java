package chap09.lecture.localClass;

public class MyApp2LocaVariable {
	public static void main(String[] args) {
		int i = 1; // 그래서 얘는 암묵적으로 파이널이 됨

		class localClass {
			void method1() {
				System.out.println(i);
//				i +=1; 클래스 내의 로컬 클래스에서 값을 변경 할 수 없음(파이널처럼)
				System.out.println(args); // 얘도 안에서 사용되면 암묵저그올 파이널이 됨
				
			}
		}
//		i+=1; 얘도 안됨
//		args = new String[3]; 파라미터도 받을 수만 있고 덮어쓰지 못함
	}
}
