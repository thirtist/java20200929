package codingbat;

public class Apractice {
	
	public boolean stringE(String str) {
		  
		  int v = 0;
		  for (int i = 0; i < str.length(); i++ ){
		      boolean z = str.charAt(i).equals("e");
		      if (z) {
		        v += 1;
		      }
		  };
		  
		  return v >= 1 && v <= 3;
		  
		}

	public boolean stringE(String str) {
		  
		  int v = 0;
		  for (int i = 0; i < str.length(); i++ ){
		      char c = str.charAt(i);
		      String s = String.valueOf(c);
		      boolean z = s.equals("e");
		      if (z) {
		        v += 1;
		      }
		  };
		  
		  return v >= 1 && v <= 3;
		  
		}
	
	public boolean lastDigit(int a, int b) {
		  
		  return a % 10 == b % 10;
		  
		}
	
	public String endUp(String str) {
		  
		  if (str.length() > 2) {
		  
		    String A = str.substring(str.length()-3,str.length());
		  
		    String B = A.toUpperCase();
		  
		    String C = str.substring(0,str.length()-3) + B;
		  
		    return C;
		  }
		  
		  return str.toUpperCase();
		  
		}



	

}
