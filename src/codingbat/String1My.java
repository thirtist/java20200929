package codingbat;

public class String1My {
	public String helloName(String name) {
		  return "Hello "+name + "!";
		}

	public String makeAbba(String a, String b) {
		  return a+b+b+a;
		}

	public String makeTags(String tag, String word) {
		  return "<"+tag+">"+word+"<"+"/"+tag+">";
		}

	public String makeOutWord(String out, String word) {
		  
		  String a = out.substring(0,2);
		  String b = out.substring(2,4);
		  
		  return a+word+b;
		}
	public String extraEnd(String str) {
		  String a = str.substring(str.length()-2,str.length());
		  return a+a+a;
		}
	public String firstTwo(String str) {
		  return str.length()>1 ? str.substring(0,2) : str;
		}
	public String firstHalf(String str) {
		  return str.substring(0,str.length()/2);
		}
	public String withoutEnd(String str) {
		  return str.substring(1,str.length()-1);
		}

	public String comboString(String a, String b) {
		  String x = "";
		  String y = "";
		  if (a.length()>b.length()) {
		    x=a;
		    y=b;
		  } else {
		    x=b;
		    y=a;
		  }
		  
		  return y+x+y;
		}

	public String nonStart(String a, String b) {
		  return a.substring(1)+b.substring(1);
		}


	public String left2(String str) {
		  if(str.length()>2){
		    return str.substring(2)+str.substring(0,2);
		  }
		  return str;
		}

	public String right2(String str) {
		  String last = str.substring(str.length()-2,str.length());
		  return last + str.substring(0,str.length()-2);
		}

	public String theEnd(String str, boolean front) {
		  if (front) {
		    return str.substring(0,1);
		  }
		  return str.substring(str.length()-1,str.length());
		}

	public String withouEnd2(String str) {
		  if(str.length()>1){
		    return str.substring(1,str.length()-1);
		  } else if (str.length()==1) {
		    return "";
		  }
		  return str;
		}

	public String middleTwo(String str) {
		  return str.substring(str.length()/2-1,str.length()/2+1);
		}

	public boolean endsLy(String str) {
		  
		  if (str.length()>1){
		    
		  return str.substring((str.length()-2),(str.length())).equals("ly");
		    
		  }
		  
		  return false;
		}
	
	public String nTwice(String str, int n) {
		  return str.substring(0,n)+str.substring(str.length()-n,str.length());
		}


	public String twoChar(String str, int index) {
		  
		  if (str.length()>index+1 && index>0){
		    return str.substring(index,index+2);
		  }
		  return str.substring(0,2);
		}
	public String middleThree(String str) {
		  return str.substring(str.length()/2-1 ,str.length()/2+2);
		}
	public boolean hasBad(String str) {
		  if (str.length()>3 && (str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad"))){
		    return true;
		  } else if (str.equals("bad")){
		    return true;
		  }
		  return false;
		}
	
	public String atFirst(String str) {
		  if(str.length()>1){
		    return str.substring(0,2);
		  } else if (str.length()==1){
		    return str+"@";
		  } else {
		    return "@@";
		  }
		}

	public String lastChars(String a, String b) {
		  
		  if(a.length()>0 && b.length()>0) {
		    return a.substring(0,1) + b.substring(b.length()-1,b.length());
		  } else if (a.length()==0 && b.length()!=0) {
		    return "@"+b.substring(b.length()-1,b.length());
		  } else if (a.length()!=0 && b.length()==0){
		    return a.substring(0,1) + "@";
		  } else {
		    return "@@";
		  }
		}






}
