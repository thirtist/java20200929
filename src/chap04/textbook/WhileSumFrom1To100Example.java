package chap04.textbook;

public class WhileSumFrom1To100Example {
	public static void main(String[] args) {
		int sum = 0;
		
		int i = 1;
		
		while (i<=100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~" + (i-1) + "합:" + sum);
		// while 반복이 끝난 i를 바깥에서 초기화했기 때문에 써먹을 수 있다
	}

}
