package chap15.textbook.exercises.p09;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<String,Integer>();
		map.put("blue",96);
		map.put("hong",86);
		map.put("white",92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		

		//작성위치
		
		//평균점수
		Set<String> set = map.keySet();
		//이름 지을 때 keys로 짓는게 좋아보임
		
		for (String temp : set) {
			totalScore += map.get(temp); 
		}
		totalScore = totalScore / map.size();
		System.out.println("평균점수: " + totalScore);

		
		//최고점수
		for (String temp : set) {
			maxScore = maxScore > map.get(temp) ? maxScore : map.get(temp);
		}
		System.out.println("최고점수: " + maxScore);
		//아래거 할거면 이건 안해도 되겠네
		
		//최고점수를 받은 아이디
		for (String temp : set) {
			if (maxScore > map.get(temp)) {
			} else {
				name = temp;
				maxScore = map.get(temp);
				// map.get(temp)를 value라는 하나의 변수로 두는것도 간편함
			}
		}
		System.out.println("최고점수를 받은 아이디: " + name);
		
		
		
		//entrySet으로 하는법
		
		name = null;
		maxScore = 0;
		totalScore = 0;
		for (Entry<String, Integer> entry : map.entrySet()) {
			totalScore += entry.getValue();
			
			if(entry.getValue() > maxScore) {
				maxScore = entry.getValue();
				name = entry.getKey();
			}
		}
		System.out.println(totalScore/map.size());
		System.out.println(maxScore);
		System.out.println(name);
		
	}
}
