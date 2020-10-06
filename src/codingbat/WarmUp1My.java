package codingbat;

public class WarmUp1My {

	public boolean sleepIn(boolean weekday, boolean vacation) {
		  return !weekday || vacation;
		}

	
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		 return !(aSmile ^ bSmile);
		}

	
	public int sumDouble(int a, int b) {
		  return a == b ? (a+b)*2 : a+b;
		  
		  
		  
		}

	
	public int diff21(int n) {
		  
		  return n <=21 ? 21 -n : (n-21)*2;
		  
		}

	
	public boolean parrotTrouble(boolean talking, int hour) {
		  return talking && (hour < 7 || hour >20); 
		}

	
	public boolean makes10(int a, int b) {
		  return (a == 10 || b == 10) || (a+b==10);
		}

	
	public boolean nearHundred(int n) {
		  return n > 110 ? Math.abs(200-n) <=10 : Math.abs(100-n) <=10;
		}

	
	public boolean posNeg(int a, int b, boolean negative) {
		  return negative ? (a < 0) && (b < 0)  : (a < 0) ^ (b < 0);
		}

	
	public String notString(String str) {
		  
		  if(str.length()>2 && str.substring(0,3).equals("not")){
		    return str;
		  }
		  
		  return "not " + str;
		}

	
	public String missingChar(String str, int n) {
		  
		  return str.substring(0,n)+str.substring(n+1);
		  
		}

	
	public String frontBack(String str) {
		  
		  
		  
		  if (str.length() > 1 && !(str.length() == 0)){
		    char f = str.charAt(0);
		    char l = str.charAt(str.length()-1);
		  
		  return l + str.substring(1,str.length()-1) + f;
		  }
		  
		  return str;

		}

	
	public String front3(String str) {
		  
		  String result = "";
		  
		  
		  if (str.length() > 2) {
		  
		    for (int i = 0; i < 3; i++ ){
		      result += str.charAt(i);
		    }
		  } else {
		    for (int i = 0; i < str.length(); i++ ){
		      result += str.charAt(i);
		    }
		  }
		  
		  return result + result + result;
		  
		}

	
	public String backAround(String str) {
		  return str.charAt(str.length()-1) + str + str.charAt(str.length()-1);
		}

	
	public boolean or35(int n) {
		  return n % 3 == 0 || n % 5 == 0;
		}

	
	public String front22(String str) {
		  
		  if (str.length()>2){
		  return str.substring(0,2) + str + str.substring(0,2);
		  };
		  
		  return str + str + str;
		}

	
	public boolean startHi(String str) {
		  
		  return str.length() > 1 && str.substring(0,2).equals("hi");
		  
		}

	
	public boolean icyHot(int temp1, int temp2) {
		  return (temp1 < 0 && temp2 > 100) || (temp2 <0 && temp1 >100);
		}

	
	public boolean in1020(int a, int b) {
		 return (a >= 10 && a <=20) || (b >= 10 && b <=20);
		}

	
	
	public boolean hasTeen(int a, int b, int c) {
		  
		  return ((a >= 13) && (a <=19)) || ((b >= 13) && (b <=19)) || ((c >= 13) && (c <=19));
		  
		}

	
	public boolean loneTeen(int a, int b) {
		  boolean rangeA = a >= 13 && a <=19;
		  boolean rangeB = b >= 13 && b <=19;
		  
		  return rangeA ^ rangeB;
		}

	
	
	public String delDel(String str) {
		  

		  if (str.equals("del")){return str;};
		    
		  String Del = str.length() > 3 ? str.substring(1,4) : str;
		  
		  if (Del.indexOf("del") != -1)
		   { int a = str.length();
		     return str.substring(0,1) + str.substring(4,a);
		     
		   };
		  
		  return str;
		}

	
	
	public boolean mixStart(String str) {
		  return str.length()>2 && str.substring(1,3).equals("ix");
		}

	
	
	public String startOz(String str) {
		  boolean first = str.length() > 0 && str.substring(0,1).equals("o");
		  boolean second = str.length() > 1 && str.substring(1,2).equals("z");
		  
		  if(first && second) {return str.substring(0,2);}
		  else if (first) {return str.substring(0,1);}
		  else if (second) {return str.substring(1,2);}

		  return "";
		  
		}
	
	public int close10(int a, int b) {
		  int ten = Math.abs(10-a) < Math.abs(10-b) ? a : b;
		  
		  if (Math.abs(10-a) != Math.abs(10-b)) { return ten; };
		  
		  return 0;
		  
		}

	public boolean in3050(int a, int b) {
		  boolean w = a >= 30 && a <=40; 
		  boolean x = b >= 30 && b <=40;
		  
		  boolean y = a >= 40 && a <=50; 
		  boolean z = b >= 40 && b <=50;
		  
		  return (w && x) || (y && z);
		}

	
	
	public int max1020(int a, int b) {
		  boolean rangeA = a >= 10 && a <= 20;
		  boolean rangeB = b >= 10 && b <= 20;
		  
		  if (rangeA || rangeB) {
		    if (a > b) {
		    
		      if(a >=10 && a <=20){
		        return a;
		      } else if(b >=10 && b <=20){
		        return b;
		      }
		    }
		    
		    if (b >=10 && b <=20)
		      { return b; }
		    else {return a; }
		  }
		  
		  return 0;
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
	
	public String everyNth(String str, int n) {
		  
		  String result = "";
		  
		  for (int i = 0; i < str.length(); i+=n){
		    char c = str.charAt(i);
		    String s = String.valueOf(c);
		    result += s;
		  }
		  return result;
		  
		}

		 
	
	
	

	
}
