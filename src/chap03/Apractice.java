package chap03;

public class Apractice {
	public static void main(String[] args) {
		int a = Math.abs(93);
		
		System.out.println(a);
	}

	public boolean nearHundred(int n) {
		  
		 return (Math.abs(100-n) <= 10) || (Math.abs(200-n) <= 10);
		  
		}


	
}
