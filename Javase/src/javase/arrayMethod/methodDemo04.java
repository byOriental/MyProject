package javase.arrayMethod;

/**
 * 
*@Title:methodDemo04
*@Description:return�����жϣ�����break�ж�ѭ����
*@author:Administrator
*@date:2017��8��14�� ����1:37:36
 */
public class methodDemo04 {

	public static void main(String[] args) {
		System.out.println("����ʼ������������������������������������");
		method(99,99);
	    System.out.println("�����������������������������������������������");

	}

	private static void method(int i, int j) {
		int temp;
		temp=i+j;
		System.out.println("������ʼ��������������������������������");
		if(temp==198){
			return;//��������������
		}
		System.out.println("����������������������������������������");
		
	}

}
