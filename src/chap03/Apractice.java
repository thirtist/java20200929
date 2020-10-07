package chap03;

public class Apractice {
	public static void main(String[] args) {
		int a = Math.abs(93);
		
		System.out.println(a);
	}

	  
	public String startOz(String str) {
		  boolean first = str.substring(0,1).equals("o");
		  boolean second = str.substring(1,2).equals("z");
		  
		  if(first && second) {return str.substring(0,2);}
		  else if (first) {return str.substring(0,1);}
		  else (second) {return str.substring(1,2);};
		  
		  return false;
		  
		}


	
}
