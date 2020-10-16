package chap06.textbook.exercises.p15;

public class MemberService {
	String id;
	String password;

	boolean login(String id, String password) {
		if (id.equals("hong") && password.equals("12345")) {
			return true;
		}

		return false;

	}

	boolean logout(String id) {
		if (id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.프로그램을 종료합니다");
			return false;
		} else {
			System.out.println("아이디가 올바르지 않습니다 다시 입력해 주세요");
			return true;
		}
	}
}
