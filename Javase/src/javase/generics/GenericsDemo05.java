package javase.generics;

/**
 * 
 * @Title:GenericInfo
 * @Description:����-���ͷ��������ط��������
 * @author:Administrator
 * @date:2017��9��12�� ����8:49:11
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

	// �������ͻ�����ʽ[����Ȩ��] <���ͱ�ʶ>���ͱ�ʶ ��������[���ͱ�ʶ] �������ƣ�
	public static <T extends Number> GenericInfo<T> fun(T tp) {
		GenericInfo<T> gn = new GenericInfo<T>();
		gn.setVar(tp);
		return gn;
	}

}
