package chap05.lecture;

public class ArrayEx04 {
	public static void main(String[] args) {
		int[] arr1 = new int[] { 99, 88, 77 };
		int[] arr2 = {99, 88, 77};
		
		for (int i = 0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("---------------");
		for (int i = 0; i<3; i++) {
			System.out.println(arr2[i]);
		}
		
		int[] arr3;
		int[] arr4;
		
		arr3 = new int[] {11,22,33};
//		arr4 = {11,22,33};  // 이 문법은 선언하면서 넣을 때만 가능함
		
	}
}
