package javase.reflect;

interface Worker {
	public static final String NAME = "baiyang";
	public static final String ADDRESS = "china";

	public void info();

	public String say(String name, int age);

}

public class reflectDemo03 implements Worker {
	private String name;
	private int age;

	public reflectDemo03() {

	}

	public reflectDemo03(String name) {
		this.name = name;
	}

	public reflectDemo03(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public void info() {
		System.out.println("姓名：" + NAME + ",地址：" + ADDRESS);
	}

	public String say(String name, int age) {
		return name + "你好，2018愿你心想事成——" + ADDRESS + "，" + age + "岁";

	}

}
