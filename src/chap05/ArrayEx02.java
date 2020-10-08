package chap05;

public class ArrayEx02 {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		arr1[0] = 99;
		arr1[1] = 77;
		arr1[2] = 55;
		
		int[] arr2 = new int[] {88, 66, 44};
		for (int i = 0; i <3; i++) {
			System.out.println(arr2[i]);
		}
		double[] arr3 = new double[] {3.14, 6.5, 9.9};
		for (int i = 0; i <3; i++) {
			System.out.println(arr3[i]);
		}
		String[] arr4 = new String[] {"A", "b", "c", "f"};
		for (int i = 0; i <4; i++) {
			System.out.println(arr4[i]);
		}
	}

}
