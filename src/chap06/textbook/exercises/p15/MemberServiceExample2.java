package chap06.textbook.exercises.p15;

import java.util.Scanner;

public class MemberServiceExample2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MemberService memberService = new MemberService();

		boolean run1 = true;
		while (run1) {
			System.out.print("id를 입력하세요 : ");
			String id = sc.nextLine();
			System.out.print("password를 입력하세요 : ");
			String password = sc.nextLine();

			boolean result = memberService.login(id, password);
			if (result) {
				System.out.println("로그인 되었습니다.");
				run1 = false;
			} else {
				System.out.println("id 또는 password가 올바르지 않습니다. 다시 입력바랍니다.");
			}
		}
		boolean run2 = true;
		while (run2) {
			System.out.print("로그아웃하시려면 id를 입력하세요 : ");
			String id = sc.nextLine();
			run2 = memberService.logout(id);
		}
	}
}
