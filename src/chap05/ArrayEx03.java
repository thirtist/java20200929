package chap05;

public class ArrayEx03 {
	public static void main(String[] args) {
		int a = mymethod(3);
		System.out.println(a);

		a = mymethod(4);
		System.out.println(a);

		a = mymethod(50);
		System.out.println(a);

		int[] arr1 = new int[] { 9, 8, 7 };
		a = mymethod2(arr1);
		System.out.println(a);
		
		int[] arr2 = new int[] { 99, 88, 77 };
		a = mymethod2(arr2);
		System.out.println(a);
		
		mymethod2(new int[] {88, 77, 66});
		
		int b = 11
		int a = b;
		System.out.println(a);
		
	}

	public static int mymethod2(int[] arr) {
		System.out.println("-----myemethod2 시작-----");
		int sum = 0;
		for (int i = 0; i < 3; i++) {
//			System.out.println(arr[i]);
			sum += arr[i];
		}
		System.out.println("-----myemethod2 종료-----");
		return sum;
	}

	public static int mymethod(int i) {
		return i * 2;
	}
	
	

}
