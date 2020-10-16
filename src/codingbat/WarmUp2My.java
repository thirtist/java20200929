package codingbat;

public class WarmUp2My {

	public String stringTimes(String str, int n) {
		  
		  String result = "";
		  for (int i=0; i < n; i++)
		  { result += str; }
		  return result;
		}

	public String frontTimes(String str, int n) {
		  
		  String result = "";
		  if (str.length()>2){
		    for (int i=0; i<n; i++){
		      result += str.substring(0,3);
		    }
		  } else {
		    for (int i=0; i<n; i++){
		      result += str;
		    }
		  }
		  return result;
		}

	int countXX(String str) {
		  
		  int count = 0;
		  for (int i=0; i < str.length()-1; i++){
		    if(str.substring(i,i+2).equals("xx")){
		      count++;
		    }
		  }
		  return count;
		}

	boolean doubleX(String str) {

		  if (str.indexOf("xx") != -1){
		    if(str.charAt(str.indexOf("x")+1) != 'x'){
		        return false;
		    }
		  } else {
		   return false;
		  }  
		  return true;
		}
	
	public String stringBits(String str) {
		  
		 String result = "";
		 for (int i=0; i<str.length(); i=i+2){
		   result += str.substring(i,i+1);
		 } 
		 return result;
		}

	
}
