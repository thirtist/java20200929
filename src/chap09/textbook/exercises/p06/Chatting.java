package chap09.textbook.exercises.p06;

public class Chatting {
	void startChat(String chatId) {
		String nickName = null;  
		nickName = chatId;			// final 취급이기 때문에 두번 값을 쓸 수 가 없음 (아래 Chatting2에 올바른 값)
		Chat chat = new Chat() {
			public void start() {
				while (true) {
					String inputData = "안녕하세요";
					String message = "[" + nickName + "]" + inputData;
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
