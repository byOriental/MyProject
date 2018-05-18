package javase.generics;

/**
 * 
 * @Title:GenericInfo
 * @Description:泛型-泛型方法、返回泛型类对象
 * @author:Administrator
 * @date:2017年9月12日 下午8:49:11
 */
class GenericInfo<T extends Number> {
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}

	public String toString() {
		return this.var.toString();
	}
}

public class GenericsDemo05 {

	public static void main(String[] args) {
		GenericInfo<Integer> i = fun(365);
		System.out.println(i.getVar());
	}

	// 方法泛型基本格式[访问权限] <泛型标识>泛型标识 方法名（[泛型标识] 参数名称）
	public static <T extends Number> GenericInfo<T> fun(T tp) {
		GenericInfo<T> gn = new GenericInfo<T>();
		gn.setVar(tp);
		return gn;
	}

}
