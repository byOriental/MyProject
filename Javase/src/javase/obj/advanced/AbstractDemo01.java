package javase.obj.advanced;

/**
 * 
*@Title:AbstractDemo01
*@Description:Abstract抽象类 
*@author:Administrator
*@date:2017年8月28日 下午2:22:40
 */
abstract class A{ 
	public static final String FLAG="CHINA";
	private String name="jake";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void print();//没有方法体
}
class B extends A{
	public void print(){//实现抽象方法
		System.out.println("country:"+FLAG+"\n"+"name:"+super.getName());
	}
}
public class AbstractDemo01 {

	public static void main(String[] args) {
		B b=new B();
		b.print();
	}
}
