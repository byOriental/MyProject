package javase.foundation;
/**
 * 
*@Title:Operator
*@Description:�������������ϵ�������������������߼��������λ�����
*@author:Administrator
*@date:2017��8��12�� ����11:57:39
 */
public class Operator {

	public static void main(String[] args) {
		int x=2;
		int y=5;
		
		int m=3;//00000000 00000000 00000000 00000011
		int n=6;//00000000 00000000 00000000 00000110
		boolean a=true;
		boolean b=false;
		
		//��ϵ�����
		System.out.println("y/x:"+(y%x));//+��-��*���������
		if((y-x)>0){//>��<��==��ϵ�����,����ֵ��Ϊtrue �� false
			System.out.println("hello world!!!");
		}
		System.out.println("x<y:"+(x<y));
		
		//���������
		System.out.println("x++="+(x++));//�ȸ�ֵ������
		System.out.println("++y="+(++y));//�������ٸ�ֵ
		
		//�߼������
		System.out.println("a&&b="+(a&&b));//�����㣬ͬ��Ϊ��
		System.out.println("a||b="+(a||b));//�����㣬ͬ��Ϊ��
		
		//λ�����
		System.out.println("m&n="+(m&n));
		System.out.println("m|n="+(m|n));
		System.out.println("m^n="+(m^n));
		
		// TODO Auto-generated method stub

	}

}
