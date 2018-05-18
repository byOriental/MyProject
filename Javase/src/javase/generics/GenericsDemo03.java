package javase.generics;

/**
 * 
 * @Title:Infom
 * @Description:��������-ʹ�õ���ֻ����ָ��������෶Χʹ��
 * @author:Administrator
 * @date:2017��9��12�� ����7:48:47
 */
class Infom<T> {
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
