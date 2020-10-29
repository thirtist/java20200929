package a.home_work;

public class Cat extends Animal {
	protected String cry;
	protected String kind;
	
	protected static String ab;
	
	public Cat(String name) {
		super.setName(name);
		this.kind = "고양이";
		this.cry = "야옹야옹";
	}
	
	
	
	@Override
	protected void desc() {
		System.out.println(this.kind+" 이름은 "+super.name+" 입니다. "+this.cry+" 하면서 짓지요");
	}
}

