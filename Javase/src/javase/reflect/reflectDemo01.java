package javase.reflect;

/**
 * 在框架Spring/Struts等中常常使用反射处理机制
 * 
 * 1、加载类（Class）实例，每一个类都有。此Class类的实例描述了类的结构，并且提供了调用此类成员的接口。
 * 2、类被加载之后，jvm已经获得了一个描述类结构的Class实例。但是还需要进行类初始化操作之后才能正常使用此类。
 * 
 * 
 * @Title:ClassDemo01
 * @Description:反射——通过一个对象找到一个类&通过Class类的newInstance方法实例化对象
 * @author:Administrator
 * @date:2017年9月14日 下午9:13:55
 */
class Class1 {
	public void print() {
		System.out.println("反射——————");
	}
}

public class reflectDemo01 {

	public static void main(String[] args) {
		Class<?> cl = null;
		try {
			cl = Class.forName("javase.reflect.Class1");// 实例化类，此Class类的实例描述了类的结构
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class1 cls = null;
		try {
			cls = (Class1) cl.newInstance();// （无参构造方法）转换成为对象，完全取代new操作方式，前提：有一个无参数构造方法
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		// System.out.println(cl.getName());
		cls.print();
	}

}
