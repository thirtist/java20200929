package chap18.textbook.s180504;

public class VarArgEx1 {
	//여러 아규먼트를 받을 수 있는 파라미터
	public static void main(String[] args) {
		method();
		method(1);
		method(1, 2);
	}
	
	public static void method(int... nums) {
		//int... 0개이상 받을 수 있다는 의미
		System.out.println("method 실행");
		System.out.println(nums.length);  //사용할 때는 배열로 씀 (실제로 배열로 되어있음)
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
	}
}
