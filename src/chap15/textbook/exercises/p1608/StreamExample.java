package chap15.textbook.exercises.p1608;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StreamExample {
	static class Member {
		private String name;
		private String job;

		public Member(String name, String job) {
			super();
			this.name = name;
			this.job = job;
		}

		public String getName() {
			return name;
		}

		public String getJob() {
			return job;
		}
	}

	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", "개발자"),
				new Member("김나리", "디자이너"),
				new Member("신용권", "개발자")
				);

		Map<String, List<String>> groupingMap = new HashMap<>();
		// 작성위치
		
//		List<String> lis= new ArrayList<String>();  
//		for (Member map : list) {
//			lis.add(map.getName());
//			groupingMap.put(map.getJob(),lis);
//		} //못함
		
		for (Member member : list) {
			String name = member.getName();
			String job = member.getJob();
			
			List<String> names = groupingMap.get(job); 	 //와 이걸 어떻게 바로 적용하지  //잡, List<이름> 형식이라서 잡을 통해서 List이름 변수에 넣음..
			if( names ==null) {									//List가 없으면 새로운 리스트를 만들어서 넣음
				List<String> newList = new ArrayList<>();
				newList.add(name);
				groupingMap.put(job, newList);					//만든걸 그룹핑에 넣음
			} else {
				names.add(name);								//이미 존재하면 그 리스트에 name을 넣음
			}
		}
		
		
		
		// 출력
		List<String> developers = groupingMap.get("개발자");
		List<String> designers = groupingMap.get("디자이너");
		
		System.out.print("[개발자]");
		for (String name : developers) {
			System.out.print(" " + name);
		}
		System.out.println();
		
		System.out.print("[디자이너]");
		for (String name : designers) {
			System.out.print(" " + name);
		}
	}

}
