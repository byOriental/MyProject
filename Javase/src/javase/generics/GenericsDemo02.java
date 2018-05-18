package javase.generics;

/**
 * 
 * @Title:Info
 * @Description:通配符接收泛型对象
 * @author:Administrator
 * @date:2017年9月13日 下午1:32:44
 */
class Info<T> {
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	public String toString() {// 覆写Object的toString方法
		return this.var.toString();
	}
}

public class GenericsDemo02 {

	public static void main(String[] args) {
		Info<String> i = new Info<String>();
		i.setVar("java");
		fun(i);// 传递一个对象

	}

	public static void fun(Info<?> temp) {
		System.out.println("信息：" + temp);
	}

}
