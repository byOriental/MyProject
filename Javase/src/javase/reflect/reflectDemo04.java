package javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 
 * @Title:reflectDemo04
 * @Description:基类reflectDemo03.
 * @author:Administrator
 * @date:2018年2月1日 下午2:21:38
 */

public class reflectDemo04 {
	public static void main(String args[]) {
		// 通过反射取得该类的具体信息——接口名称
		Class<?> cl = null;
		try {
			cl = Class.forName("javase.reflect.reflectDemo03");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> itf[] = cl.getInterfaces();
		for (int i = 0; i < itf.length; i++) {
			System.out.println("实现接口：" + itf[i].getName());
		}
		// 通过反射取得该类的具体信息——父类
		Class<?> sp = cl.getSuperclass();
		System.out.println("父类信息：" + sp.getName());

		// 通过反射取得该类的具体信息——全部构造方法
		Constructor<?> cstr[] = cl.getConstructors();
		for (int i = 0; i < cstr.length; i++) {
			System.out.println("所有构造方法：" + cstr[i]);
		}
		// 通过反射调用类中方法
		try {
			Method met1 = cl.getMethod("info");
			Method met2 = cl.getMethod("say", String.class, int.class);
			met1.invoke(cl.newInstance());
			String string = null;
			string = (String) met2.invoke(cl.newInstance(), "baiyang", 28);
			System.out.println(string);
		} catch (Exception e) {
		}

	}
}
