package chap06.textbook.s061302.pakage2;

import chap06.textbook.s061302.pakage1.A;

public class C {

	//필드
	A a1 = new A(true);     //(o)
	A a2 = new A(1);        //(x) //default 생성자 접근불가
	A a3 = new A("문자열"); //(x) //private 생성자 접근불가
	
}
