package chap07.lecture.instanceofOperator;

public class MyApp {
	public static void main(String[] args) {
		SuperClass o1 = new SubClass();
		
		// instanceof : 좌변이 참조변수, 우변이 타입
		// 결과 : boolean
		System.out.println(o1 instanceof SuperClass);
		System.out.println(o1 instanceof SubClass);
		System.out.println(o1 instanceof SubClass2);
		
		if (o1 instanceof SuperClass) {
			SubClass o2 = (SubClass) o1;
		}
		
		if (o1 instanceof SubClass2) {
			SubClass2 o3 = (SubClass2) o1;
			// 호랑이와 집고양이는 같지 않기때문에 불가능하나 오류라고 안알려줌(예외발생)
			// 그러니까 instanceof로 걸러야함
		}
	}
}
