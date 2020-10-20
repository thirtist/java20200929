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

	public String stringSplosion(String str) {
		  
		  String result = "";
		  
		  for (int i = 0; i<str.length()-1; i++){
		    result = str.substring(0,(str.length()-(i+1))) + result;
		  }
		  return result+str;
		}
	
	public int last2(String str) {

		  int count = 0;
		  
		  if (str.length()>1){
		    String last = str.substring(str.length()-2,str.length());
		    for(int i = 0; i < str.length()-2;i++){
		     if (str.substring(i,i+2).equals(last)){
		       count++;
		     }
		   }
		  }
		  
		  return count;
		}
	
	public int arrayCount9(int[] nums) {
		 
		 int count = 0;
		 for (int i=0; i<nums.length; i++){
		   if (nums[i]==9) {
		     count++; 
		    }
		  }
		  return count;
		}
	
	public boolean arrayFront9(int[] nums) {
		  
		  int count = 0;
		  for (int i = 0; i < nums.length && i<4; i++){
		    if (nums[i]==9){
		      count++;
		    }
		  }
		  
		  return count!=0;
		}

	public boolean array123(int[] nums) {
		  
		  int count = 0;
		  for (int i = 0; i <nums.length-2; i++){
		    if (nums[i]==1&&nums[i+1]==2&&nums[i+2]==3){
		      count++;
		    }
		  }
		  return count !=0;
		}

	public int stringMatch(String a, String b) {
		  
		  int c = 0;
		  c = a.length()<b.length() ? a.length() : b.length();
		  
		  
		  int count = 0;
		  for(int i = 0; i<c-1; i++) {
		    if(a.substring(i,i+2).equals(b.substring(i,i+2))){
		      count++;
		    }
		  }
		  
		  return count;
		}

	public String stringX(String str) {
		  
		  String result ="";
		  
		  if (str.length()>0) {
		    String a = str.substring(0,1);
		    String b = str.substring(str.length()-1,str.length());
		  
		    if (str.equals("x")){
		      result = "x"; 
		      } else if (a.equals("x") && b.equals("x")){
		        result = "x" + str.replace("x","") + "x";
		      } else if (a.equals("x")) {
		        result = "x" + str.replace("x","");
		      } else if (b.equals("x")){
		        result = str.replace("x","") + "x";
		      } else {
		        result = str.replace("x","");
		      };
		  }
		  return result;
		}

	public String stringX(String str) {
		  
		  String result ="";
		  
		  if (str.length()>0) {
		    String a = str.substring(0,1);
		    String b = str.substring(str.length()-1,str.length());
		  
		    if (str.equals("x")){
		      result = "x"; 
		      } else if (a.equals("x") && b.equals("x")){
		        result = "x" + str.replace("x","") + "x";
		      } else if (a.equals("x")) {
		        result = "x" + str.replace("x","");
		      } else if (b.equals("x")){
		        result = str.replace("x","") + "x";
		      } else {
		        result = str.replace("x","");
		      };
		      
		  }
		  
		  return result;
		}

	public String altPairs(String str) {
		  String result = "";
		  String b = "";
		for (int i=0; i<str.length(); i=i+4){
		  if(i<str.length()-1){ 			  //2.i는 여기서 자르는 문자열 인덱스를 말하므로
		    b = str.substring(i+1,i+2);		  //  문자열길이보다 작으면 뒤를 하나 더 안자르게 만듦
		  } else {
		    b = "";							  //  해당안하면 b를 빈칸으로 초기화
		  }
		  result += str.substring(i,i+1)+b;   //1.일단 i를 4씩 증가시키면서 잘라서 넣음
		}
		  return result;
		}


	public String stringYak(String str) {
		  return str.replace("yak", "");
		}


	public int array667(int[] nums) {
		  
		  int count = 0;
		  for(int i = 0; i<nums.length-1; i++) {
		    if (nums[i]==6 && (nums[i+1]==6 || nums[i+1]==7)){
		      count++;
		    }
		  }
		  
		  return count;
		}
	
	public boolean noTriples(int[] nums) {
		  int count = 0;
		  for (int i = 0; i<nums.length-2; i++){
		    if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2]){
		      count++;
		    }
		  }
		  return count==0;
		}
	
	public boolean has271(int[] nums) {
		  
		  int count = 0;
		  
		  for (int i=0; i < nums.length-2; i++)
		  
		   if (nums[i+1]==nums[i]+5 && (Math.abs(nums[i+2]-nums[i]+1)<=2)){
		     count++;
		   } 
		  return count !=0;
		}


	
	
}
