package javase.generics;

/**
 * 
 * @Title:Info
 * @Description:ͨ������շ��Ͷ���
 * @author:Administrator
 * @date:2017��9��13�� ����1:32:44
 */
class Info<T> {
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	public String toString() {// ��дObject��toString����
		return this.var.toString();
	}
}

public class GenericsDemo02 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>();
		i.setVar("java");
		fun(i);// ����һ������

	}

	public static void fun(Info<?> temp) {
		System.out.println("��Ϣ��" + temp);
	}

}
