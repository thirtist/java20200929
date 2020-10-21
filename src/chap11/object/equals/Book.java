package chap11.object.equals;

public class Book {
	private int barCode;
	
	public Book(int barCode) {
		this.barCode = barCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)     //참조값이 같은지
			return true;
		if (obj == null)     //obj가 null이면 비교불가
			return false;
		if (getClass() != obj.getClass())   //getClass()는 runtimeclass를 리턴해줌->두 클래스가 같은 타입인지
			return false;
		Book other = (Book) obj;            //위에서 같은 타입이라고 판명나면 강제형변환 가능
		if (barCode != other.barCode)       //형변환된 인스턴스 필드끼리 비교해서 아니면 false가 리턴됨
			return false;
		return true;
	}
	
//	@Override
//	public int hashCode() {
//		return barCode;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		Book o = (Book) obj;
//		return this.barCode == o.barCode;
//	}
	
	
	
}
