package javase.obj.advanced;

/**
 * 
*@Title:AbstractDemo01
*@Description:Abstract������ 
*@author:Administrator
*@date:2017��8��28�� ����2:22:40
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
	public abstract void print();//û�з�����
}
class B extends A{
	public void print(){//ʵ�ֳ��󷽷�
		System.out.println("country:"+FLAG+"\n"+"name:"+super.getName());
	}
}
public class AbstractDemo01 {

	public static void main(String[] args) {
		B b=new B();
		b.print();
	}
}
