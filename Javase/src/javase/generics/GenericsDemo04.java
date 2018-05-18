package javase.generics;

/**
 * 
*@Title:Infomt
*@Description:泛型下限（）？
*@author:Administrator
*@date:2017年9月12日 下午8:39:18
 */
class Infomt<T>{
	private T var;

	public T getVar() {
		return var;
	}

	public void setVar(T var) {
		this.var = var;
	}
	public String toString(){//覆写Object的toString方法
		return this.var.toString();
	}
}
public class GenericsDemo04 {
	public static void main(String[] args) {
		Infomt<Object> i1=new Infomt<Object>();
		Infomt<String> i2=new Infomt<String>();
		i1.setVar(new Object());
		i2.setVar("北京");
		fun(i1);
		//fun(i2);
	}
	public static void fun(Infomt<Object> i1){
		System.out.println("内容："+i1);
	}

}
