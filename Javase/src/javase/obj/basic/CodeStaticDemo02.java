package javase.obj.basic;

/**
 * 
*@Title:CodeStaticDemo02
*@Description:单例模式——对象实例私有化
*@author:Administrator
*@date:2017年8月28日 下午12:56:01
 */
class InstanceDemo{
	//将对象实例私有化，通过静态方法与其他对象进行通信
	private static InstanceDemo instance=new InstanceDemo();
	
	public static InstanceDemo getInstanceDemo(){
		return instance;
	}
	public void print(){
		System.out.println("helloworld!!!");
	}
	
}
public class CodeStaticDemo02 {
	public static void main(String args[]){
		InstanceDemo instance=InstanceDemo.getInstanceDemo();
		instance.print();
	}

}
