package javase.obj.advanced;

/**
 * 
*@Title:ObjectDemo01
*@Description:�ӿڶ�̬Ӧ��
*@author:Administrator
*@date:2017��9��9�� ����3:24:48
 */
interface ObjItf{
	public void print();
}
class ObjItfCl implements ObjItf{
	public void print(){
		System.out.println();
	}
}
public class ObjectDemo01 {

	public static void main(String[] args) {
		ObjItf obj1=new ObjItfCl();//����ת��
		Object obj=obj1;//����ת��
		ObjItf obj2=(ObjItf)obj;//����ת��
		obj2.print();
	}

}
