package javase.annotation;

class OverRd {
	public void print() {
		System.out.println("���ࡪ����������");
	}
}

class OverRd1 extends OverRd {
	// �ڽ�Annotation���࣬����ֱ��ʹ��
	@Override
	public void print() {
		System.out.println("���ࡪ����������������������");
	}
}

public class OverrideDemo {

	public static void main(String[] args) {
		new OverRd1().print();
	}

}
