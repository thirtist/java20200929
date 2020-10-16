package a.chap05;

public class ArrayCopyEx02 {
	public static void main(String[] args) {
		int[][] arr1 = { { 3, 4 }, { 88, 99 }, { 2, 1 } };

		int[][] arr2 = new int[arr1.length][];

		for (int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		arr1[0][0] = 100; // 바꾸면 arr2의 열도 복사됨 (열은 참조값이 같으니까)

		for (int[] a : arr2) {
			for (int n : a) {
				System.out.println(n);
			}
		}

	}

}
