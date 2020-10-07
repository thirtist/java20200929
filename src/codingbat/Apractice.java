package codingbat;

public class Apractice {
	
	public String frontBack(String str) {
		  
		  String final = "A";
		  
		  if(str.length()>2){
		    String first = str.substring(0,1);
		    String last = str.substring(str.length()-1,str.length());
		    String middle = str.substring(1,str.length()-1);
		    final = last + middle + first;
		  } else{
		    return str;
		  }
		  return final;
		}

	

}
