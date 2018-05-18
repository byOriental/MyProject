package javase.annotation;

class OverRd {
	public void print() {
		System.out.println("父类——————");
	}
}

class OverRd1 extends OverRd {
	// 内建Annotation的类，可以直接使用
	@Override
	public void print() {
		System.out.println("子类————————————");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		new OverRd1().print();
	}

}
