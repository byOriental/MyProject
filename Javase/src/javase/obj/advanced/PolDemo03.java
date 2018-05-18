package javase.obj.advanced;
/**
 * 
*@Title:PolDemo03
*@Description:通过子类实例化接口、抽象类
*@author:Administrator
*@date:2017年8月28日 下午10:53:06
 */
abstract class F{
	public abstract void print();
}
interface K{
	abstract void print();
}
class H extends F{
	public void print(){
		System.out.println("+++++继承抽象类++++++");
	}
}
class J implements K{
	public void print(){
		System.out.println("+++++++实现接口++++++");
	}
}
public class PolDemo03 {
	public static void main(String args[]){
		F f=new H();
		f.print();
		K k=new J();
		k.print();
	}

}
