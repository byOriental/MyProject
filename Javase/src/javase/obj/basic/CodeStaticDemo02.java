package javase.obj.basic;

/**
 * 
*@Title:CodeStaticDemo02
*@Description:����ģʽ��������ʵ��˽�л�
*@author:Administrator
*@date:2017��8��28�� ����12:56:01
 */
class InstanceDemo{
	//������ʵ��˽�л���ͨ����̬�����������������ͨ��
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
