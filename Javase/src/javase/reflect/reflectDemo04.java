package javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * 
 * @Title:reflectDemo04
 * @Description:����reflectDemo03.
 * @author:Administrator
 * @date:2018��2��1�� ����2:21:38
 */

public class reflectDemo04 {
	public static void main(String args[]) {
		// ͨ������ȡ�ø���ľ�����Ϣ�����ӿ�����
		Class<?> cl = null;
		try {
			cl = Class.forName("javase.reflect.reflectDemo03");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> itf[] = cl.getInterfaces();
		for (int i = 0; i < itf.length; i++) {
			System.out.println("ʵ�ֽӿڣ�" + itf[i].getName());
		}
		// ͨ������ȡ�ø���ľ�����Ϣ��������
		Class<?> sp = cl.getSuperclass();
		System.out.println("������Ϣ��" + sp.getName());

		// ͨ������ȡ�ø���ľ�����Ϣ����ȫ�����췽��
		Constructor<?> cstr[] = cl.getConstructors();
		for (int i = 0; i < cstr.length; i++) {
			System.out.println("���й��췽����" + cstr[i]);
		}
		// ͨ������������з���
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
