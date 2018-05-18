package sh.pd.struts2.user.action;

public class Dog {

	private String name;

	public Dog() {
		System.out.println("dog的构造方法！");
	}

	public Dog(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "dog: " + name;
	}
}
