package javase.obj.advanced;

/**
 * 
*@Title:X
*@Description:接口——接口中属性为全局final、方法为抽象方法，接口可以互相继承，抽象方法可以
*继承接口
*@author:Administrator
*@date:2017年8月28日 下午3:15:43
 */
interface X{
	public static final String COUNTRY="SHANGHAI";
	public abstract void printX(); 
}
interface Y{
	public static final String SEX="MAN";
	public abstract void printY();
}
class Z implements X,Y{
	public void printX(){
		System.out.println("COUNTRY:"+COUNTRY);
	}
	public void printY(){
		System.out.println("SEX:"+SEX);
	}
}
public class InterfaceDemo01 {

	public static void main(String[] args) {
		Z z=new Z();
		z.printX();
		z.printY();
	}

}
