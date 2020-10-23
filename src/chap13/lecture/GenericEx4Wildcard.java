package chap13.lecture;

import chap13.textbook.s130601.*;

public class GenericEx4Wildcard {
	public static void main(String[] args) {
		Course<Person> coursePerson = new Course<>("일반인",5);  //Course 클래스가 제너릭타입 //String과 배열숫자를 받음
		Course<Student> courseStudent = new Course<>("학생",5);
		
		Person p = new Person("일반");
		Student s = new Student("학생");
		
		p = s; //이건되는데
		
		courseStudent.add(new Student("hong")); //클래스를 8번줄에서 스튜던트로 결정하고 만든것에 스튜던트 객체 추가가능
		coursePerson.add(new Person("kim"));	//클래스를 7번줄에서 퍼슨으로 결정하고 만든것에 퍼슨 객체 추가가능
		coursePerson.add(new Student("kim"));   //자식이니까 들어감
		
//		coursePerson = courseStudent;//이건안되는이유(당연한거아닌가?) //만약에 이게 된다면
		coursePerson.add(new Person("kim")); // 아예실행이 불가함      //이게 실행불가하게 되야함
		
		System.out.println("종료");
		System.out.println("wildcard");
		Course<? super Student> courseW0 = new Course<Object>("a",1);       //wildcard <? super Student> <- Student보다 상위 클래스를 넣겠다고 지정
		Course<? super Student> courseW1 = new Course<Person>("a",1);       //wildcard
		Course<? super Student> courseW2 = new Course<Student>("a",1);      //
//		Course<? super Student> courseW3 = new Course<HightStudent>("a",1); //
		
		courseW0.add(new Student("a"));
		courseW0.add(new Object()); // Student이상이라는 말이지 실제 인스턴스가 아니라는 말은 아님 //이건 안됨(Object는 실제로 위에 있지않아서??)
		Course<Object> co = (Course<Object>) courseW0;  // Object로 강제 형변환 하면
		co.add(new Object());							// Object가 들어가긴함
		
		courseW1.add(new Student("a"));
		courseW2.add(new Student("a"));
		
		System.out.println("종료");
		
		Course<? extends Student> courseEx1 = new Course<Student>("a",5);
		Course<? extends Student> courseEx2 = new Course<HighStudent>("a",5);
		
		Course<?> courseA1 = new Course<Person>("a",5);				//<?> 제네릭이면 뭐든지 들어가짐
		Course<?> courseA2 = new Course<Worker>("a",5);
		Course<?> courseA3 = new Course<Student>("a",5);
		Course<?> courseA4 = new Course<HighStudent>("a",5);
		
		
	}
}
