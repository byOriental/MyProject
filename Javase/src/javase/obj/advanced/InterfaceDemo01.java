package javase.obj.advanced;

/**
 * 
*@Title:X
*@Description:�ӿڡ����ӿ�������Ϊȫ��final������Ϊ���󷽷����ӿڿ��Ի���̳У����󷽷�����
*�̳нӿ�
*@author:Administrator
*@date:2017��8��28�� ����3:15:43
 */
interface X{
	public static final String COUNTRY="SHANGHAI";
	public abstract void printX(); 
}
interface Y{
	public static final String SEX="MAN";
	public abstract void printY();
}
class Z implements X,Y{
	public void printX(){
		System.out.println("COUNTRY:"+COUNTRY);
	}
	public void printY(){
		System.out.println("SEX:"+SEX);
	}
}
public class InterfaceDemo01 {

	public static void main(String[] args) {
		Z z=new Z();
		z.printX();
		z.printY();
	}

}
