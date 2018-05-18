package javase.generics;

/**
 * 
 * @Title:Infom
 * @Description:泛型上限-使用的类只能在指定类的子类范围使用
 * @author:Administrator
 * @date:2017年9月12日 下午7:48:47
 */
class Infom<T> {
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

public class GenericsDemo03 {

	public static void main(String[] args) {
		Infom<Integer> itg = new Infom<Integer>();
		Infom<Float> fl = new Infom<Float>();
		itg.setVar(89);
		fl.setVar(889.9f);
		fun(itg);
		fun(fl);
	}

	public static void fun(Infom<? extends Number> temp) {
		System.out.println("numbers:" + temp);
	}

}
