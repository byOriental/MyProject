package javase.generics;

/**
 * 
*@Title:Infomt
*@Description:�������ޣ�����
*@author:Administrator
*@date:2017��9��12�� ����8:39:18
 */
class Infomt<T>{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	public String toString(){//��дObject��toString����
		return this.var.toString();
	}
}
public class GenericsDemo04 {
	public static void main(String[] args) {
		Infomt<Object> i1=new Infomt<Object>();
		Infomt<String> i2=new Infomt<String>();
		i1.setVar(new Object());
		i2.setVar("����");
		fun(i1);
		//fun(i2);
	}
	public static void fun(Infomt<Object> i1){
		System.out.println("���ݣ�"+i1);
	}

}
