package javase.obj.advanced;

/**
 * 
*@Title:WrapperDemo01
*@Description:�Զ��������Զ�װ��
*@author:Administrator
*@date:2017��9��13�� ����11:16:01
 */
public class WrapperDemo01 {

	public static void main(String[] args) {
		int a = 7;
		Integer a1= new Integer(7);//װ��
		int b=a1.intValue();//����
		if(a==b){
			System.out.println("a����bֵ");
		}

	}

}
