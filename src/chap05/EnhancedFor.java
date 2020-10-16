package chap05;

public class EnhancedFor {
	public static void main(String[] args) {
		int[] arr = {4,5,6,7,8};
		
		for (int i = 0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		
		for(int y : arr) {
			System.out.println(y);
		}
		
	}

}
