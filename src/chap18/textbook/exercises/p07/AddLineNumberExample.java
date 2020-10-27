package chap18.textbook.exercises.p07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "src/chap18/textbook/exercises/p07/AddLineNumberExample.java";

		Reader r = new FileReader(filePath);
		BufferedReader br = new BufferedReader(r); // 체인 스트림에 대한 마지막것만 닫아도 되긴함(이클립스가 이전것도 닫아야한다고 잡아주진않음)
												   // 좋은 습관은 이전것도 닫아야하는데 까먹고 안닫을 수 있으니 주의(괜찮을수도 있지만 닫는게 좋긴함)
		
		Writer w = new FileWriter("AddLineNumberExample");
		BufferedWriter bw = new BufferedWriter(w);
		 
		int linenumber = 0;
		String line;
		
		while ((line = br.readLine()) != null) {
			linenumber++;
			bw.write(linenumber+":" + line +"\t\n"); //실수했던점 br.readLine()을 변수 line에 넣었어야 하는데 둘다 br.readline()을 해버려서 한칸씩 띄고 읽어졌었음
			//.write대신에 .newline으로 하면 \n필요없이 사용할 수 있다(줄바꿔서 넣어주는 메소드!!)
			System.out.print(linenumber+":" + line +"\t\n");
		}
		
		br.close();
		r.close(); //이클립스가 잡아 주진 않지만 닫는게 좋은습관
		bw.flush();
		bw.close();
		w.close(); //이클립스가 잡아 주진 않지만 닫는게 좋은습관
		
	}
}
