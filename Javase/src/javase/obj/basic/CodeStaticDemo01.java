package javase.obj.basic;

/**
 * 
*@Title:StaticDemo
*@Description:����飺���ྲ̬����>��̬��>�����>���췽��
*@author:Administrator
*@date:2017��8��28�� ����12:50:07
 */

class StaticDemo{
	{
		System.out.println("�����");//3
	}
	public StaticDemo(){
		System.out.println("���췽��");//4
	}
	static{
		System.out.println("��̬��");//2
	}
	
}
public class CodeStaticDemo01 {
	static{
		System.out.println("��������_��̬��"); //����ִ��1
	}

	public static void main(String[] args) {
		StaticDemo staticDemo=new StaticDemo();
		// TODO Auto-generated method stub

	}

}
