package javase.obj.advanced;
/**
 * 
*@Title:PolDemo05
*@Description:�ӿ�ָ����׼�������ԡ���ӡ����u�̣��ص㣩
*@author:Administrator
*@date:2017��8��28�� ����11:40:54
 */
interface USB{
	public abstract void start();
	public abstract void stop();
}
class Computer{
	public static void plugin(USB usb){//�˴�����ľ�̬�����൱������������ľ�̬��������������������е�����
		usb.start();//���õķ���Ϊ���า�Ǹ���ķ���
		usb.stop();
	}
}
class Flash implements USB{
	public void start(){
		System.out.println("U�̿�ʼ����+++++++++");
	}
	public void stop(){
		System.out.println("U��ֹͣ����+++++++++");
	}
}
class Print implements USB{
	public void start(){
		System.out.println("��ӡ����ʼ����+++++++++");
	}
	public void stop(){
		System.out.println("��ӡ��ֹͣ����+++++++++");
	}
}
public class Interfacestandard {
	public static void main(String args[]){
		Computer.plugin(new Flash());
		System.out.println("---------------�ָ���-------------");
		Computer.plugin(new Print());
	}

}
