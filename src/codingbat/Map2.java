package codingbat;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map2 {

	public Map<String, Integer> word0(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String string : strings) {
			map.put(string, 0);
		}

		return map;
	}

	public Map<String, Integer> wordLen(String[] strings) {

		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			map.put(str, str.length());
		}

		return map;
	}

	public Map<String, String> pairs(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			map.put(str.substring(0, 1), str.substring(str.length() - 1, str.length()));
		}

		return map;
	}

	public Map<String, Integer> wordCount(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		for (String str : strings) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);
			} else {
				map.put(str, 1);
			}
		}
		return map;
	}

	public Map<String, String> firstChar(String[] strings) {
		Map<String, String> map = new HashMap<>();

		for (String str : strings) {
			if (map.containsKey(str.substring(0, 1))) {
				String str2 = map.get(str.substring(0, 1)) + str;
				map.put(str.substring(0, 1), str2);
			} else {
				map.put(str.substring(0, 1), str);
			}
		}
		return map;
	}

	public String wordAppend(String[] strings) {
		Map<String, Integer> map = new HashMap<>();

		String result = "";

		for (String str : strings) {
			if (map.containsKey(str)) {
				map.put(str, map.get(str) + 1);

				if (map.get(str) == 2) {
					result += str;
					map.put(str, 0);
				}
			} else {
				map.put(str, 1);
			}
		}
		return result;
	}

	
	//다시푼것 이게 맞음
	public Map<String, Boolean> wordMultiple(String[] strings) {

		Map<String, Boolean> map = new HashMap<>();

		for (String str : strings) {
			if (map.containsKey(str)) {
				map.put(str, true);
			} else {
				map.put(str,false);
			}
		}
			return map;
	}
	
	
	public Map<String, Boolean> wordMultiple(String[] strings) {

		Map<String, Boolean> map = new HashMap<>();

		Map<String, Integer> map2 = new HashMap<>();

		for (String str : strings) {
			if (map2.containsKey(str)) {
				map2.put(str, map2.get(str) + 1);
			} else {
				map2.put(str, 1);
			}
		}

		for (String str : strings) {
			if (map2.get(str) > 1) {
				map.put(str, true);
			} else {
				map.put(str, false);
			}

		}
			return map;
			//이러게 푸는거 아닌거 같은데
	}
	
	//이거 못풀겠다
	public String[] allSwap(String[] strings) {
		  
		  String[] result = {};
		  
		  Map <String, Integer> map = new HashMap<>();
		  
		  for (int i = 0; i<strings.length; i++){

		    String key = strings[i].charAt(0)+"";
		    int value = i;

		    if(map.containsKey(key)){
		      result[map.get(key)] = strings[i];
		    } else {
		      map.put(key,value);
		    }
		  }
		  
		  return result;
		  
		}

	
}
