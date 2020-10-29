package a.home_work;

public class Dog extends Animal {
	protected String cry;
	protected String kind;

	public Dog(String name) {
		super.setName(name);
		this.kind = "강아지";
		this.cry = "멍멍";
	}

	@Override
	protected void desc() {
		System.out.println(this.kind + " 이름은 " + super.name + " 입니다. " + this.cry + " 하면서 짓지요");
	}
}
