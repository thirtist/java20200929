package chap09.textbook.exercises.p06;

public class Chatting2 {
	void startChat(String chatId) {
		String nickName = chatId;  // final 취급이기 때문에 두번 값을 쓸 수 가 없음
		String name = "a";
		name = "b";					// 로컬클래스에서 가져다 쓰지 않으면 덮어써도 상관없음
//		nickName = chatId;
		Chat chat = new Chat() {    // 요놈이 로컬 클래스
			public void start() {	// 로컬 클래스 안의 메소드
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData; // 로컬변수는 쓰기가 불가능함(위에 필드는 상수취급)
					sendMessage(message);
				}
			}
		};
		chat.start();
	}

	class Chat {
		void start() {
		}

		void sendMessage(String message) {
		}
	}
}
