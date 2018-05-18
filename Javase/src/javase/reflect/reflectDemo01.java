package javase.reflect;

/**
 * �ڿ��Spring/Struts���г���ʹ�÷��䴦�����
 * 
 * 1�������ࣨClass��ʵ����ÿһ���඼�С���Class���ʵ����������Ľṹ�������ṩ�˵��ô����Ա�Ľӿڡ�
 * 2���౻����֮��jvm�Ѿ������һ��������ṹ��Classʵ�������ǻ���Ҫ�������ʼ������֮���������ʹ�ô��ࡣ
 * 
 * 
 * @Title:ClassDemo01
 * @Description:���䡪��ͨ��һ�������ҵ�һ����&ͨ��Class���newInstance����ʵ��������
 * @author:Administrator
 * @date:2017��9��14�� ����9:13:55
 */
class Class1 {
	public void print() {
		System.out.println("���䡪����������");
	}
}

public class reflectDemo01 {

	public static void main(String[] args) {
		Class<?> cl = null;
		try {
			cl = Class.forName("javase.reflect.Class1");// ʵ�����࣬��Class���ʵ����������Ľṹ
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class1 cls = null;
		try {
			cls = (Class1) cl.newInstance();// ���޲ι��췽����ת����Ϊ������ȫȡ��new������ʽ��ǰ�᣺��һ���޲������췽��
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		// System.out.println(cl.getName());
		cls.print();
	}

}
