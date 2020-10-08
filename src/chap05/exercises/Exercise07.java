package chap05.exercises;

public class Exercise07 {
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int[] array = {-1,5,3,8,2,50,100,80,40,15,10};
		
		int a=0;
		
		for (int i = 0; i <array.length; i++) {
			a = array[i];
			
			if (max < a) {
				max = a;
			}
		}
		System.out.println("max:" + max);
	}
}
