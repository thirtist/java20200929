package chap15.textbook.exercises.p08;

public class Student {

	public int studentNum;
	public String name;

	public Student(int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
////		if (name == null) {
////			if (other.name != null)
////				return false;
////		} else if (!name.equals(other.name))
////			return false;
//		if (studentNum != other.studentNum)
//			return false;
//		return true;
//	}

//	수동으로도 작성연습해보기
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return student.studentNum == this.studentNum;
		} else {
			return false;
		}
	}

}
