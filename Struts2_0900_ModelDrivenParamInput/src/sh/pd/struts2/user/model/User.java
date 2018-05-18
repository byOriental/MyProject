package sh.pd.struts2.user.model;

public class User {
	private String name;
	private int age;

	// modelDriven前提是有一个无参构造方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
